/**
* <p>Title: JdbcFilterInvocationDefinitionSourceFactoryBean.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2015</p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Aug 13, 2015
* @version 1.0
*/

package com.gaoxy.lifeinusa.security;

import java.beans.PropertyEditor;
import java.beans.PropertyEditorSupport;
/**
* <p>Title: JdbcFilterInvocationDefinitionSourceFactoryBean</p>
* <p>Description: </p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Aug 13, 2015
*/
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.springframework.beans.factory.FactoryBean;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.jdbc.object.MappingSqlQuery;

import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.access.intercept.DefaultFilterInvocationSecurityMetadataSource;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.security.web.access.intercept.RequestKey;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.security.web.util.matcher.RequestMatcher;

import com.gaoxy.lifeinusa.system.tool.Printer;


public class JdbcFilterInvocationDefinitionSourceFactoryBean
    extends JdbcDaoSupport implements FactoryBean {
    private String resourceQuery;

    public boolean isSingleton() {
        return true;
    }

    public Class getObjectType() {
        return FilterInvocationSecurityMetadataSource.class;
    }

    public Object getObject() {
        return new DefaultFilterInvocationSecurityMetadataSource(this.buildRequestMap());
    }

    protected Map<String, String> findResources() {
        ResourceMapping resourceMapping = new ResourceMapping(getDataSource(),
                resourceQuery);

        Map<String, String> resourceMap = new LinkedHashMap<String, String>();

        for (Resource resource : (List<Resource>) resourceMapping.execute()) {
            String url = resource.getUrl();
            String role = resource.getRole();

            if (resourceMap.containsKey(url)) {
                String value = resourceMap.get(url);
                resourceMap.put(url, value + "," + role);
            } else {
                resourceMap.put(url, role);
            }
        }

        return resourceMap;
    }

    protected LinkedHashMap<RequestMatcher, Collection<ConfigAttribute>> buildRequestMap() {
        LinkedHashMap<RequestMatcher, Collection<ConfigAttribute>> 
        
        requestMap = null;
        requestMap = new LinkedHashMap<RequestMatcher, Collection<ConfigAttribute>>();
        
       // ConfigAttributeEditor editor = new ConfigAttributeEditor();
        
        Map<String, String> resourceMap = this.findResources();
        	Printer.Printer(resourceMap);
        
        // 使用urlMatcher和requestMap创建DefaultFilterInvocationDefinitionSource
        for (Map.Entry<String, String> entry : resourceMap.entrySet()) {
            String key = entry.getKey();
            logger.debug("------>>entry.getValue:"+entry.getValue());
            //editor.setAsText(entry.getValue());
          //  requestMap.put(new AntPathRequestMatcher(key),
          //          (Collection<ConfigAttribute>) entry.getValue());
        }
        return requestMap;
        
    }

    public void setResourceQuery(String resourceQuery) {
        this.resourceQuery = resourceQuery;
    }

    private class Resource {
        private String url;
        private String role;

        public Resource(String url, String role) {
            this.url = url;
            this.role = role;
        }

        public String getUrl() {
            return url;
        }

        public String getRole() {
            return role;
        }
    }

    private class ResourceMapping extends MappingSqlQuery {
        protected ResourceMapping(DataSource dataSource,
            String resourceQuery) {
            super(dataSource, resourceQuery);
            compile();
        }

        protected Object mapRow(ResultSet rs, int rownum)
            throws SQLException {
            String url = rs.getString(1);
            String role = rs.getString(2);
            Resource resource = new Resource(url, role);

            return resource;
        }
    }
}

