/**
* <p>Title: WeixinTest.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2015</p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Jul 24, 2015
* @version 1.0
*/

package com.gaoxy.lifeinusa.weixin;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gaoxy.lifeinusa.services.WeixinServiceImpl;
import com.gaoxy.lifeinusa.system.tool.Printer;
import com.gaoxy.lifeinusa.weixin.msgentity.WXMsgEvent;
import com.gaoxy.lifeinusa.weixin.msgentity.WXMsgImageText;
import com.gaoxy.lifeinusa.weixin.msgentity.WXMsgText;
import com.gaoxy.lifeinusa.weixin.msgentity.Item;
import com.gaoxy.lifeinusa.weixin.msgentity.WXMsg;


/**
* <p>Title: WeixinTest</p>
* <p>Description: </p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Jul 24, 2015
*/
public class WeixinTest {
	private static final Logger logger = LoggerFactory.getLogger(WeixinTest.class);
	@Test
	public void Msg2BeanTest() {
		String inputStr="<xml><ToUserName><![CDATA[gh_20da09915865]]>"
				+ "</ToUserName><FromUserName><![CDATA[ogXCLuGnLVtbYtGEQNeljVANq1qY]]></FromUserName>"
				+ "<CreateTime>1437724767</CreateTime>"
				+ "<MsgType><![CDATA[event]]></MsgType>"
				+ "<Event><![CDATA[subscribe]]></Event>"
				+ "<EventKey><![CDATA[]]></EventKey>"
				+"</xml>";
	 
		 WXMsg msg = Weixin.fromXml(inputStr,com.gaoxy.lifeinusa.weixin.msgentity.WXMsg.class);
		
		logger.debug("------>>msg type="+msg.getFromUserName());
		
	}
	
	@Test
	public void WXMsgEvent2xmlTest(){
		WXMsgEvent msg= new WXMsgEvent();
		msg.setCreateTime("1111111");
		msg.setFromUserName("gaoxy");
	//	msg.setMsgType("event");
		msg.setToUserName("woilmm");
		msg.setEvent("event");
		
		Object o=msg;
		String s=Weixin.toXml(o);
		logger.debug("------>>WXMsgEvent2xmlTest()\n"+ s);
		
	}
	
	@Test
	public void WXMsgImageText2xmlTest(){
		WXMsgImageText msg=(WXMsgImageText) new WXMsgImageText();
		msg.setCreateTime("1111111");
		msg.setFromUserName("gaoxy");
		//msg.setMsgType("imageText");
		msg.setToUserName("woilmm");
		
		Item it=new Item();
		it.setDescription("abc");
		it.setTitle("test ImageText");
		it.setUrl("http://www.google.com");
		it.setPicUrl("http://www.google.com/images/001.png");
		
		Item it2=new Item();
		it2.setDescription("abc");
		it2.setTitle("test ImageText");
		it2.setUrl("http://www.google.com");
		it2.setPicUrl("http://www.google.com/images/001.png");
		
		ArrayList al=new ArrayList();
		al.add(it);	
		al.add(it2);
		msg.setArticles(al);
			
		String s=Weixin.toXml(msg);
		logger.debug("------>>WXMsgImageText2xmlTest()\n"+ s);
		
	}
	

	@Test
	public void WXMsgText2xmlTest(){
		WXMsgText msg=new WXMsgText();
		msg.setCreateTime("1111111");
		msg.setFromUserName("gaoxy");
	//	msg.setMsgType("event");
		msg.setToUserName("woilmm");
		msg.setContent("hello world");
				
		String s=Weixin.toXml(msg);
		logger.debug("------>>WXMsgText2xmlTest()\n"+ s);
		
	}

}
