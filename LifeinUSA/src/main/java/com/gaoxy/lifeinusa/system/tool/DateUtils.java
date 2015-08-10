/**
* <p>Title: Date.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2015</p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Jul 27, 2015
* @version 1.0
*/

package com.gaoxy.lifeinusa.system.tool;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
* <p>Title: Date</p>
* <p>Description: </p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Jul 27, 2015
*/
public class DateUtils {
	
	/**
	 * This is default method
	 * @param sformat
	 * 		   
	 * @return yyyy－MM－dd  HH:mm:ss sss
	 */
	public static String getDate(){
		  Date d=new Date();
		  SimpleDateFormat myFmt=new SimpleDateFormat("yyyy－MM－dd  HH:mm:ss");
		  String sdate=myFmt.format(d);
		  return sdate;
	}
	/**
	 * 
	 * @param sformat
	 * sformat like this: yyyy－MM－dd  HH:mm:ss sss
	 * @return
	 */
	public static String getDate(String sformat){
		  Date d=new Date();
		  SimpleDateFormat myFmt=new SimpleDateFormat(sformat);
		  String sdate=myFmt.format(d);
		  return sdate;
	}
}
