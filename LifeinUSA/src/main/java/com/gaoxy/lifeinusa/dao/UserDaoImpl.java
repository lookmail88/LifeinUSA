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
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.stereotype.Repository;

import com.gaoxy.lifeinusa.entities.TSecurityUser;
import com.gaoxy.lifeinusa.entities.User;

/**
* <p>Title: SHUserDaoImpl</p>
* <p>Description: </p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Jul 19, 2015
*/
@Repository("userdao")
public class UserDaoImpl implements UserDao{

	
	 @Autowired
	    protected SessionFactory sessionFactory;
	
	 Transaction tx;
	 
	/* (non-Javadoc)
	 * @see com.gaoxy.lifeinusa.dao.SHUserDao#findAll()
	 */
	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		List<User> ls= ((List<User>) sessionFactory.openSession()
				.createSQLQuery("select * from  User")
				.addEntity("ss","com.gaoxy.lifeinusa.entities.User")
				.list());
		//List<User> ls=(List<User>) sessionFactory.openSession().createQuery("from User").list();
		
		return ls;
	}
    /**
     * 根据用户id查询用户
     */
    public User getUser(String id) {
 
        String hql = "from T_User u where u.id=?";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setString(0, id);
 
        return (User) query.uniqueResult();
    }
 
    /**
     * 查询所有用户
     */
    public List<User> getAllUser() {
 
        String hql = "from User";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
 
        return query.list();
    }
 
    /**
     * 添加用户
     */
    public void save(User user) {
    	
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
 
    /**
     * 根据id删除用户
     */
    public boolean delUser(String id) {
 
        String hql = "delete User u where u.id = ?";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setString(0, id);
        query.executeUpdate();
        //return (query.executeUpdate() > 0);
        return true;
    }
 
    /**
     *编辑用户
     */
    public boolean updateUser(User user) {
 
        String hql = "update User u set u.userName = ?,u.age=? where u.id = ?";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
      
        query.setString(2, user.getEmail());
 
        return (query.executeUpdate() > 0);
    }
 
	/* (non-Javadoc)
	 * @see com.gaoxy.lifeinusa.dao.UserDao#attachClean(com.gaoxy.lifeinusa.entities.User)
	 */
	@Override
	public void attachClean(User instance) {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see com.gaoxy.lifeinusa.dao.UserDao#delete(com.gaoxy.lifeinusa.entities.User)
	 */
	@Override
	public void delete(User persistentInstance) {
		// TODO Auto-generated method stub
		
	}
	/* (non-Javadoc)
	 * @see com.gaoxy.lifeinusa.dao.UserDao#merge(com.gaoxy.lifeinusa.entities.User)
	 */
	@Override
	public User merge(User detachedInstance) {
		// TODO Auto-generated method stub
		return null;
	}
	/* (non-Javadoc)
	 * @see com.gaoxy.lifeinusa.dao.UserDao#findById(java.lang.String)
	 */
	@Override
	public User findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	/* (non-Javadoc)
	 * @see com.gaoxy.lifeinusa.dao.UserDao#findByExample(com.gaoxy.lifeinusa.entities.User)
	 */
	@Override
	public List<User> findByExample(User instance) {
		// TODO Auto-generated method stub
		return null;
	}

}
