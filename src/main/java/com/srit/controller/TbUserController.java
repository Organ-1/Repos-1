package com.srit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@RequestMapping("/findUserByUid/{uid}")
	@ResponseBody
	public Object findUserByUid(String uid){
		return tbUserService.findUserByUid(uid);
	}
	

	
}
