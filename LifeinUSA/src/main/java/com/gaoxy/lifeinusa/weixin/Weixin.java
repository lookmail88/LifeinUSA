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
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
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
import com.gaoxy.lifeinusa.weixin.msgentity.WXMsgImageText;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.core.util.QuickWriter;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.PrettyPrintWriter;
import com.thoughtworks.xstream.io.xml.XppDriver;
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

	private static final String Token="lifeinusa";
	
	
	@SuppressWarnings("unchecked")
	public static <T> T fromXml(String xmlStr, Class<T> cls) {
 	
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
		 final String PREFIX_CDATA="<";
		 final String SUFFIX_CDATA=">";
		
		XStream x = new XStream(new XppDriver() {
			 public HierarchicalStreamWriter createWriter(Writer out) {

			 return new PrettyPrintWriter(out) {

			 protected void writeText(QuickWriter writer, String text) {

			 if (text.startsWith(PREFIX_CDATA)

			 && text.endsWith(SUFFIX_CDATA)) {

			 writer.write(text);

			 } else {

			 super.writeText(writer, text);

			} } }; }; });
		// XStream xstream=new XStream(new DomDriver()); //直接用jaxp dom来解释
		// XStream xstream=new XStream(new DomDriver("utf-8"));
		// //指定编码解析器,直接用jaxp dom来解释
		// 如果没有这句，xml中的根元素会是<包.类名>；或者说：注解根本就没生效，所以的元素名就是类的属性
		x.processAnnotations(o.getClass()); // 通过注解方式的，一定要有这句话
		return x.toXML(o);

	}

	/**
	 * 处理微信服务器验证
	 *
	 * @param inputStr
	 * @param class1
	 * @return
	 *  
	 */
	public static String getVerify (String signature, String timestamp, String nonce, String echostr){
		String re="";
		
		
		logger.debug("------>>timestamp="+timestamp);
		logger.debug("------>>nonce="+nonce);
		logger.debug("------>>echostr="+echostr);
		logger.debug("------>>signature="+signature);
		
		// 重写totring方法，得到三个参数的拼接字符串
		List<String> list = new ArrayList<String>(3) {
		private static final long serialVersionUID = 2621444383666420433L;
			public String toString() {
				return this.get(0) + this.get(1) + this.get(2);
			}
		};
		list.add(Token);
		list.add(timestamp);
		list.add(nonce);
		Collections.sort(list);// 排序
		String tmpStr = new MySecurity().encode(list.toString(),MySecurity.SHA_1);// SHA-1加密
		
		if (signature.equals(tmpStr)) {
			re= echostr;// 请求验证成功，返回随机码
		} else{
			re="";//验证失败，返回空值
		}
		
		return re;

		
	}

}
