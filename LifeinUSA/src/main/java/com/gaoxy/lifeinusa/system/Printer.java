/**
* <p>Title: Printer.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2015</p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Jul 17, 2015
* @version 1.0
*/

package com.gaoxy.lifeinusa.system;

import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;

/**
* <p>Title: Printer</p>
* <p>Description: </p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Jul 17, 2015
*/
public  class  Printer {

	
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
			} catch (ClassNotFoundException | IllegalArgumentException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
	       
			
		}
}
