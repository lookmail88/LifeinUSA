/**
* <p>Title: TWxAppinfoDAOImpl.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2015</p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Sep 1, 2015
* @version 1.0
*/

package com.gaoxy.lifeinusa.dao;

 

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gaoxy.lifeinusa.entities.TWxAppinfo;
import com.googlecode.genericdao.dao.hibernate.GenericDAOImpl;
 
/**
* <p>Title: TWxAppinfoDAOImpl</p>
* <p>Description: </p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Sep 1, 2015
*/
@Service("twxappinfodao")
public class TWxAppinfoDAOImpl extends GenericDAOImpl<TWxAppinfo, Long>  implements TWxAppinfoDAO{

	static Logger logger = Logger.getLogger(TWxAppinfoDAOImpl.class.getName());
	
	@Autowired
	private SessionFactory sessionFactory;
	
	Transaction tx;

     @Override
     protected Session getSession() {
             return sessionFactory.openSession();
     }
     
     public void Insert(TWxAppinfo entity){
    	 
    	// TODO Auto-generated method stub
 		Session session=sessionFactory.openSession();
 		try{
 			tx=session.beginTransaction();
 	    	session.save(entity);
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

	
	
}
