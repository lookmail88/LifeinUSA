/**
* <p>Title: Message.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2015</p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Jul 24, 2015
* @version 1.0
*/

package com.gaoxy.lifeinusa.weixin.msgentity;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
* <p>Title: Message</p>
* <p>Description: </p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Jul 24, 2015
*/
@XStreamAlias("xml")
public class WXMsg {
	
	private String ToUserName=""; 	//开发者微信号
	private String FromUserName="";//发送方帐号（一个OpenID）
	private String CreateTime=""; 	//消息创建时间 （整型）
	private String MsgType=""; 	//text 
	/**
	 * @return the toUserName
	 */
	public String getToUserName() {
		return ToUserName;
	}
	/**
	 * @param toUserName the toUserName to set
	 */
	public void setToUserName(String toUserName) {
		ToUserName ="<![CDATA[" + toUserName+"]]>";
	}
	/**
	 * @return the fromUserName
	 */
	public String getFromUserName() {
		return FromUserName;
	}
	/**
	 * @param fromUserName the fromUserName to set
	 */
	public void setFromUserName(String fromUserName) {
		FromUserName = "<![CDATA[" +fromUserName+"]]>";
	}
	/**
	 * @return the createTime
	 */
	public String getCreateTime() {
		return CreateTime;
	}
	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(String createTime) {
		CreateTime = createTime ;
	}
	/**
	 * @return the msgType
	 */
	public String getMsgType() {
		return MsgType;
	}
	/**
	 * @param msgType the msgType to set
	 */
	public void setMsgType(String msgType) {
		MsgType ="<![CDATA[" + msgType+"]]>";
	}
	
	
	
}
