package com.srit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.srit.service.TbUserService;

/*
 * controller
 */
@Controller
@RequestMapping("/tbUser")
public class TbUserController {

	@Autowired
	private TbUserService tbUserService;
	
	@RequestMapping("/testModel")
	public Object testModel(){
		return "index";
	}
	
	@RequestMapping(value="/findUserByUid/{uid}")
	@ResponseBody
	public Object findUserByUid(@PathVariable String uid){
		return tbUserService.findUserByUid(uid);
	}
	

	
}
