package com.poscodx.logex1.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ExampleController {
	
	/**
	 *  Logger 생성
	 */
	private static final Log LOG = LogFactory.getLog( ExampleController.class );
	
	@RequestMapping( "/ex1" )
	@ResponseBody
	public String ex1() {
		
		/**
		 *  이 예제에서는 logback.xml 에서,
		 *  
		 *  1. consoleAppender 와 root logger 만 세팅해서 테스트 해 볼 수 있습니다. 
		 *  2. root logger의 level="DEBUG" 조정해 봅니다.
		 *  
		 *  3. 테스트 해보면,
		 *     DEBUG  > INFO > WARN > ERROR 순으로 로그가 출력 되는 것을 확인할
		 *     수 있습니다.
		 *     
		 *     가령, WARN 설정하면, warn, error 메서드의 로그 메세지만 출력 됩니다.
		 *     직접 테스트 해 보세요.
		 *  
		 */
		LOG.debug( "#ex1 - debug log" );
		LOG.info( "#ex1 - info log" );
		LOG.warn( "#ex1 - warn log" );
		LOG.error( "#ex1 - error log" );
		
		return "Logback Logging Example1";
	}
}
