package com.example.SpringBootWeb.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeController {
	@RequestMapping(value="/")
	public String hello() {
		return "Welcome to the Web Application";
	}
}
