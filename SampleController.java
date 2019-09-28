package com.example.demomysql;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	@RequestMapping("/index")
	public String index() {
		return "hello spring boot!!";
	}
	
	@RequestMapping("/query")
	public String str() {
		return "query spring boot!!";
	}
	
	
	

}
