/**
* <p>Title: SystemConfig.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2015</p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Jul 27, 2015
* @version 1.0
*/

package com.gaoxy.lifeinusa.system;

/**
* <p>Title: SystemConfig</p>
* <p>Description: </p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Jul 27, 2015
*/
public class SystemConfig {

	//weixin 接入参数 用于login 以及文本加密
	public static String WeixinToken="";
	//微信应用ID
	public static String WeixinappID="wxeb1226b38c2d859e";
	
	public static String Weixinsecret="71102939b0e1259e70a34e9f0373b192";
	
	//微信全局token，用于发送post请求 每2小时刷新一次
	public static String Weixinaccess_token="";
	//get Access token url
	public static String Weixinaccess_tokenUrl="https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential";
	
	//upload news to cast  
	public static String WeixinuploadnewsUrl="https://api.weixin.qq.com/cgi-bin/media/uploadnews?access_token=%s";
	
	//
	public static String WeinxinsendallUrl="https://api.weixin.qq.com/cgi-bin/message/mass/sendall?access_token=%s";
	
	public static String Weixinip_list="";
	
	
	
	
	//sys config list
	
	public static String User_Type_Partner="ROLE_Partner";
	public static String User_Type_WebAdmin="ROLE_WebAdmin";
	public static String User_Type_Service="ROLE_Service";
	
	public static String User_initlize_file_path="/usr/local/lifeinusa";
	public static String[] User_initlize_SubPath = {"html","css","wxmsg","images","js"};
	
	public static String Partner_Login_Success="partner/pdashboard";
	public static String Partner_Login_Failed="redirect:/plogin.jsp?errorcode=3";
	
	public static String DomainUrl="http://www.lifeinusa.com";
	public static String WxServerVisitUrl=DomainUrl+"/rest/weixin";
	
}
