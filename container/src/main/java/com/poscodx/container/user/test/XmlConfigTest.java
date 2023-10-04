package com.poscodx.container.user.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.poscodx.container.user.User;

public class XmlConfigTest {
	
	public static void main(String[] args) {
		// XML Auto Configuration(Annotation Scanning)
		// testApplicationContext01();

		// XML Bean Configuration(Explicit Configuration)
		testApplicationContext02();
		
		// XML Auto Configuration(Annotation Scanning)
		// testBeanFactory01();

		// XML Bean Configuration(Explicit Configuration)
		// testBeanFactory02();
	}

	private static void testApplicationContext01() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/poscodx/container/config/user/applicationContext01.xml");
		
		User user = null;
		
		user = ac.getBean(User.class);
		System.out.println(user.getName());
		
		// Annotation Scan(Auto Congiuration) 에서는 Bean id가 자동으로 부여된다.
		user = (User)ac.getBean("user");
		System.out.println(user.getName());
	}

	private static void testApplicationContext02() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/poscodx/container/config/user/applicationContext02.xml");
		
		User user = null;
		
		// id로 빈 가져오기
		user = (User)ac.getBean("user");
		System.out.println(user.getName());

		// name으로 빈 가져오기
		user = (User)ac.getBean("usr");
		System.out.println(user.getName());

		// Type으로 빈 가져오기
		// 같은 타입의 빈이 2개이상 있으면 Type으로 가져오기는 실패
		user = ac.getBean("user2", User.class);
		System.out.println(user);
		
		// 파라미터 2개인 생성자로 생성된 빈I 가져오기
		user = ac.getBean("user3", User.class);
		System.out.println(user);

		// 파라미터 2개인 생성자로 생성된 빈II 가져오기
		user = ac.getBean("user4", User.class);
		System.out.println(user);

		// setter를 사용한 빈I 가져오기
		user = ac.getBean("user5", User.class);
		System.out.println(user);

		// setter를 사용한 빈II 가져오기: DI
		user = ac.getBean("user6", User.class);
		System.out.println(user);

		// setter를 사용한 빈III 가져오기: Collection Property
		user = ac.getBean("user7", User.class);
		System.out.println(user);
	}
	
	private static void testBeanFactory02() {
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("com/poscodx/container/config/user/applicationContext02.xml"));
		User user = bf.getBean("user", User.class);
		System.out.println(user.getName());
	}

	private static void testBeanFactory01() {
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("com/poscodx/container/config/user/applicationContext01.xml"));
		User user = bf.getBean(User.class);
		System.out.println(user.getName());
	}
}
