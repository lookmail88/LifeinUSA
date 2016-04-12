/**
  * <p>Title: TimerGetWeixinAccessToken.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2015</p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Jul 27, 2015
* @version 1.0
*/

package com.gaoxy.lifeinusa.system;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;

import org.apache.log4j.Logger;

import com.gaoxy.lifeinusa.system.tool.HttpReader;
import com.gaoxy.lifeinusa.weixin.msgentity.WXMsgAccesstoken;
import com.google.gson.Gson;

/**
* <p>Title: TimerGetWeixinAccessToken</p>
* <p>Description:get WeixinAccessToken every 1 hour </p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Jul 27, 2015
*/
public class TimerGetWeixinAccessToken extends TimerTask{

	static Logger logger = Logger.getLogger(TimerGetWeixinAccessToken.class.getName());

	private static boolean isRunning = false;

	@Override
	synchronized public void run() {

	  Date d=new Date();
	  SimpleDateFormat myFmt=new SimpleDateFormat("yyyy－MM－dd  HH:mm:ss");
	  String sdate=myFmt.format(d);
		
		if (!isRunning) {
			isRunning = true;
			 //SystemConfig.Weixinaccess_token="";
			 SystemConfig.Weixinaccess_tokenUrl=SystemConfig.Weixinaccess_tokenUrl+"&appID="
					 							+SystemConfig.WeixinappID+"&secret="
					 							+SystemConfig.Weixinsecret;
			 logger.debug("------>>\n"+sdate+"\nWeixinaccess_tokenUrl"+SystemConfig.Weixinaccess_tokenUrl);
			 
			 String result=HttpReader.Httpreader(SystemConfig.Weixinaccess_tokenUrl);
			 
			 Gson gs=new Gson();
			 WXMsgAccesstoken at=new WXMsgAccesstoken();
			 at=gs.fromJson(result, at.getClass());
			 SystemConfig.Weixinaccess_token=at.getAccess_token();
			 logger.debug("------>>\n"+sdate+"\nWeixinaccess_token="+SystemConfig.Weixinaccess_token);
			 isRunning=false;
		} else {
			logger.info("reading from "+SystemConfig.Weixinaccess_tokenUrl);

		}
	}

	
}
