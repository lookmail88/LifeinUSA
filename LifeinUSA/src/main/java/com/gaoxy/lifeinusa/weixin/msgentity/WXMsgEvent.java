/**
* <p>Title: Event.java</p>
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
* <p>Title: Event</p>
* <p>Description: </p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Jul 24, 2015
*/
@XStreamAlias("xml")
public class WXMsgEvent extends WXMsg{
	private String  Event; 
	private String  EventKey;
	
	public WXMsgEvent(){
		this.setMsgType("event");
	}
	/**
	 * @return the event
	 */
	public String getEvent() {
		return Event;
	}
	/**
	 * @param event the event to set
	 */
	public void setEvent(String event) {
		Event = event;
	}
	/**
	 * @return the eventKey
	 */
	public String getEventKey() {
		return EventKey;
	}
	/**
	 * @param eventKey the eventKey to set
	 */
	public void setEventKey(String eventKey) {
		EventKey = eventKey;
	}
	
	
}
