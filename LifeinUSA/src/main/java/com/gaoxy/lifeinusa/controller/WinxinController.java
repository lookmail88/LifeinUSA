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


import com.gaoxy.lifeinusa.services.WeixinService;



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
	
//	@RequestMapping(value = "/{appid}")
//	@ResponseBody
//	public String handleWeixinRequest(@PathVariable String appid,HttpServletRequest request){
//		String re=weixinservice.getReturnMsg(appid, request);
//		
//		logger.debug("------------------------");
//		logger.debug("return msg="+re);
//		logger.debug("------------------------");
//		
//		return re;
//	}
	
	@RequestMapping(value ="/{appid}/")
	@ResponseBody
	public String echoMethod(@PathVariable String appid,
							 @RequestParam("signature") String signature,
							 @RequestParam("timestamp") String timestamp,
							 @RequestParam("nonce") String nonce,
							 @RequestParam("echostr") String echostr){
		logger.debug("------>>\nEnter controller echoMethod");
		String re=weixinservice.getConfigVerifyMsg(appid, signature, timestamp, nonce, echostr);
		
		return re;
	}
	
	@RequestMapping(value = "/{appid}/",method=RequestMethod.POST)
	@ResponseBody
	public String postMethod(@PathVariable String appid,
							 @RequestParam("signature") String signature,
							 @RequestParam("timestamp") String timestamp,
							 @RequestParam("signature") String nonce,
							 @RequestBody String requestBody){
		
		logger.debug("------>>\nEnter controller postMethod");
		logger.debug("------>>\nrequestBody:"+requestBody);
		String re=weixinservice.getServiceReplyMsg(appid, signature, timestamp, nonce,requestBody);
		return re;
	}

	
}
