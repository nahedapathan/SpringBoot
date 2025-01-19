package com.nk.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nk.main.model.User;
import com.nk.main.service.UserService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class MyController {

	@Autowired
	UserService userService;
	
	@GetMapping("/regPage")
	public String openRegPage(Model model)
	{
		model.addAttribute("user",new User());
		return "register";
	}
	
	@PostMapping("/regForm")
	public String submitRegForm(@ModelAttribute("user") User user,Model model)
	{
		boolean status=userService.registerUser(user);
		
		if(status)
		{
			model.addAttribute("successMsg", "User Registered Successfully");
		}
		else
		{
			model.addAttribute("errorMsg", "User not Registered Successfully");
		}
		return "register";
	}
	
	@GetMapping("/loginPage")
	public String openLoginPage(Model model)
	{
		model.addAttribute("user", new User());
		return "login";
	}
	
	@PostMapping("/loginForm")
	public String submitLoginForm(@ModelAttribute("user") User user,HttpSession session,Model model)
	{
		User validUser=userService.loginUser(user.getEmail(), user.getPassword());
		
		if(validUser != null)
		{
			//session.setAttribute("loggedInUser", validUser);
			model.addAttribute("loggedInUser", validUser);
			return "profile";
		}
		else
		{
			model.addAttribute("errorMsg","Email id and Password didnt Matched");
			return "login";
		}
	}
    
    
    @GetMapping("/logout")
    public String logoutUser(HttpServletRequest req)
    {
    	HttpSession session=req.getSession(false);
    	if(session!=null)
    	{
    		session.invalidate();
    	}
    	
    	return "redirect:/loginPage";
    }
	
}
