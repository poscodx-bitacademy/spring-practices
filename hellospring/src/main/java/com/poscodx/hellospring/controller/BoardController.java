package com.poscodx.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @RequestMapping 메서드 단독 매핑
 * 
 */

@Controller
public class BoardController {
	
	@ResponseBody
	@RequestMapping("/board/write")
	public String write() {
		return "BoardController.write()";
	}

	@ResponseBody
	/**
	 *  /board/view/10
	 *
	 */
	@RequestMapping("/board/view/{no}")
	public String view1(@PathVariable("no") Long no) {
		return "BoardController.view(" + no + ")";
	}

	@ResponseBody
	/*
	 * /board/view?no=10
	 * 
	 */
	@RequestMapping("/board/view")
	public String view2(Long no) {
		return "BoardController.view(" + no + ")";
	}
	
}
