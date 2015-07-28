/**
* <p>Title: Item.java</p>
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
* <p>Title: Item</p>
* <p>Description: </p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Jul 24, 2015
*/
@XStreamAlias("item")
public class Item {
	

	private String Title;
	private String Description;
	private String PicUrl;
	private String Url;
	/**
	 * @return the title
	 */
	public String getTitle() {
		return Title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		// this.link = "<![CDATA["+link+"]]>";
		Title ="<![CDATA["+ title+"]]>";
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return Description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		Description ="<![CDATA[" +description+"]]>";
	}
	/**
	 * @return the picUrl
	 */
	public String getPicUrl() {
		return PicUrl;
	}
	/**
	 * @param picUrl the picUrl to set
	 */
	public void setPicUrl(String picUrl) {
		PicUrl ="<![CDATA["+ picUrl+"]]>";
	}
	/**
	 * @return the url
	 */
	public String getUrl() {
		return Url;
	}
	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		Url ="<![CDATA[" +url+"]]>";
	}
	
	
	 
}
