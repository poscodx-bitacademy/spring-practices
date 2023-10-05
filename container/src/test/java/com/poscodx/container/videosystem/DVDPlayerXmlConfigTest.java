package com.poscodx.container.videosystem;

import static org.junit.jupiter.api.Assertions.assertEquals;
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

	@Autowired
	@Qualifier("avengersCaptainAmerica")
	DigitalVideoDisc dvd6;

	@Autowired
	@Qualifier("avengersDirectorEdition")
	DigitalVideoDisc dvd7;

	@Autowired
	@Qualifier("avengersExpansionEdition1")
	DigitalVideoDisc dvd8;

	@Autowired
	@Qualifier("avengersExpansionEdition2")
	DigitalVideoDisc dvd9;

	@Autowired
	@Qualifier("avengersExpansionEdition3")
	DigitalVideoDisc dvd10;
		
	@Autowired
	DVDPack dvdPack;
	
	@Autowired
	@Qualifier("dvdPlayer1")
	DVDPlayer dvdPlayer1;

	@Autowired
	@Qualifier("dvdPlayer2")
	DVDPlayer dvdPlayer2;

	@Autowired
	@Qualifier("dvdPlayer3")
	DVDPlayer dvdPlayer3;

	@Autowired
	@Qualifier("dvdPlayer4")
	DVDPlayer dvdPlayer4;

	@Autowired
	@Qualifier("dvdPlayer5")
	DVDPlayer dvdPlayer5;
	
	@Test
	public void testPlay1() {
		assertEquals("Playing Movie MARVEL's Iron Man", dvdPlayer1.play());
	}

	@Test
	public void testPlay2() {
		assertEquals("Playing Movie MARVEL's Iron Man", dvdPlayer2.play());
	}

	@Test
	public void testPlay3() {
		assertEquals("Playing Movie MARVEL's Iron Man", dvdPlayer3.play());
	}

	@Test
	public void testPlay4() {
		assertEquals("Playing Movie MARVEL's Iron Man", dvdPlayer4.play());
	}

	@Test
	public void testPlay5() {
		assertEquals("Playing Movie MARVEL's Iron Man", dvdPlayer5.play());
	}
	
	///////////////////////////////////////////////
	
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

	@Test
	public void testDVD6() {
		assertNotNull(dvd6);
	}

	@Test
	public void testDVD7() {
		assertNotNull(dvd7);
	}

	@Test
	public void testDVD8() {
		assertNotNull(dvd8);
	}

	@Test
	public void testDVD9() {
		assertNotNull(dvd9);
	}

	@Test
	public void testDVD10() {
		assertNotNull(dvd10);
	}

	@Test
	public void testDVDPack() {
		assertNotNull(dvdPack);
	}
}
