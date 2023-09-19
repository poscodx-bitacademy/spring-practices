package com.poscodx.aoptest.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.poscodx.aoptest.service.ProductService;
import com.poscodx.aoptest.vo.ProductVo;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("config/applicationContext.xml");
		
		ProductService ps = ac.getBean(ProductService.class);
		ProductVo vo = ps.find("TV");
		System.out.println(vo);
		
		((AbstractApplicationContext)ac).close();
	}

}
