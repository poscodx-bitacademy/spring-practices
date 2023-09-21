package com.poscodx.fileupload.service;

import java.io.File;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileUploadService {
	private static String SAVE_PATH = "/mysite-uploads";
	
	public String restore(MultipartFile file) {
		String url = null;
		
		File uploadDirectory = new File(SAVE_PATH);
		if(!uploadDirectory.exists()) {
			uploadDirectory.mkdirs();
		}
		
		if(file.isEmpty()) {
			return url;
		}
		
		System.out.println(file.getOriginalFilename());
		
		return url;
	}

}
