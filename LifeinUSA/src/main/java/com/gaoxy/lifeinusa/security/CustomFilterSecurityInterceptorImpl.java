/**
* <p>Title: CustomFilterSecurityInterceptorImpl.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2015</p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Aug 20, 2015
* @version 1.0
*/

package com.gaoxy.lifeinusa.security;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.access.SecurityMetadataSource;
import org.springframework.security.access.intercept.AbstractSecurityInterceptor;
import org.springframework.security.access.intercept.InterceptorStatusToken;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Service;

/**
* <p>Title: CustomFilterSecurityInterceptorImpl</p>
* <p>Description: </p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Aug 20, 2015
*/
/**   
 * 该过滤器的主要作用就是通过spring著名的IoC生成securityMetadataSource。  
 * securityMetadataSource相当于本包中自定义的CostomInvocationSecurityMetadataSourceService。  
 * 该CostomInvocationSecurityMetadataSourceService的作用提从数据库提取权限和资源，装配到HashMap中，  
 * 供Spring Security使用，用于权限校验。  
 *   
 * TODO(这里用一句话描述这个类的职责). 
 * @ClassName: CustomFilterSecurityInterceptorImpl 
 * @author Johnny_L_Q 
 */  
//@Service("customFilterSecurityInterceptor")  
public class CustomFilterSecurityInterceptorImpl extends  
        AbstractSecurityInterceptor implements CustomFilterSecurityInterceptor {  
  
    @Resource  
    @Qualifier("customInvocationSecurityMetadataSource")  
    private FilterInvocationSecurityMetadataSource securityMetadataSource;  
     
  
    @Resource  
    @Qualifier("customAccessDecisionManager")  
    public void setAccessDecisionManager(  
            AccessDecisionManager accessDecisionManager) {  
        // TODO Auto-generated method stub  
        super.setAccessDecisionManager(accessDecisionManager);  
    }  
/*    @Resource 
    @Qualifier("customAccessDecisionManager") 
    public AccessDecisionManager accessDecisionManager;*/  
      
/*    @Resource 
    @Qualifier("authenticationManager") 
    public AuthenticationManager authenticationManager;*/  
      
      
    @Resource  
    @Qualifier("authenticationManager")  
    public void setAuthenticationManager(AuthenticationManager newManager) {  
        super.setAuthenticationManager(newManager);  
    }  
      
    /* 
     * <p>Title: doFilter</p> 
     * <p>Description: </p> 
     * @param arg0 
     * @param arg1 
     * @param arg2 
     * @throws IOException 
     * @throws ServletException 
     * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain) 
     */  
    public void doFilter(ServletRequest request, ServletResponse response,  
            FilterChain chain) throws IOException, ServletException {  
        FilterInvocation fi = new FilterInvocation(request, response, chain);  
        infoke(fi);  
  
    }  
  
    /** 
     * TODO(这里用一句话描述这个方法的作用). 
     * @param fi  
     * @throws ServletException  
     * @throws IOException  
     */  
    private void infoke(FilterInvocation fi) throws IOException, ServletException {  
        InterceptorStatusToken token = super.beforeInvocation(fi);  
          
        try {  
            fi.getChain().doFilter(fi.getRequest(), fi.getResponse());  
        } finally {  
            super.afterInvocation(token, null);  
        }  
          
    }  
  
    /* 
     * <p>Title: init</p> 
     * <p>Description: </p> 
     * @param arg0 
     * @throws ServletException 
     * @see javax.servlet.Filter#init(javax.servlet.FilterConfig) 
     */  
  
    public void init(FilterConfig arg0) throws ServletException {  
        // TODO Auto-generated method stub  
  
    }  
  
    /* 
     * <p>Title: getSecureObjectClass</p> 
     * <p>Description: </p> 
     * @return 
     * @see org.springframework.security.access.intercept.AbstractSecurityInterceptor#getSecureObjectClass() 
     */  
    @Override  
    public Class<?> getSecureObjectClass() {  
        // TODO Auto-generated method stub  
        return FilterInvocation.class;  
    }  
  
    /* 
     * <p>Title: obtainSecurityMetadataSource</p> 
     * <p>Description: </p> 
     * @return 
     * @see org.springframework.security.access.intercept.AbstractSecurityInterceptor#obtainSecurityMetadataSource() 
     */  
  
    public SecurityMetadataSource obtainSecurityMetadataSource() {  
        // TODO Auto-generated method stub  
        return this.securityMetadataSource;  
    }  
      
    /* 
     * <p>Title: destroy</p> 
     * <p>Description: </p> 
     * @see javax.servlet.Filter#destroy() 
     */  
 
    public void destroy() {  
        // TODO Auto-generated method stub  
  
    }  
      
  
    public FilterInvocationSecurityMetadataSource getSecurityMetadataSource() {  
        return securityMetadataSource;  
    }  
      
  
    public void setSecurityMetadataSource(  
            FilterInvocationSecurityMetadataSource securityMetadataSource) {  
        this.securityMetadataSource = securityMetadataSource;  
    }  
}  
