package fr.iutvalence.info.dut.m3105.tenniskata.tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class TennisGameTest {
	
	@Test
	public void gamesTest(){
		TennisGame  tG = new TennisGame();
		assertEquals(tG.getScore(), "love-all");
	}
	
	
}
