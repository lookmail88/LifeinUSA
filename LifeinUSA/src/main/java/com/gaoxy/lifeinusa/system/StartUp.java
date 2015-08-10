/**
* <p>Title: Initlize.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2015</p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Jul 27, 2015
* @version 1.0
*/

package com.gaoxy.lifeinusa.system;


import java.util.Timer;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
 

/**
* <p>Title: Initlize</p>
* <p>Description: </p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Jul 27, 2015
*/
public class StartUp extends HttpServlet{
	public void init() throws ServletException
	  {
	      // 执行必需的初始化
		Timer timer=new Timer(true);//启动定时器
		
		//new com.gd158.SystemConfig.LoadConfig();//读取配置文件
	    timer.schedule(new TimerGetWeixinAccessToken(), 0,1000*60*60);  
	  }
	
	


}
