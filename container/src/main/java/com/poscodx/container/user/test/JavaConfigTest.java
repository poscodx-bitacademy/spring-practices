package com.poscodx.container.user.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.poscodx.container.config.user.AppConfig;
import com.poscodx.container.user.Friend;
import com.poscodx.container.user.User;

public class JavaConfigTest {

	public static void main(String[] args) {
		testJavaConfigTest();
	}

	private static void testJavaConfigTest() {
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		
		User user = ac.getBean(User.class);
		System.out.println(user);
		
		Friend friend = ac.getBean(Friend.class);
		System.out.println(friend);
	}

}
