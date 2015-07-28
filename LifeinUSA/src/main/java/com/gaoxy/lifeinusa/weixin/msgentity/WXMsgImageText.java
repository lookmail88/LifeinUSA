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
import com.gaoxy.lifeinusa.weixin.msgentity.Item;


/**
* <p>Title: WXMsgImageText</p>
* <p>Description: </p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Jul 24, 2015
*/
@XStreamAlias("xml")
public class WXMsgImageText extends WXMsg{

	
	private String ArticleCount;
	private List<Item> Articles;
	
   public WXMsgImageText(){
		this.setMsgType("news");
	}
	 	
	/**
	 * @return the articleCount
	 */
	public String getArticleCount() {
		return ArticleCount;
	}
 	/**
	 * @param articleCount the articleCount to set
	 */
	public void setArticleCount(String articleCount) {
		ArticleCount = articleCount;
	}





	/**
	 * @return the articles
	 */
	public List<Item> getArticles() {
		return Articles;
	}





	/**
	 * @param articles the articles to set
	 */
	public void setArticles(List<Item> articles) {
		Articles = articles;
	}





	
}
