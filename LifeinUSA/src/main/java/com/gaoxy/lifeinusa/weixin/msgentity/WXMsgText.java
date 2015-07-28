/**
* <p>Title: WXMsgImageText.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2015</p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Jul 24, 2015
* @version 1.0
*/

package com.gaoxy.lifeinusa.weixin.msgentity;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
* <p>Title: WXMsgImageText</p>
* <p>Description: </p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Jul 24, 2015
*/
@XStreamAlias("xml")
public class WXMsgText extends WXMsg{

	private String Content="";
	
	public WXMsgText(){
		this.setMsgType("text");
	}
   /**
	 * @return the content
	 */
	public String getContent() {
		return Content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		//	Description ="<![CDATA[" +description+"]]>";
		Content ="<![CDATA[" + content+"]]>";
	}


	 	





	
}
