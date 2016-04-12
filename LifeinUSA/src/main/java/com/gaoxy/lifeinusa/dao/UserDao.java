/**
* <p>Title: SHUserDao.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2015</p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Jul 19, 2015
* @version 1.0
*/

package com.gaoxy.lifeinusa.dao;

import java.util.List;

import com.gaoxy.lifeinusa.entities.User;

/**
* <p>Title: SHUserDao</p>
* <p>Description: </p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Jul 19, 2015
*/
public interface UserDao {
	public  List<User> findAll();
	
	public void save(User instance);

	public void attachClean(User instance) ;

	public void delete(User persistentInstance) ;

	public User merge(User detachedInstance);

	public User findById(java.lang.String id);

	public List<User> findByExample(User instance) ;
}
