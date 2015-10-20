package fr.iutvalence.info.dut.m3105.tenniskata.tdd;
public class TennisGame
{

	String score;
	
	public TennisGame(){
		this.score = "love-all";
	}
	
	public String getScore() {
		
		return this.score;
	}

	public void scoreServerIncrease() {
		this.score = "fifteen-love";
		
	}

	public void scoreReceiveIncrease() {
		this.score = "love-fifteen";
	}
	
}
