package com.poscodx.container.videosystem;

public class Avengers implements DigitalVideoDisc {
	private String title = "Avengers";
	private String studio = "MARVEL";
	
	@Override
	public String play() {
		return "Playing Movie " + studio + "'s " + title;
	}
}
