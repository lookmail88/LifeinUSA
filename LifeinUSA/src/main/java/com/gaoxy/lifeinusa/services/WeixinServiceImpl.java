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

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.gaoxy.lifeinusa.controller.WinxinController;
import com.gaoxy.lifeinusa.weixin.MySecurity;
import com.gaoxy.lifeinusa.weixin.Weixin;


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
	
	/* (non-Javadoc)
	 * @see com.gaoxy.lifeinusa.services.WeixinService#getReturnMsg(java.lang.String, javax.servlet.http.HttpServletRequest)
	 */
	@Override
	public String getReturnMsg(String appid, HttpServletRequest request) {
		String re="";
		// TODO Auto-generated method stub
		
		if(request.getMethod().equalsIgnoreCase("get")){
			logger.debug("------>>get http request by get method");
			this.Request=request;
			this.Appid=appid;
			re=this.doget();
		}else 
		if(request.getMethod().equalsIgnoreCase("post")){
			logger.debug("------>>get http request by post method");
			this.Request=request;
			this.Appid=appid;
			re=this.dopost();
			
		}
		
		return re;
	}

	/**
	 * 处理微信服务器验证
	 * 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	private String doget(){
		String re="";
		
		String timestamp="";
		if(this.Request.getParameter("timestamp")!=null)timestamp=this.Request.getParameter("timestamp");
		
		String nonce="";
		if(this.Request.getParameter("nonce")!=null)nonce=this.Request.getParameter("nonce");
		
		String echostr="";
		if(this.Request.getParameter("echostr")!=null)echostr=this.Request.getParameter("echostr");
		
		String signature="";
		if(this.Request.getParameter("signature")!=null)signature=this.Request.getParameter("signature");
		
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
		} 
		
		return re;
	}
	
	
	/**
	 * 处理微信服务器发过来的各种消息，包括：文本、图片、地理位置、音乐等等
	 * 
	 * 
	 */
	private String dopost(){
		String re="";
		
		String timestamp="";
		if(this.Request.getParameter("timestamp")!=null)timestamp=this.Request.getParameter("timestamp");
		
		String nonce="";
		if(this.Request.getParameter("nonce")!=null)nonce=this.Request.getParameter("nonce");
		
		String signature="";
		if(this.Request.getParameter("signature")!=null)signature=this.Request.getParameter("signature");
		
			
		
		
		logger.debug("------>>timestamp="+timestamp);
		logger.debug("------>>nonce="+nonce);
		logger.debug("------>>signature="+signature);
		
		
		
		return re;
		
	}
	
	


}
