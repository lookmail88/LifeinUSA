/**
* <p>Title: WeixinService.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2015</p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Jul 23, 2015
* @version 1.0
*/

package com.gaoxy.lifeinusa.services;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
* <p>Title: WeixinService</p>
* <p>Description: </p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Jul 23, 2015
*/
public interface WeixinService {
	public String getServiceReplyMsg( String appid,
			 						  String signature,
			                          String timestamp,
			                          String nonce,
			                          String requestBody);
	
	public String getConfigVerifyMsg( String appid,
									  String signature,
									  String timestamp,
									  String nonce,
									  String echostr);

}
