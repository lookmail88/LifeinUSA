/**
* <p>Title: BaseDao.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2015</p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Aug 20, 2015
* @version 1.0
*/

package com.gaoxy.lifeinusa.dao;

import org.hibernate.mapping.List;

/**
* <p>Title: BaseDao</p>
* <p>Description: </p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Aug 20, 2015
*/
public interface BaseDao {
	public List queryBySql(String sql);
        
    public int excuteBySql(String sql) ;  
}
