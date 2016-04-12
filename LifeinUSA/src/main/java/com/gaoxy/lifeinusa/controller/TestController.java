/**
* <p>Title: TestController.java</p>
* <p>Description: </p>
* <p>Copyright: Copyright (c) 2015</p>
* <p>Company: gaoxy</p>
* @author steven.gaoxy
* @date Aug 18, 2015
* @version 1.0
*/

package com.gaoxy.lifeinusa.controller;

import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gaoxy.lifeinusa.entities.User;
import com.gaoxy.lifeinusa.services.UserService;

@Controller
@RequestMapping(value = "/test")
public class TestController {
	private static final Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@Autowired
	UserService userservice;
	
	@RequestMapping(value ="/index")
	@ResponseBody
	public String showTestRoot(){
		logger.debug("------>>\nEnter controller test");
		StringBuffer sb=new StringBuffer();
		
		sb.append("<!doctype html>");
		sb.append("<html><body>");
		sb.append("<h1>Test Method List</h1>");
		sb.append("<ul>");
		sb.append("<li><a href=\"./showallusers\">ShowAllUsers</a></li>");
		sb.append("</ul></body></html>");
		
		return sb.toString();
	}
	
	@RequestMapping(value ="/showallusers")
	@ResponseBody
	public String echoMethod(){
		logger.debug("------>>\nEnter controller test");
		StringBuffer sb=new StringBuffer();
		
		List ls=userservice.getTestUserList();
		Iterator it=ls.iterator();
		
		
		while(it.hasNext()){
			
			sb.append(it.next().toString()+"<br/>");
		}
		
		return sb.toString();
	}
	
	
	
}
