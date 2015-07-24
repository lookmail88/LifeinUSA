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

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gaoxy.lifeinusa.services.WeixinServiceImpl;
import com.gaoxy.lifeinusa.system.Printer;
import com.gaoxy.lifeinusa.weixin.msgentity.WXMsgEvent;
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
		
		logger.debug("------>>msg type="+msg.getCreateTime());
		Printer.printEntity("com.gaoxy.lifeinusa.weixin.msgentity.WXMsg", msg);
	
	}
	@Test
	public void bean2xmlTest(){
		WXMsgEvent msg=(WXMsgEvent) new WXMsgEvent();
		msg.setCreateTime("1111111");
		msg.setFromUserName("gaoxy");
		msg.setMsgType("event");
		msg.setToUserName("woilmm");
		msg.setEvent("event");
		
		Object o=msg;
		String s=Weixin.toXml(o);
		logger.debug("------>>"+ s);
		
	}

}
