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
import org.springframework.web.bind.annotation.RequestParam;

import com.gaoxy.lifeinusa.entities.TSecurityUser;
import com.gaoxy.lifeinusa.entities.User;
import com.gaoxy.lifeinusa.services.UserService;
import com.gaoxy.lifeinusa.system.SysLogger;
import com.gaoxy.lifeinusa.system.SystemConfig;
import com.gaoxy.lifeinusa.system.tool.HashGeneratorUtils;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "/login")
public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	 
	
	@Autowired
	UserService userservice;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/loginmodel")
	public String home(Locale locale, Model model) {
		logger.debug("Welcome home! The client locale is {}.");
		//System.out.println("--------------------------------------------------------");
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("_csrf.parameterName", "" );
		model.addAttribute("_csrf.token",date.getTime());
		
		
		return "login/loginmodel";
	}
	
	@RequestMapping(value = "/signup")
	public String signup(
						 @RequestParam("firstname") String firstname,
						 @RequestParam("lastname") String lastname,
						 @RequestParam("password") String password,
						 @RequestParam("repassword") String repassword,
						 @RequestParam("email") String email,
						 @RequestParam("phone") String phone,
						 @RequestParam("vcode") String vcode
			) {
		logger.debug("Enter login signup controller");
		//System.out.println("--------------------------------------------------------");
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
		String formattedDate = dateFormat.format(date);
		
		User u=new User();
		u.setEmail(email);
		u.setFirstName(firstname);
		u.setLastName(lastname);
		u.setMobilePhone(phone);
		u.setPassword(HashGeneratorUtils.generateMD5(password));
		u.setUserType(com.gaoxy.lifeinusa.system.SystemConfig.User_Type_Partner);
		
		String rstring="";
		boolean addresult=userservice.addNewUser(u);
		if(addresult){
			rstring=SystemConfig.Partner_Login_Success;
		}else{
			rstring=SystemConfig.Partner_Login_Failed;
		}
		logger.debug("------>>login controller sign up result:"+rstring);
		return rstring;
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
