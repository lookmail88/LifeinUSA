/**
* <p>Title: customUserDetailsServiceImpl.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2015</p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Aug 20, 2015
* @version 1.0
*/

package com.gaoxy.lifeinusa.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.gaoxy.lifeinusa.controller.LoginController;
import com.gaoxy.lifeinusa.dao.SecurityUserDao;
import com.gaoxy.lifeinusa.entities.TSecurityUser;
import com.gaoxy.lifeinusa.entities.custom.CustomUserDetails;

/**
* <p>Title: customUserDetailsServiceImpl</p>
* <p>Description: </p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Aug 20, 2015
*/
//@Service("customUserDetailsService")
public class CustomUserDetailsServiceImpl implements CustomUserDetailsService{
	
	private static final Logger logger = LoggerFactory.getLogger(CustomUserDetailsServiceImpl.class);
	/** 
     * @Fields serialVersionUID : TODO（用一句话描述这个变量表示什么）. 
     */  
    private static final long serialVersionUID = 1L;  
      
    @Autowired  
    private SecurityUserDao securityuserdao;  
    
    CustomUserDetails cuserdetails;
    SimpleGrantedAuthority sga;
	
	/* 根据用户名判断是否存在 
     * <p>Title: loadUserByUsername</p> 
     * <p>Description: </p> 
     * @param arg0 
     * @return 
     * @throws UsernameNotFoundException 
	 * @see org.springframework.security.core.userdetails.UserDetailsService#loadUserByUsername(java.lang.String)
	 */
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		TSecurityUser user = securityuserdao.findById(username);  
        
        if (null == user) {  
            throw new UsernameNotFoundException("用户" + username + "不存在");  
        }  
          
          
        Collection<GrantedAuthority> auths = new ArrayList<GrantedAuthority>();  
        List<String> list = securityuserdao.getAuthoritiesByUsername(username);  
        for (int i = 0; i < list.size(); i++) {  
            auths.add(new SimpleGrantedAuthority(list.get(i))); 
            
           logger.debug("------>>loadUserByUsername : " + list.get(i));  
        }  
        
        
      //因为UserEntity实现了UserDetails，所以也可以直接返回user  
        return cuserdetails;
	}

}
