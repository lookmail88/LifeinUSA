/**
* <p>Title: BaseDaoImpl.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2015</p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Aug 20, 2015
* @version 1.0
*/

package com.gaoxy.lifeinusa.dao;

import javax.annotation.Resource;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.mapping.List;
import org.springframework.stereotype.Repository;

/**
* <p>Title: BaseDaoImpl</p>
* <p>Description: </p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Aug 20, 2015
*/
@Repository("basedao")
	public class BaseDaoImpl implements BaseDao {    
	    
	    @Resource(name = "sessionFactory")    
	    private SessionFactory sessionFactory;    
	    
	    public Session getSession() {    
	        return sessionFactory.openSession();    
	    }    
	    
	    public List queryBySql(String sql) {    
	        List list =(List) getSession().createSQLQuery(sql).list();    
	        return list;    
	    }    
	        
	    public int excuteBySql(String sql)    
	    {    
	        int result ;    
	        SQLQuery query = this.getSession().createSQLQuery(sql);    
	        result = query.executeUpdate();    
	        return result;    
	    }    
	    
	}    

