/**
* <p>Title: CustomFilterInvocationSecurityMetadataSourceImpl.java</p>
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
import java.util.HashMap;  
import java.util.Iterator;  
import java.util.List;  
  
import javax.annotation.PostConstruct;  
import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;  
import org.springframework.security.access.SecurityConfig;  
import org.springframework.security.web.FilterInvocation;  
import org.springframework.security.web.util.matcher.RequestMatcher;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.stereotype.Service;

import com.gaoxy.lifeinusa.controller.LoginController;
import com.gaoxy.lifeinusa.dao.BaseDao;
import com.gaoxy.lifeinusa.entities.EntityPathRoleMap;
import com.gaoxy.lifeinusa.entities.TSecurityResc;
import com.gaoxy.lifeinusa.entities.TSecurityRole;
import com.gaoxy.lifeinusa.system.tool.Printer;  
  
 

/**
* <p>Title: CustomFilterInvocationSecurityMetadataSourceImpl</p>
* <p>Description: </p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Aug 20, 2015
* TODO(这里用一句话描述这个类的职责). 
* @ClassName: CustomInvocationSecurityMetadataSourceImpl 
* @author Johnny_L_Q 
*/  

//@Service("customInvocationSecurityMetadataSource")  
public class CustomInvocationSecurityMetadataSourceImpl implements  
        CustomInvocationSecurityMetadataSource {  
	private static final Logger logger = LoggerFactory.getLogger(CustomInvocationSecurityMetadataSourceImpl.class);
	 
	
//    @Resource  
//    private ResourceService resourceService;  
//      
//    @Resource  
//    private AuthorityService authorityService;  
	 
	
	@Autowired
	private BaseDao basedao;
  
    //private AntPathRequestMatcher pathMatcher;  
  
    private HashMap<String, Collection<ConfigAttribute>> resourceMap = null;  
  
    /** 
     * 
     * 自定义方法，这个类放入到Spring容器后，  
     * 指定init为初始化方法，从数据库中读取资源  
     * TODO(这里用一句话描述这个方法的作用). 
     */  
    @PostConstruct  
    public void init() {  
        loadResourceDefine();  
    }  
  
    /** 
     *  
     * TODO(程序启动的时候就加载所有资源信息). 
     */  
    private void loadResourceDefine() {  
  
        // 在Web服务器启动时，提取系统中的所有权限。  
        //sql = "select authority_name from pub_authorities";  
  
//        List<AuthorityEntity> query = authorityService.getAllAuthoritys();  
   //     List<TSecurityResc> query=genericdao.findAll(TSecurityResc.class);
    	
        /**//* 
             * 应当是资源为key， 权限为value。 资源通常为url， 权限就是那些以ROLE_为前缀的角色。 一个资源可以由多个权限来访问。 
             * sparta 
             */  
        resourceMap = new HashMap<String, Collection<ConfigAttribute>>();  
        String sql="select resc.res_string , role.name from "
        		+ " t_security_resc resc,t_security_role role,t_security_resc_role rrmap"
        		+ " where  resc.id=rrmap.resc_id and role.id=rrmap.role_id"
        		+ " order by resc.res_string";
        logger.debug("------>>sql="+sql);
       // List ll=basedao.queryBySql(sql);
        
        
        
      //  Printer.Print(ll);
  
//        for (AuthorityEntity auth : query) {  
//            String authName = auth.getAuthorityName();  
//              
//            ConfigAttribute ca = new SecurityConfig(auth.getAuthorityName());  
//  
//            List<String> resources = resourceService.getResourcesByAuthName(authName);  
//           
//  
//            for (String str : resources) {  
//                //String authName = auth2.getAuthorityName();  
//                String url = str;  
//  
//                /**//* 
//                     * 判断资源文件和权限的对应关系，如果已经存在相关的资源url，则要通过该url为key提取出权限集合，将权限增加到权限集合中。 
//                     * sparta 
//                     */  
//                if (resourceMap.containsKey(url)) {  
//  
//                    Collection<ConfigAttribute> value = resourceMap.get(url);  
//                    value.add(ca);  
//                    resourceMap.put(url, value);  
//                } else {  
//                    Collection<ConfigAttribute> atts = new ArrayList<ConfigAttribute>();  
//                    atts.add(ca);  
//                    resourceMap.put(url, atts);  
//                }  
//  
//            }  
//  
//        }  
  
    }  
  
    /** 
     * TODO(自定义方法，将List<Role>集合转换为框架需要的Collection<ConfigAttribute>集合). 
     * @param roles 角色集合 
     * @return list 封装好的Collection集合 
     */  
    private Collection<ConfigAttribute> listToCollection(List<TSecurityRole> roles) {  
        List<ConfigAttribute> list = new ArrayList<ConfigAttribute>();  
  
        for (TSecurityRole role : roles) {  
            list.add(new SecurityConfig(role.getName()));  
  
        }  
        return list;  
    }  
  
    /* 
     * <p>Title: getAllConfigAttributes</p> 
     * <p>Description: </p> 
     * @return 
     * @see org.springframework.security.access.SecurityMetadataSource#getAllConfigAttributes() 
     */    
    public Collection<ConfigAttribute> getAllConfigAttributes() {  
        return null;  
    }  
  
    /* 
     * <p>Title: getAttributes</p> 
     * <p>Description: </p> 
     * @param arg0 
     * @return 
     * @throws IllegalArgumentException 
     * @see org.springframework.security.access.SecurityMetadataSource#getAttributes(java.lang.Object) 
     */  
 
    public Collection<ConfigAttribute> getAttributes(Object object)  
            throws IllegalArgumentException {  
        //object 是一个URL ,为用户请求URL  
        String url = ((FilterInvocation)object).getRequestUrl();  
       if("/".equals(url)){  
           return null;  
       }  
        int firstQuestionMarkIndex = url.indexOf(".");  
        //判断请求是否带有参数 如果有参数就去掉后面的后缀和参数(/index.do  --> /index)  
        if(firstQuestionMarkIndex != -1){  
            url = url.substring(0,firstQuestionMarkIndex);  
        }  
          
        FilterInvocation filterInvocation = (FilterInvocation) object;
        
        Iterator<String> ite = resourceMap.keySet().iterator();  
        
        //取到请求的URL后与上面取出来的资源做比较  
        while (ite.hasNext()) {  
            String resURL = ite.next();  
            
            RequestMatcher requestMatcher = new AntPathRequestMatcher(resURL);
            if(requestMatcher.matches(filterInvocation.getHttpRequest())) {
                return resourceMap.get(resURL);
            }
        }  
        return null;  
    }  
  
  
    /* 
     * <p>Title: supports</p> 
     * <p>Description: </p> 
     * @param arg0 
     * @return 
     * @see org.springframework.security.access.SecurityMetadataSource#supports(java.lang.Class) 
     */  
   
    public boolean supports(Class<?> arg0) {  
        // TODO Auto-generated method stub  
        return true;  
    }  
}  