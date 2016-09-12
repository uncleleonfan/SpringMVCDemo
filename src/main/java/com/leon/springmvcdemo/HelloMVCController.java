package com.leon.springmvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloMVCController {
	
	@RequestMapping("/mvc")
	public String helloMvc() {
		//host:8080/hello/mvc
		System.out.print("hello mvc");
		return "home";
	}

}
