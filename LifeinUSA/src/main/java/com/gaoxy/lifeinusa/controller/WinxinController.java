/**
* <p>Title: WinxinController.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2015</p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Jul 23, 2015
* @version 1.0
*/

package com.gaoxy.lifeinusa.controller;

import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import org.weixin4j.*;

import com.gaoxy.lifeinusa.services.WeixinService;
import com.gaoxy.lifeinusa.weixin.MySecurity;



/**
* <p>Title: WinxinController</p>
* <p>Description: works for weixin platform, 
* 
* </p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Jul 23, 2015
*/

@Controller
@RequestMapping(value = "/rest/weixin")
public class WinxinController {
	
	private static final Logger logger = LoggerFactory.getLogger(WinxinController.class);
	
	@Autowired
	WeixinService weixinservice;
	
	@RequestMapping(value = "/{appid}")
	@ResponseBody
	public String handleWeixinRequest(@PathVariable String appid,HttpServletRequest request){
		String re=weixinservice.getReturnMsg(appid, request);
		
		logger.debug("------------------------");
		logger.debug("return msg="+re);
		logger.debug("------------------------");
		
		return re;
	}
	
//	@RequestMapping(value = "/{appid}")
//	@ResponseBody
//	public String echoMethod(@PathVariable String appid,
//							 @RequestParam("signature") String signature,
//							 @RequestParam("timestamp") String timestamp,
//							 @RequestParam("nonce") String nonce,
//							 @RequestParam("echostr") String echostr){
//		String rt="";
//		// 重写totring方法，得到三个参数的拼接字符串
//				List<String> list = new ArrayList<String>(3) {
//				private static final long serialVersionUID = 2621444383666420433L;
//					public String toString() {
//						return this.get(0) + this.get(1) + this.get(2);
//					}
//				};
//				list.add(Token);
//				list.add(timestamp);
//				list.add(nonce);
//				Collections.sort(list);// 排序
//				String tmpStr = new MySecurity().encode(list.toString(),
//						MySecurity.SHA_1);// SHA-1加密
//				
//				if (signature.equals(tmpStr)) {
//					rt= echostr;// 请求验证成功，返回随机码
//				} 
//		
//		logger.debug("------------------------");
//		logger.debug("signature="+signature);
//		logger.debug("tmpStr   ="+echostr);
//		logger.debug("return String="+echostr);
//		logger.debug("------------------------");
//		
//		return rt;
//	}
//	
//	@RequestMapping(value = "/{appid}",method=RequestMethod.POST)
//	@ResponseBody
//	public String postMethod(@PathVariable String appid,
//							 @RequestParam("signature") String signature,
//							 @RequestParam("timestamp") String timestamp,
//							 @RequestParam("signature") String nonce,
//							 @RequestBody String requestBody){
//		logger.debug("------------------------");
//		logger.debug("post|"+requestBody);
//		logger.debug("------------------------");
//		
//		
//		
//		
//		
//		return "";
//	}

}
