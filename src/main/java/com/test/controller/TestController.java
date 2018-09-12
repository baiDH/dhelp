package com.test.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.test.bean.Test;
import com.test.servlet.TestServletImpl;

@Controller
public class TestController {
	@Resource
	TestServletImpl testServlet;
	
	@RequestMapping("/test")
	public ModelAndView test(){
		Test test = new Test();
		test.setAge("18");
		test.setName("tanny");
		test.setSex("women");
		Test testJsp = testServlet.selectInfo(test);
		ModelAndView mav = new ModelAndView();
		mav.addObject("testAtai", testJsp);
		mav.setViewName("test");
		return mav;
	}
	
	@RequestMapping(value="/adivTest",produces = {"application/json;charset=UTF-8;"},method=RequestMethod.POST)
	public  @ResponseBody Test secTestMethod(@RequestBody Map<String,String> map){
		Test test = new Test();
		test.setAge(map.get("age"));
		test.setName(map.get("name"));
		test.setSex("women");
		Test testJsp = testServlet.selectInfo(test);
		return testJsp;
	}
	@RequestMapping(value="/bdivTest",produces = {"application/json;charset=UTF-8;"},method=RequestMethod.POST)
	public  @ResponseBody Test setbTestMethod(@RequestBody Map<String,String> map){
		Test test = new Test();
		test.setAge(map.get("age"));
		test.setName(map.get("name"));
		test.setSex("women");
		Test testJsp = testServlet.selectInfo(test);
		return testJsp;
	}
}
