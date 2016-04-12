package com.gaoxy.lifeinusa.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gaoxy.lifeinusa.entities.TWxAppinfo;
import com.gaoxy.lifeinusa.services.UserService;
import com.gaoxy.lifeinusa.services.WeixinService;
import com.gaoxy.lifeinusa.system.SysLogger;
import com.google.gson.Gson;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "/partner")
public class PartnerController {
	
	private static final Logger logger = LoggerFactory.getLogger(PartnerController.class);
	 
	
	@Autowired
	UserService userservice;
	@Autowired
	WeixinService weixinservice;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/index")
	public String home(Locale locale, Model model) {
		logger.debug("Welcome home! The client locale is {}.");
		//System.out.println("--------------------------------------------------------");
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("userTestList", userservice.getTestUserList() );
		model.addAttribute("userDataList", userservice.getUserListbyHibernate() );
		
		
		return "partner/dashboard";
	}
	
	
	@RequestMapping(value = "/dashboard")
	public String dashboard(Locale locale, Model model) {
		logger.debug("Welcome home! The client locale is {}.");
		//System.out.println("--------------------------------------------------------");
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("userTestList", userservice.getTestUserList() );
		model.addAttribute("userDataList", userservice.getUserListbyHibernate() );
		
		
		return "partner/dashboard";
	}
	
	@RequestMapping(value = "/profile")
	public String profile(Locale locale, Model model) {
		logger.debug("Welcome home! The client locale is {}.");
		//System.out.println("--------------------------------------------------------");
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("userTestList", userservice.getTestUserList() );
		model.addAttribute("userDataList", userservice.getUserListbyHibernate() );
		
		
		return "partner/profile";
	}
	
	@RequestMapping(value = "/message")
	public String message(Locale locale, Model model) {
		logger.debug("Welcome home! The client locale is {}.");
		//System.out.println("--------------------------------------------------------");
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("userTestList", userservice.getTestUserList() );
		model.addAttribute("userDataList", userservice.getUserListbyHibernate() );
		
		
		return "partner/message";
	}
	
	@RequestMapping(value = "/wx_dashboard")
	public String wx_dashboard(Locale locale, Model model) {
		logger.debug("Welcome home! The client locale is {}.");
		//System.out.println("--------------------------------------------------------");
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("userTestList", userservice.getTestUserList() );
		model.addAttribute("userDataList", userservice.getUserListbyHibernate() );
		
		
		return "partner/wx_dashboard";
	}
	
	@RequestMapping(value = "/wx_letters")
	public String wx_letters(Locale locale, Model model) {
		logger.debug("Welcome home! The client locale is {}.");
		//System.out.println("--------------------------------------------------------");
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("userTestList", userservice.getTestUserList() );
		model.addAttribute("userDataList", userservice.getUserListbyHibernate() );
		
		
		return "partner/wx_letters";
	}
	
	@RequestMapping(value = "/wx_pages_pool")
	public String wx_pages_pool(Locale locale, Model model) {
		logger.debug("Welcome home! The client locale is {}.");
		//System.out.println("--------------------------------------------------------");
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("userTestList", userservice.getTestUserList() );
		model.addAttribute("userDataList", userservice.getUserListbyHibernate() );
		
		
		return "partner/wx_pages_pool";
	}
	
	@RequestMapping(value = "/wx_post")
	public String wx_post(Locale locale, Model model) {
		logger.debug("Welcome home! The client locale is {}.");
		//System.out.println("--------------------------------------------------------");
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("userTestList", userservice.getTestUserList() );
		model.addAttribute("userDataList", userservice.getUserListbyHibernate() );
		
		
		return "partner/wx_post";
	}
	
	@RequestMapping(value = "/wx_resource")
	public String wx_resource(Locale locale, Model model) {
		logger.debug("Welcome home! The client locale is {}.");
		//System.out.println("--------------------------------------------------------");
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("userTestList", userservice.getTestUserList() );
		model.addAttribute("userDataList", userservice.getUserListbyHibernate() );
		
		
		return "partner/wx_resource";
	}

	
	@RequestMapping(value = "/wx_settings")
	public String wx_settings(Locale locale, Model model) {
		logger.debug("Welcome home! The client locale is {}.");
		//System.out.println("--------------------------------------------------------");
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("userTestList", userservice.getTestUserList() );
		model.addAttribute("userDataList", userservice.getUserListbyHibernate() );
		
		
		return "partner/wx_settings";
	}
	
	@RequestMapping(value = "/wx_upload")
	public String wx_upload(Locale locale, Model model) {
		logger.debug("Welcome home! The client locale is {}.");
		//System.out.println("--------------------------------------------------------");
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("userTestList", userservice.getTestUserList() );
		model.addAttribute("userDataList", userservice.getUserListbyHibernate() );
		
		
		return "partner/wx_upload";
	}
	
	@RequestMapping(value = "rest/wx/add_update")
	@ResponseBody
	public String add_update(
			 @RequestParam("servicetype") String servicetype,
			 @RequestParam("appname") String appname,
			 @RequestParam("appdesc") String appdesc,
			 @RequestParam("appid") String appid,
			 @RequestParam("appsecret") String appsecret){
		logger.debug("------>>Enter ");
		TWxAppinfo wx=weixinservice.addNewApp(appid, appname, appdesc, appsecret, servicetype, this.getUserDetail().getUsername());
		
		Gson gs=new Gson();
		String json=gs.toJson(wx);
		logger.debug("------>>transfer to json"+json);
		return json;
	}
	
	
	
	@RequestMapping(value = "/request")
	@ResponseBody
	public String request(Locale locale, Model model) {
		logger.debug("Welcome home! The client locale is {}.");
		//System.out.println("--------------------------------------------------------");
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("userTestList", userservice.getTestUserList() );
		model.addAttribute("userDataList", userservice.getUserListbyHibernate() );
		
		
		return "partner/wx_upload";
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
	
	
	private UserDetails getUserDetail(){
		return (UserDetails) SecurityContextHolder.getContext()
	    .getAuthentication()
	    .getPrincipal();
	}

	private String getUserName(){
		String userName = getUserDetail().getUsername();
		return userName;
	}
	
	
}
