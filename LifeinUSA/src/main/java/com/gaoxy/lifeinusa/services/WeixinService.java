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

/**
* <p>Title: WeixinService</p>
* <p>Description: </p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Jul 23, 2015
*/
public interface WeixinService {
	public String getReturnMsg(String appid,HttpServletRequest request);
}
