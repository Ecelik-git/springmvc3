package com.techproedu4.springmvc4;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class ResultController {
	
//	@RequestMapping("add")
//	public String sumOfNumbers(HttpServletRequest reg) {
//		
//		
//		int a=Integer.parseInt(reg.getParameter("n1"));
//		int b=Integer.parseInt(reg.getParameter("n2"));
//		
//		String name=reg.getParameter("n3");
//		
//		
//		int sum=a+b;
//		int difference=a-b;
//		int product=a*b;
//		double division=a/b;
//		
//		
//		
//		HttpSession session=reg.getSession();
//		session.setAttribute("sumOfNum",sum);
//		session.setAttribute("difference", difference);
//		session.setAttribute("product", product);
//		session.setAttribute("division", division);
//		session.setAttribute("name", name);
//		
//		
//		return "result.jsp";
//		
//		
//	}	
	
	
	
	
//	@RequestMapping("add")
//	public String sumOfNumbers(@RequestParam("n1") int a,@RequestParam("n2") int b,@RequestParam("n3") String name,HttpSession session ) {
//		
//		
//		
//		
//		
//		int sum=a+b;
//		int difference=a-b;
//		int product=a*b;
//		double division=a/b;
//		
//		
//		
//		
//		session.setAttribute("sumOfNum",sum);
//		session.setAttribute("difference", difference);
//		session.setAttribute("product", product);
//		session.setAttribute("division", division);
//		session.setAttribute("name", name);
//		
//		
//		return "result.jsp";
//		
//		
//	}	
	
//	@RequestMapping("add")
//	public ModelAndView sumOfNumbers(@RequestParam("n1") int a,@RequestParam("n2") int b,@RequestParam("n3") String name) {
//		
//		ModelAndView mw=new ModelAndView();
//		mw.setViewName("result.jsp");
//		
//		
//		
//		int sum=a+b;
//		int difference=a-b;
//		int product=a*b;
//		double division=a/b;
//		
//		
//		
//		mw.addObject("sumOfNum",sum);
//		mw.addObject("difference", difference);
//		mw.addObject("product", product);
//		mw.addObject("division", division);
//		mw.addObject("name", name);
//		
//		
//		return mw;
//		
//		
//	}
	
	
	
//	@RequestMapping("add")
//	public ModelAndView sumOfNumbers(@RequestParam("n1") int a,@RequestParam("n2") int b,@RequestParam("n3") String name) {
//		
//		ModelAndView mw=new ModelAndView("result.jsp");
//		
//		int sum=a+b;
//		int difference=a-b;
//		int product=a*b;
//		double division=a/b;
//		
//
//		mw.addObject("sumOfNum",sum);
//		mw.addObject("difference", difference);
//		mw.addObject("product", product);
//		mw.addObject("division", division);
//		mw.addObject("name", name);
//		
//		
//		return mw;
//		
//	}
	
//	@RequestMapping("add")
//	public String sumOfNumbers(@RequestParam("n1") int a,@RequestParam("n2") int b,@RequestParam("n3") String name,Model m) {
//		
//		
//		
//		int sum=a+b;
//		int difference=a-b;
//		int product=a*b;
//		double division=a/b;
//		
//
//		m.addAttribute("sumOfNum",sum);
//		m.addAttribute("difference", difference);
//		m.addAttribute("product", product);
//		m.addAttribute("division", division);
//		m.addAttribute("name", name);
//		
//		
//		return "result.jsp";
//		
//		
//	}
	
	
	
	
	//@RequestMapping("add")
//	public String sumOfNumbers(@RequestParam("num1") int a,@RequestParam("num2") int b, ModelMap mm) {
//		
//		
//		
//		int sum=a+b;
//		int difference=a-b;
//		int product=a*b;
//		double division=a/b;
//		
//		mm.addAttribute("sumOfNum",sum);
//		mm.addAttribute("Difference", difference);
//		mm.addAttribute("Product", product);
//		mm.addAttribute("Division", division);
//		//mm.addAttribute("name", name);
//		
//		
//		return "result.jsp";
//		
//		
//	}
	
	@RequestMapping(value="list", method=RequestMethod.GET)
	public String list(Model m) {
		List<String> student = new ArrayList<>();
		student.add("serhat");
		student.add("kemal");
		student.add("david");
		m.addAttribute("student", student);
		return "result.jsp";
		
		
	}
	
	
	
	
}
