package com.tyss.productassessment.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.tyss.productassessment.dto.Retailer;
import com.tyss.productassessment.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService service;
	@InitBinder
	public void InitBinder(WebDataBinder binder) {
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		CustomDateEditor editor = new CustomDateEditor(format, true);
		binder.registerCustomEditor(Date.class, editor);
	}
	
	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}//end of loginpage()
	@PostMapping("/login")
	public String login(int id , String password, HttpServletRequest request) {
		
		Retailer bean = service.login(id, password);
		if(bean == null) {
			request.setAttribute("msg", "Invalid Credentials");
			return "login";
		}else {
			HttpSession session = request.getSession();
			session.setAttribute("bean", bean);
			return "home";
		}
	}//end of login()
	
	@GetMapping("/register")
	public String registerPage() {
		return "register";
	}//end of registerPage()
	
	@PostMapping("/register")
	public String register(Retailer bean, ModelMap map) {
		int check = service.register(bean);
		if(check>0) {
			map.addAttribute("msg", "You are Registered and Id is "+check);
		}else {
			map.addAttribute("msg", "Email is repeated");
		}
		return "login";
	}//end of register()

	@GetMapping("/home")
	public String home(ModelMap map,@SessionAttribute(name = "bean", required = false) Retailer bean) {
		if(bean == null) {
			map.addAttribute("msg", "login first!!!!!!!!");
			return "login";
		}else {
			return "home";
		}
	}//end of home()
	
	@PostMapping
	public String home() {
		return "home";
	}//end of home()
	
	@GetMapping("/search")
	public String search(@RequestParam("id")int id, ModelMap map) {
		Retailer bean = service.searchProduct(id);
		if(bean == null) {
			map.addAttribute("msg", "Data Not Found");
		}else {
			map.addAttribute("bean", bean);
		}
		return "home";
	}//end of search()
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "login";
	}//end of logout()
	@GetMapping("/delete")
	public String deleteProfile(HttpSession session) {
		Retailer bean = (Retailer)session.getAttribute("bean");
		try {
		service.deleteProduct(bean.getId());
		}catch(Exception e) {
			e.printStackTrace();
		}
		session.invalidate();
		return "login";
	}//end of deleteProfile
	
	@GetMapping("/changePassword")
	public String changePassword(HttpServletRequest request) {
		
		HttpSession session = request.getSession(false);
		if(session != null) {
			return "changePassword";
		}else {
			return "login";
		}
	}//end of changepassword
	
	@PostMapping("/changepassword")
	public String changepassword(String password1, String password2,@SessionAttribute(name="bean")Retailer bean,ModelMap map){
		if(password1.equals(password2)) {
			service.changePassword(bean.getId(), password1);
			map.addAttribute("msg", "password changed");
		}else {
			map.addAttribute("msg", "password not matching");
		}
		return "home";
			
	}
	}
