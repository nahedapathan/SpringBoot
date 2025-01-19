package com.nk.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nk.main.model.Employee;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MyuController {

	@GetMapping("login")
	public String login()
	{
		return "login";
	}
	
	@GetMapping("checklogin")
	public String checkLogin(HttpServletRequest req)
	{
		String uname=req.getParameter("uname");
		String upass=req.getParameter("upass");
		req.setAttribute("uname", uname);
		if(uname.equals("abc") && upass.equals("123"))
		{
			  return "dashboard";
		}
		else
		{
			  return "login";
		}
	}
	
	@GetMapping("empForm")
	public String empForm()
	{
		return "empForm";
	}
	
//	@PostMapping("emp")
//	public ModelAndView EmployeeRecord(@ModelAttribute Employee emp,ModelAndView mv)
//	{
//		mv.setViewName("empForm");
//		mv.addObject("employee", emp);
//		
//		return mv;
//	}
	
	@PostMapping("emp")
	public String EmployeeRecord(Employee empObj,Model m)
	{
		m.addAttribute("emp",empObj);
		System.out.println(empObj);
		return "empForm";
	}
	
	@ModelAttribute
	public void modeldata(Model m)
	{
		m.addAttribute("key","Welcome to My Classes");
	}
	
}
