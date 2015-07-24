/**
* <p>Title: Weixin.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2015</p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Jul 24, 2015
* @version 1.0
*/

package com.gaoxy.lifeinusa.weixin;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import com.gaoxy.lifeinusa.services.WeixinServiceImpl;
import com.gaoxy.lifeinusa.weixin.msgentity.WXMsg;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.mapper.MapperWrapper;



/**
 * <p>
 * Title: Weixin
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Company: gaoxy
 * </p>
 * 
 * @author steven.gaoxy
 * @date Jul 24, 2015
 */
public class Weixin {
	private static final Logger logger = LoggerFactory.getLogger(Weixin.class);

	
	@SuppressWarnings("unchecked")
	public static <T> T fromXml(String xmlStr, Class<T> cls) {
//		// 注意：不是new Xstream(); 否则报错：java.lang.NoClassDefFoundError:
//		// org/xmlpull/v1/XmlPullParserFactory
//		XStream x=null;
//		try {
//			x = XStreamUtils.getXstream(Class.forName(classname));
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		XStream x = new XStream() {
		    @Override
		    protected MapperWrapper wrapMapper(MapperWrapper next) {
		        return new MapperWrapper(next) {
		            @Override
		            public boolean shouldSerializeMember(Class cls, String fieldName) {
		                if (cls == Object.class) {
		                    return false;
		                }
		                return super.shouldSerializeMember(cls, fieldName);
		            }
		        };
		    }
		};
		x.alias("xml", cls);
		return  (T) x.fromXML(xmlStr);
		
		
		

	}

	/**
	 * @param o
	 * @return
	 */
	public static String toXml(Object o) {
		XStream x = new XStream();
		// XStream xstream=new XStream(new DomDriver()); //直接用jaxp dom来解释
		// XStream xstream=new XStream(new DomDriver("utf-8"));
		// //指定编码解析器,直接用jaxp dom来解释
		// 如果没有这句，xml中的根元素会是<包.类名>；或者说：注解根本就没生效，所以的元素名就是类的属性
		x.processAnnotations(o.getClass()); // 通过注解方式的，一定要有这句话
		return x.toXML(o);

	}

	/**
	 * @param inputStr
	 * @param class1
	 * @return
	 */


}
