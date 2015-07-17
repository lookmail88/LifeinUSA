/**
* <p>Title: UserService.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2015</p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Jul 15, 2015
* @version 1.0
*/

package com.gaoxy.lifeinusa.services;

import java.util.List;

import com.gaoxy.lifeinusa.entities.Tusers;

/**
* <p>Title: UserService</p>
* <p>Description: </p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Jul 15, 2015
*/
public interface UserService {
	public List<String> getTestUserList();
	public List<Tusers> getUserListbyHibernate();
	
}
