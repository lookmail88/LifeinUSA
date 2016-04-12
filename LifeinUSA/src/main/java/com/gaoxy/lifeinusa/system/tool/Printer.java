/**
* <p>Title: Printer.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2015</p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Jul 17, 2015
* @version 1.0
*/

package com.gaoxy.lifeinusa.system.tool;

import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gaoxy.lifeinusa.weixin.Weixin;

/**
* <p>Title: Printer</p>
* <p>Description: </p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Jul 17, 2015
*/
public  class  Printer {
	private static final Logger logger = LoggerFactory.getLogger(Printer.class);
	
		public static void printEntityList(String classname,List ls ){
		
			try {
				
				Class<?> c = null;  
				c = Class.forName(classname);
				
	        	Iterator it=ls.iterator();
	        	while(it.hasNext()){
	        		c=it.next().getClass();
	        		Field [] fields = c.getDeclaredFields(); 
	        		for(Field f:fields){  
			            f.setAccessible(true);  
			            String field = f.toString().substring(f.toString().lastIndexOf(".")+1);
			            System.out.println(field+"="+f.get(c));
			        } 
	        	}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  catch( IllegalArgumentException e ){
				e.printStackTrace();
			}catch(IllegalAccessException e){
				e.printStackTrace();
			}
		}
		
		public static void printEntity(String classname,Object  o){
			
			try {
				Class c=Class.forName(classname);
				Field[] fields=c.getFields();
				
				for(Field f:fields){
					f.setAccessible(true);  
		            String field = f.toString().substring(f.toString().lastIndexOf(".")+1);
		            logger.debug(field+"="+f.get(o));
					
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  catch( IllegalArgumentException e ){
				e.printStackTrace();
			}catch(IllegalAccessException e){
				e.printStackTrace();
			}
		}
		
		public static void Print(List list) {

			Iterator it = list.iterator();
			while (it.hasNext()) {
				logger.debug("------>>"+it.next().toString());

			}
		}
		
		public static void Printer(Map m) {
			
			Set en=m.keySet();
			
			Iterator it=en.iterator();
			
			while(it.hasNext()){
				Object key=it.next();
				logger.debug(key.toString()+"="+m.get(key));
			}
			
		}
		
}
