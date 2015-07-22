/**
* <p>Title: UserServiceImpl.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2015</p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Jul 15, 2015
* @version 1.0
*/

package com.gaoxy.lifeinusa.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gaoxy.lifeinusa.dao.SHUserDao;
import com.gaoxy.lifeinusa.dao.UserDAO;
import com.gaoxy.lifeinusa.entities.Tusers;

/**
* <p>Title: UserServiceImpl</p>
* <p>Description: </p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Jul 15, 2015
*/

@Service("userservice")
public class UserServiceImpl implements UserService{
	
	@Autowired
	private SHUserDao shuserdao;
	//private UserDAO userdao;

	/* (non-Javadoc)
	 * @see com.gaoxy.lifeinusa.services.UserService#getTestUserList()
	 */
	@Override
	public List<String> getTestUserList() {
		ArrayList<String> ls=new ArrayList<String>();
		ls.add("TestUser1");
		ls.add("TestUser2");
		ls.add("TestUser3");
		return ls;
	}

	/* (non-Javadoc)
	 * @see com.gaoxy.lifeinusa.services.UserService#getUserListbyHibernate()
	 */
	
	
	@Override
	public List<Tusers> getUserListbyHibernate() {
		List<Tusers> ls=shuserdao.findAll();
		 
		return (List)ls;
	}
//
//	/**
//	 * @return the userdao
//	 */
//	public UserDAO getUserdao() {
//		return userdao;
//	}
//
//	/**
//	 * @param userdao the userdao to set
//	 */
//	public void setUserdao(UserDAO userdao) {
//		this.userdao = userdao;
//	}
//	

	

}
