package com.example.demomysql.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demomysql.bean.User;
import com.example.demomysql.service.UserService;


@RestController 
public class DemoController {
	
	 @Autowired
	 private UserService userService;	
	
	 @GetMapping("/query")
	 public User testQuery() {
	        return userService.selectUserByName("Daisy");
	    }
	 
	 @GetMapping("/found_all")
	 public List<User> findAll() {
	        return userService.selectAllUser();
	    }
	 
	 @RequestMapping(value = "/addUser", method = RequestMethod.POST)
	    public String addUser(@RequestParam("name") String name,
	                          @RequestParam("age") Integer age,
	                          @RequestParam("money") double money){
	        int flag = userService.addUser(name, age, money);
	        if (flag == 1){
	            return "success";
	        }else {
	            return "fail";
	    }
	 }
}
