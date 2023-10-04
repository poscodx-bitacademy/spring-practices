package com.poscodx.container.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer {
	@Autowired
	private CompactDisc cd;
	
	public String play() {
		return cd.play();
	}

}
