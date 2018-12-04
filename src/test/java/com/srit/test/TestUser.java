package com.srit.test;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.srit.controller.TbUserController;
import com.srit.mapper.TbUserMapper;
import com.srit.service.TbUserService;

public class TestUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testSql();
		testSql2();
		testSql3();
	}
	
	
	private static void testSql() {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/application*.xml");
		TbUserMapper mapper = (TbUserMapper)applicationContext.getBean("tbUserMapper");
        Map map = mapper.findUserByUid("1");
        System.out.println("map==="+map);
	}
	
	private static void testSql2() {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/application*.xml");
		TbUserService service = (TbUserService)applicationContext.getBean("tbUserServiceImpl");
        Map map = service.findUserByUid("2");
        System.out.println("map==="+map);
	}
	
	
	private static void testSql3() {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/*.xml");
		TbUserController action = (TbUserController)applicationContext.getBean("tbUserController");
        Object object = action.findUserByUid("3");
        System.out.println("object==="+object);
	}
	

}
