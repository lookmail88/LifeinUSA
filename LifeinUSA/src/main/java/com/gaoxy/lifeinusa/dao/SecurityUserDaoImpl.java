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

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gaoxy.lifeinusa.entities.TSecurityUser;
import com.gaoxy.lifeinusa.entities.User;
import com.gaoxy.lifeinusa.system.tool.Printer;

/**
* <p>Title: SHUserDaoImpl</p>
* <p>Description: </p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Jul 19, 2015
*/
@Repository("securityuserdao")
public class SecurityUserDaoImpl implements SecurityUserDao{

	
	 @Autowired
	    protected SessionFactory sessionFactory;
	 
	 Transaction tx;
	/* (non-Javadoc)
	 * @see com.gaoxy.lifeinusa.dao.SHUserDao#findAll()
	 */

	/* (non-Javadoc)
	 * @see com.gaoxy.lifeinusa.dao.SecurityUserDao#findAll()
	 */
	@Override
	public List<TSecurityUser> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.gaoxy.lifeinusa.dao.SecurityUserDao#save(com.gaoxy.lifeinusa.entities.TSecurityUser)
	 */
	@Override
	public void save(TSecurityUser user)  {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		try{
			tx=session.beginTransaction();
	    	session.save(user);
	    	tx.commit();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally
		{
			session.close();
			tx=null;
		}
			
	}

	public List<String> getAuthoritiesByUsername(String username){
		
		String sqls="SELECT  role.name FROM"+
				" t_security_user user, t_security_user_role rolemap, t_security_role role"+
				" where	user.username=rolemap.username and"+
				" rolemap.role_id=role.id and user.username='"+username+"'";
		
		 List list = (List) sessionFactory.getCurrentSession().createSQLQuery(sqls).list();    
		
		 Printer.Print(list);
		 
		return list;
	}
	
	/* (non-Javadoc)
	 * @see com.gaoxy.lifeinusa.dao.SecurityUserDao#attachClean(com.gaoxy.lifeinusa.entities.TSecurityUser)
	 */
	@Override
	public void attachClean(TSecurityUser instance) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.gaoxy.lifeinusa.dao.SecurityUserDao#delete(com.gaoxy.lifeinusa.entities.TSecurityUser)
	 */
	@Override
	public void delete(TSecurityUser persistentInstance) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.gaoxy.lifeinusa.dao.SecurityUserDao#merge(com.gaoxy.lifeinusa.entities.TSecurityUser)
	 */
	@Override
	public TSecurityUser merge(TSecurityUser detachedInstance) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.gaoxy.lifeinusa.dao.SecurityUserDao#findById(java.lang.String)
	 */
	@Override
	public TSecurityUser findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.gaoxy.lifeinusa.dao.SecurityUserDao#findByExample(com.gaoxy.lifeinusa.entities.TSecurityUser)
	 */
	@Override
	public List<TSecurityUser> findByExample(TSecurityUser instance) {
		// TODO Auto-generated method stub
		return null;
	}


}
