/**
* <p>Title: SingletonExecute.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2015</p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Mar 20, 2016
* @version 1.0
*/

package com.gaoxy.lifeinusa.system;

import java.util.Hashtable;

/**
* <p>Title: SingletonExecute</p>
* <p>Description: </p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Mar 20, 2016
*/
public enum SingletonExecute {
	Instance;
	private Hashtable MemoMap=new Hashtable(); 
	
	public void addmsg(String key, String value){
		this.MemoMap.put(key, value);
	}
	
	public void clean(){
		this.MemoMap=null;
	}
	
	public String getMemoStatus(){
		return Integer.toString( this.MemoMap.size());
	}
	
	
}
