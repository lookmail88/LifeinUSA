/**
* <p>Title: SHUserDaoImpl.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2015</p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Jul 19, 2015
* @version 1.0
*/

package com.gaoxy.lifeinusa.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gaoxy.lifeinusa.entities.Tusers;

/**
* <p>Title: SHUserDaoImpl</p>
* <p>Description: </p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Jul 19, 2015
*/
@Repository("uderdao")
public class UserDaoImpl implements UserDao{

	
	 @Autowired
	    protected SessionFactory sessionFactory;
	/* (non-Javadoc)
	 * @see com.gaoxy.lifeinusa.dao.SHUserDao#findAll()
	 */
	@Override
	public List<Tusers> findAll() {
		// TODO Auto-generated method stub
		List<Tusers> ls= ((List<Tusers>) sessionFactory.openSession()
				.createSQLQuery("select * from  Tusers")
				.addEntity("ss","com.gaoxy.lifeinusa.entities.Tusers")
				.list());
		//List<Tusers> ls=(List<Tusers>) sessionFactory.openSession().createQuery("from Tusers").list();
		
		return ls;
	}

}
