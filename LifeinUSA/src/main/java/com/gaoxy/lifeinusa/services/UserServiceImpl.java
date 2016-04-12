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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gaoxy.lifeinusa.dao.SecurityUserDao;
import com.gaoxy.lifeinusa.dao.UserDao;
import com.gaoxy.lifeinusa.entities.TSecurityUser;
import com.gaoxy.lifeinusa.entities.User;


/**
* <p>Title: UserServiceImpl</p>
* <p>Description: </p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Jul 15, 2015
*/

@Service("userservice")
public class UserServiceImpl implements UserService{
	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	
	
	@Autowired
	private UserDao userdao;
	
	@Autowired
	private SecurityUserDao securityuserdao;
	
	
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
	public List<User> getUserListbyHibernate() {
		List<User> ls=userdao.findAll();
		 
		return (List)ls;
	}



	/* (non-Javadoc)
	 * @see com.gaoxy.lifeinusa.services.UserService#addNewUser(com.gaoxy.lifeinusa.entities.User, com.gaoxy.lifeinusa.entities.TSecurityUser)
	 */
	@Override
	public boolean addNewUser(User u) {
		boolean re=false;

		try {
			
			
			TSecurityUser tu=new TSecurityUser();
			tu.setUsername(u.getEmail());
			tu.setPassword(u.getPassword());
			
			
			
			
			userdao.save(u);
			securityuserdao.save(tu);

			re=true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error("------>>add new user error!!!");
			e.printStackTrace();
		}
		logger.debug("------>>add new user result:"+re);
		return re;
	}


	

}
