package com.poscodx.fileupload.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileUploadController {

	@RequestMapping("/form")
	public String form() {
		return "form";
	}
	
	@RequestMapping(value="/upload", method=RequestMethod.POST)
	public String upload(String email, MultipartFile file, Model model) {
		System.out.println("--->" + email);
		
		/* 이미지 파일 업로드 처리 */
		String url = "";

		model.addAttribute("url", url);
		return "result";
	}
}
