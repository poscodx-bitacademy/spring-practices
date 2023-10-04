package com.poscodx.container.user.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigTest {

	public static void main(String[] args) {
		testJavaConfigTest();
	}

	private static void testJavaConfigTest() {
		new AnnotationConfigApplicationContext(AppConfig.class);
	}

}
