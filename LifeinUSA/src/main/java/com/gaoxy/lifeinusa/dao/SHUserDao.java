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

import com.gaoxy.lifeinusa.entities.Tusers;

/**
* <p>Title: SHUserDao</p>
* <p>Description: </p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Jul 19, 2015
*/
public interface SHUserDao {
	public  List<Tusers> findAll();
}
