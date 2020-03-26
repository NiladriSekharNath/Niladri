package com.cogizant.springboot.springbootdemo26;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SpringBootDemo26Controller {
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String showView() {
		return "hello";
	}
}
