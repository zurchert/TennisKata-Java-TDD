package fr.iutvalence.info.dut.m3105.tenniskata.tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class TennisGameTest {
	
	@Test
	public void checkScoreEqualsZero(){
		TennisGame  tennisGame = new TennisGame();
		assertEquals(tennisGame.getScore(), "love-all");
	}
	
	@Test
	public void checkScoreEqualsFifteenLove(){
		TennisGame  tennisGame = new TennisGame();
		tennisGame.scoreServerIncrease();
		assertEquals(tennisGame.getScore(), "fifteen-love");
	}
	
	@Test
	public void checkScoreEqualsLoveFifteen(){
		TennisGame  tennisGame = new TennisGame();
		tennisGame.scoreReceiveIncrease();
		assertEquals(tennisGame.getScore(), "love-fifteen");
	}
}


