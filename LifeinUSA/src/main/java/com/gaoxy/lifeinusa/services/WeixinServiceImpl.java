/**
* <p>Title: WeixinServiceImpl.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2015</p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Jul 23, 2015
* @version 1.0
*/

package com.gaoxy.lifeinusa.services;


import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gaoxy.lifeinusa.dao.TWxAppinfoDAO;
import com.gaoxy.lifeinusa.entities.TWxAppinfo;
import com.gaoxy.lifeinusa.weixin.Weixin;
import com.gaoxy.lifeinusa.weixin.msgentity.Item;
import com.gaoxy.lifeinusa.weixin.msgentity.WXMsg;
import com.gaoxy.lifeinusa.weixin.msgentity.WXMsgImageText;


/**
* <p>Title: WeixinServiceImpl</p>
* <p>Description: </p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Jul 23, 2015
*/
@Service("weixinservice")
public class WeixinServiceImpl implements WeixinService{
	
	private static final Logger logger = LoggerFactory.getLogger(WeixinServiceImpl.class);
	private HttpServletRequest Request;
	private String Appid="";
	private String Token="lifeinusa";
	
	@Autowired
	TWxAppinfoDAO twxappinfodao;
	

	/* (non-Javadoc)
	 * @see com.gaoxy.lifeinusa.services.WeixinService#getServiceReplyMsg(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public String getConfigVerifyMsg(String appid, String signature, String timestamp, String nonce, String echostr) {
		// TODO Auto-generated method stub
		String re="";
		re=Weixin.getVerify( signature,  timestamp,  nonce,  echostr);
		return echostr;
	}


	/* (non-Javadoc)
	 * @see com.gaoxy.lifeinusa.services.WeixinService#getConfigVerifyMsg(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public String getServiceReplyMsg(String appid, String signature, String timestamp, String nonce,
			String requestBody) {
		String re="";
		WXMsg msg=new WXMsg();
		msg=Weixin.fromXml(requestBody, msg.getClass());
		
		if(msg.getMsgType().equalsIgnoreCase("event")){
			logger.debug("------>>\n"+"get weixin event message");
			WXMsgImageText m=new WXMsgImageText();
			m.setFromUserName(msg.getToUserName());
			m.setToUserName(msg.getFromUserName());
			m.setCreateTime(msg.getCreateTime());
			
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
			
			m.setArticleCount("2");
			
			ArrayList ls=new ArrayList();
			ls.add(it);
			ls.add(it2);
			
			m.setArticles(ls);
			
			
			re=Weixin.toXml(m);
			logger.debug("------>>\n"+"get weixin  message, message type is"+re);
		}else{
			logger.debug("------>>\n"+"get weixin  message, message type is"+msg.getMsgType());
			
		}
			
		return re;

	}


	/* (non-Javadoc)
	 * @see com.gaoxy.lifeinusa.services.WeixinService#addNewApp(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public TWxAppinfo addNewApp(String appid, String appname, String appdesc, String appsecret, String servicetype,String username) {
		// TODO Auto-generated method stub
		String id=com.gaoxy.lifeinusa.system.tool.DateUtils.getHexDate();
		String appurl=com.gaoxy.lifeinusa.system.SystemConfig.DomainUrl+"/rest/weixin/"+id;
		String token=java.util.UUID.randomUUID().toString();
		token=token.replaceAll("-","");
		String aeskey=com.gaoxy.lifeinusa.system.tool.StringUtils.randomStr(43);
		
		TWxAppinfo wx=new TWxAppinfo();
		wx.setId(id);
		wx.setAppid(appid);
		wx.setWxname(appname);
		wx.setWxdesc(appdesc);
		wx.setAppsecret(appsecret);
		wx.setServicetype(servicetype);
		wx.setUsername(username);
		// /rest/weixin/appid this is weixin app visit url
		wx.setAppurl(appurl);
		wx.setApptoken(token);
		wx.setEcodingaeskey(aeskey);
		wx.setEncodingtype("2");
		 
		logger.debug("------>>wx user name is "+wx.getUsername());
		
		 twxappinfodao.Insert(wx);
		
		return wx;
	}
	
	


}
