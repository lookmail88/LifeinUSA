/**
* <p>Title: UserDAOImpl.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2015</p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Jul 15, 2015
* @version 1.0
*/

package com.gaoxy.lifeinusa.dao;

import java.util.Hashtable;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.hibernate.SharedSessionContract;
import org.hibernate.Transaction;
//import org.hibernate.boot.registry.StandardServiceRegistry;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.springframework.stereotype.Repository;

import com.gaoxy.lifeinusa.entities.Tusers;


/**
* <p>Title: UserDAOImpl</p>
* <p>Description: </p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Jul 15, 2015
*/
@Repository("userdao")
public class UserDAOImpl implements UserDAO{

	/* (non-Javadoc)
	 * @see com.gaoxy.lifeinusa.dao.UserDAO#attachDirty(com.gaoxy.lifeinusa.entities.Tusers)
	 */
	@Override
	public void attachDirty(Tusers instance) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.gaoxy.lifeinusa.dao.UserDAO#attachClean(com.gaoxy.lifeinusa.entities.Tusers)
	 */
	@Override
	public void attachClean(Tusers instance) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.gaoxy.lifeinusa.dao.UserDAO#delete(com.gaoxy.lifeinusa.entities.Tusers)
	 */
	@Override
	public void delete(Tusers persistentInstance) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.gaoxy.lifeinusa.dao.UserDAO#merge(com.gaoxy.lifeinusa.entities.Tusers)
	 */
	@Override
	public Tusers merge(Tusers detachedInstance) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.gaoxy.lifeinusa.dao.UserDAO#findById(java.lang.String)
	 */
	@Override
	public Tusers findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.gaoxy.lifeinusa.dao.UserDAO#findByExample(com.gaoxy.lifeinusa.entities.Tusers)
	 */
	@Override
	public List findByExample(Tusers instance) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.gaoxy.lifeinusa.dao.UserDAO#findAll()
	 */
	@Override
	public List findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	

//	private static final Log log = LogFactory.getLog(UserDAOImpl.class);
//
//	private final SessionFactory hsessionFactory = getSessionFactory();
//
//	protected SessionFactory getSessionFactory() {
//		   try {
//	            // Create the SessionFactory from hibernate.cfg.xml
//			   Configuration configuration = new Configuration();
//			   configuration.configure("hibernate.cfg.xml");
//			   ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
//			           .applySettings(configuration.getProperties()).build();
//			   SessionFactory sessionFactory = configuration
//			           .buildSessionFactory(serviceRegistry);
//			   
//			   
//	            //return new Configuration().configure().buildSessionFactory(
//				//    new StandardServiceRegistryBuilder().build() );
//			   
//			   return sessionFactory;
//	        }
//	        catch (Throwable ex) {
//	            // Make sure you log the exception, as it might be swallowed
//	            System.err.println("Initial SessionFactory creation failed." + ex);
//	            throw new ExceptionInInitializerError(ex);
//	        }
//	}
//
//	public void persist(Tusers transientInstance) {
//		log.debug("persisting Tuserss instance");
//		try {
//			hsessionFactory.getCurrentSession().persist(transientInstance);
//			log.debug("persist successful");
//		} catch (RuntimeException re) {
//			log.error("persist failed", re);
//			throw re;
//		}
//	}
//	
//	public void attachDirty(Tusers instance) {
//		log.debug("attaching dirty Tuserss instance");
//		try {
//			hsessionFactory.getCurrentSession().saveOrUpdate(instance);
//			log.debug("attach successful");
//		} catch (RuntimeException re) {
//			log.error("attach failed", re);
//			throw re;
//		}
//	}
//
//	public void attachClean(Tusers instance) {
//		log.debug("attaching clean Tuserss instance");
//		try {
//			hsessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
//			log.debug("attach successful");
//		} catch (RuntimeException re) {
//			log.error("attach failed", re);
//			throw re;
//		}
//	}
//
//	public void delete(Tusers persistentInstance) {
//		log.debug("deleting Tuserss instance");
//		try {
//			hsessionFactory.getCurrentSession().delete(persistentInstance);
//			log.debug("delete successful");
//		} catch (RuntimeException re) {
//			log.error("delete failed", re);
//			throw re;
//		}
//	}
//
//	public Tusers merge(Tusers detachedInstance) {
//		log.debug("merging Tuserss instance");
//		try {
//			Tusers result = (Tusers) hsessionFactory.getCurrentSession().merge(detachedInstance);
//			log.debug("merge successful");
//			return result;
//		} catch (RuntimeException re) {
//			log.error("merge failed", re);
//			throw re;
//		}
//	}
//
//	public Tusers findById(java.lang.String id) {
//		log.debug("getting Tuserss instance with id: " + id);
//		try {
//			Tusers instance = (Tusers) hsessionFactory.getCurrentSession().get("com.gaoxy.lifeinusa.entities.Tuserss",
//					id);
//			if (instance == null) {
//				log.debug("get successful, no instance found");
//			} else {
//				log.debug("get successful, instance found");
//			}
//			return instance;
//		} catch (RuntimeException re) {
//			log.error("get failed", re);
//			throw re;
//		}
//	}
//
//	public List<Tusers> findByExample(Tusers instance) {
//		log.debug("finding Tuserss instance by example");
//		try {
//			List<Tusers> results=null;
////			List<Tuserss> results = sessionFactory.getCurrentSession().createCriteria("com.gaoxy.lifeinusa.entities.Tuserss")
////					.add(Example.create(instance)).list();
////			log.debug("find by example successful, result size: " + results.size());
//			return results;
//		} catch (RuntimeException re) {
//			log.error("find by example failed", re);
//			throw re;
//		}
//	}
//
//	/* (non-Javadoc)
//	 * @see com.gaoxy.lifeinusa.dao.UserDAO#findAll()
//	 */
//	@Override
//	public List<Tusers> findAll() {
//		log.debug("finding Tuserss instance by example");
//		try {
//			Transaction htx= hsessionFactory.openSession().beginTransaction();
//			List<Tusers> results =hsessionFactory.openSession().createCriteria(com.gaoxy.lifeinusa.entities.Tusers.class).list(); 
//			//List<Tuserss> results =sessionFactory.openSession().createQuery("FROM  Tuserss").list();
//			
//			
//			log.info("findAll  successful, result size: " + results.size());
//			htx.commit();
//			
//			
//			return results;
//		} catch (RuntimeException re) {
//			log.error("findAll by example failed", re);
//			throw re;
//		}
//	}

}
