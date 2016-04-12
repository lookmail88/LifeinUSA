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

import com.gaoxy.lifeinusa.entities.TSecurityUser;
import com.gaoxy.lifeinusa.entities.User;

/**
* <p>Title: SHUserDao</p>
* <p>Description: </p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Jul 19, 2015
*/
public interface SecurityUserDao {
	public  List<TSecurityUser> findAll() throws Exception;
	
	public void save(TSecurityUser instance) throws Exception;

	public void attachClean(TSecurityUser instance) ;

	public void delete(TSecurityUser persistentInstance) ;

	public TSecurityUser merge(TSecurityUser detachedInstance);

	public TSecurityUser findById(java.lang.String id);

	public List<TSecurityUser> findByExample(TSecurityUser instance) ;
	
	public List<String> getAuthoritiesByUsername(String username);
}
