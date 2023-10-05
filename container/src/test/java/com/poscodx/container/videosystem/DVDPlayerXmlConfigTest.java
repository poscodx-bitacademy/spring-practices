package com.poscodx.container.videosystem;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations={"classpath:com/poscodx/container/config/videosystem/applicationContext.xml"})
public class DVDPlayerXmlConfigTest {
	// @Autowired
	// 예외
	// XML Bean Configuration(Avengers)에서는 자동으로 id를 부여 하지 않는다.
	// @Qualifier를 사용할 수 없다.
	DigitalVideoDisc dvd1;

	@Autowired
	@Qualifier("ironMan")
	DigitalVideoDisc dvd2;

	@Autowired
	@Qualifier("avengersInfiniteWar")
	DigitalVideoDisc dvd3;

	@Autowired
	@Qualifier("avengersEndgame")
	DigitalVideoDisc dvd4;

	@Autowired
	@Qualifier("avengersAgeOfUltron")
	DigitalVideoDisc dvd5;

	@Disabled
	@Test
	public void testDVD1() {
		assertNotNull(dvd1);
	}
	
	@Test
	public void testDVD2() {
		assertNotNull(dvd2);
	}

	@Test
	public void testDVD3() {
		assertNotNull(dvd3);
	}

	@Test
	public void testDVD4() {
		assertNotNull(dvd4);
	}

	@Test
	public void testDVD5() {
		assertNotNull(dvd5);
	}
	
}
