package com.gaoxy.lifeinusa.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gaoxy.lifeinusa.services.UserService;
import com.gaoxy.lifeinusa.system.SysLogger;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "/partner")
public class PartnerController {
	
	private static final Logger logger = LoggerFactory.getLogger(PartnerController.class);
	 
	
	@Autowired
	UserService userservice;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/index", method = RequestMethod.POST)
	public String home(Locale locale, Model model) {
		logger.debug("Welcome home! The client locale is {}.");
		//System.out.println("--------------------------------------------------------");
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("userTestList", userservice.getTestUserList() );
		model.addAttribute("userDataList", userservice.getUserListbyHibernate() );
		
		
		return "partner/pdashboard";
	}

	/**
	 * @return the userservice
	 */
	public UserService getUserservice() {
		return userservice;
	}

	/**
	 * @param userservice the userservice to set
	 */
	public void setUserservice(UserService userservice) {
		this.userservice = userservice;
	}
	
	
	
}
