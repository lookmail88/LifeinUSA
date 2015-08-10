/**
* <p>Title: UserDAO.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2015</p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Jul 15, 2015
* @version 1.0
*/

package com.gaoxy.lifeinusa.dao;

import java.util.List;

import org.hibernate.LockMode;
import org.hibernate.criterion.Example;

import com.gaoxy.lifeinusa.entities.Tusers;

/**
* <p>Title: UserDAO</p>
* <p>Description: </p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Jul 15, 2015
*/
public interface UserDAOHibernateExample {
	public void attachDirty(Tusers instance);

	public void attachClean(Tusers instance) ;

	public void delete(Tusers persistentInstance) ;

	public Tusers merge(Tusers detachedInstance);

	public Tusers findById(java.lang.String id);

	public List<Tusers> findByExample(Tusers instance) ;
	
	public List<Tusers> findAll();
}
