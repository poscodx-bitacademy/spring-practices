package com.poscodx.logex3.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ExampleController3 {
	
	/**
	 *  Logger 생성
	 */
	private static final Log LOG = LogFactory.getLog(ExampleController3.class);
	
	@RequestMapping( "/ex3" )
	@ResponseBody
	public String ex2() {
		
		/**
		 *  이 예제에서는 logback.xml 에서,
		 *  
		 *  1. fileAppender3 와 "com.poscodx.logex3" logger 를 살펴 보아야 합니다.
		 *  
		 *  2. fileAppender3 에서는 /logex/logex3.log 로그파일 지정과
		 *  
		 *  3. 1MB 가 넘었을 때, /logex/logex3.x.log.zip 으로 압축되고 새로 
		 *     logex3.log 파일이 생성되는 것을 확인해 봐야 합니다.
		 *    
		 *  4. 새로운 로거를 세팅하고 있습니다.
		 *     "com.poscodx.logex3" 로거인데, 콘솔과 파일로 로그를 남기고 있는 것을 확인해야
		 *     합니다.
		 *     
		 *  5. 이 로거의 로그 레벨이 WARN 인 것도 로그 파일에서 확인해 보세요.   
		 */
		LOG.debug( "#ex3 - debug log" );
		LOG.info( "#ex3 - info log" );
		LOG.warn( "#ex3 - warn log" );
		LOG.error( "#ex3 - error log" );
		
		return "Logback Logging Example3";
	}
}
