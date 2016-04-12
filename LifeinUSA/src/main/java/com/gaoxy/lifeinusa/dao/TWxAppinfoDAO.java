/**
* <p>Title: TWxAppinfoDAO.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2015</p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Sep 1, 2015
* @version 1.0
*/

package com.gaoxy.lifeinusa.dao;

import com.gaoxy.lifeinusa.entities.TWxAppinfo;
import com.googlecode.genericdao.dao.hibernate.GenericDAO;

/**
* <p>Title: TWxAppinfoDAO</p>
* <p>Description: </p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Sep 1, 2015
*/
public interface TWxAppinfoDAO extends GenericDAO<TWxAppinfo, Long>{
	public void Insert(TWxAppinfo entity);
}
