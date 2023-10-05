package com.poscodx.container.videosystem;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.poscodx.container.config.videosystem.DVDPlayerConfig;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes={DVDPlayerConfig.class})
public class DVDPlayerJavaConfigTest {
	@Autowired
	// 같은 타입의 빈이 2개 이상 있는 경우
	// 설정 클래스의 빈생성 메소드의 @Bean의 name(default) 속성으로  Qulify 하기
	@Qualifier("dvdPlayer")
	DVDPlayer dvdPlayer01;
	
	@Autowired
	// 같은 타입의 빈이 2개 이상 있는 경우
	// 설정 클래스의 빈생성 메소드의 이름으로 Qulify 하기
	@Qualifier("dvdPlayer02")
	DVDPlayer dvdPlayer02;

	@Autowired
	@Qualifier("dvdPlayer03")
	DVDPlayer dvdPlayer03;
	
	@Test
	public void testDvdPlayer01NotNull() {
		assertNotNull(dvdPlayer01);
	}

	@Test
	public void testDvdPlayer02NotNull() {
		assertNotNull(dvdPlayer02);
	}

	@Test
	public void testDvdPlayer03NotNull() {
		assertNotNull(dvdPlayer03);
	}

	@Test
	public void testPlay() {
		assertEquals("Playing Movie MARVEL's Avengers", dvdPlayer03.play());
	}
}