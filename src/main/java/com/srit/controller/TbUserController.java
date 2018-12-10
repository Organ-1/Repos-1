package com.srit.controller;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.srit.service.TbUserService;

/*
 * controller
 */
@Controller
@RequestMapping("/tbUser")
public class TbUserController {
	
	private static final Logger logger = LoggerFactory.getLogger(TbUserController.class);

	@Autowired
	private TbUserService tbUserService;
	
	@RequestMapping("/testModel")
	public Object testModel(){
		return "index";
	}
	
	@RequestMapping(value="/findUserByUid/{uid}")
	@ResponseBody
	public Object findUserByUid(@PathVariable String uid){
		logger.debug("debug=="+uid);
		logger.info("info=="+uid);
		return tbUserService.findUserByUid(uid);
	}   
	
	@RequestMapping(value="/doUpload",method=RequestMethod.POST)
    public String doUploadFile(@RequestParam("file")MultipartFile file) throws IOException{
        if (!file.isEmpty()) {
            logger.info("Process file:{}",file.getOriginalFilename());
        }
//        FileUtils.copyInputStreamToFile(file.getInputStream(), new File("E:\\",System.currentTimeMillis()+file.getOriginalFilename()));
        return "succes";
    }
	
}
