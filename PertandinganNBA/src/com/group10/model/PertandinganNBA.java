package com.group10.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

@Document(collection = "pertandinganNBA")
public class PertandinganNBA {
	@Id
	private String id;
	private String date;
	private String homeTeam;
   private String awayTeam;
   private String finalScore;
   private String firstQuarterScore;
   private String secondQuarterScore;
   private String thirdQuarterScore;
   private String fourthQuarterScore;
   
   
   
   public PertandinganNBA(String date, String homeTeam, String awayTeam, String finalScore, String firstQuarterScore,
		String secondQuarterScore, String thirdQuarterScore, String fourthQuarterScore) {
	super();
	this.date = date;
	this.homeTeam = homeTeam;
	this.awayTeam = awayTeam;
	this.finalScore = finalScore;
	this.firstQuarterScore = firstQuarterScore;
	this.secondQuarterScore = secondQuarterScore;
	this.thirdQuarterScore = thirdQuarterScore;
	this.fourthQuarterScore = fourthQuarterScore;
}

public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getHomeTeam() {
		return homeTeam;
	}
	
	public void setHomeTeam(String homeTeam) {
		this.homeTeam = homeTeam;
	}
	
	public String getAwayTeam() {
		return awayTeam;
	}
	
	public void setAwayTeam(String awayTeam) {
		this.awayTeam = awayTeam;
	}
	
	public String getFinalScore() {
		return finalScore;
	}
	
	public void setFinalScore(String finalScore) {
		this.finalScore = finalScore;
	}
	
	public String getFirstQuarterScore() {
		return firstQuarterScore;
	}
	
	public void setFirstQuarterScore(String firstQuarterScore) {
		this.firstQuarterScore = firstQuarterScore;
	}
	
	public String getSecondQuarterScore() {
		return secondQuarterScore;
	}
	
	public void setSecondQuarterScore(String secondQuarterScore) {
		this.secondQuarterScore = secondQuarterScore;
	}
	
	public String getThirdQuarterScore() {
		return thirdQuarterScore;
	}
	
	public void setThirdQuarterScore(String thirdQuarterScore) {
		this.thirdQuarterScore = thirdQuarterScore;
	}
	
	public String getFourthQuarterScore() {
		return fourthQuarterScore;
	}
	
	public void setFourthQuarterScore(String fourthQuarterScore) {
		this.fourthQuarterScore = fourthQuarterScore;
	}
	
}