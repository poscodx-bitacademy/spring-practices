package com.poscodx.container.videosystem.mixing;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.poscodx.container.videosystem.Avengers;
import com.poscodx.container.videosystem.BlankDisc;
import com.poscodx.container.videosystem.DigitalVideoDisc;

@Configuration
public class DVDConfig {
	@Bean
	public DigitalVideoDisc avengers() {
		return new Avengers();
	}

	@Bean
	public DigitalVideoDisc avengersInfiniteWar() {
		BlankDisc dvd = new BlankDisc();
		dvd.setStudio("MARVEL");
		dvd.setTitle("Avengers Infinite War");
		
		return dvd;
	}
}
