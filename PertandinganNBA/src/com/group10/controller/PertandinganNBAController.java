package com.group10.controller;

import java.util.Calendar;
import java.util.Date;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.group10.configuration.ApplicationConfig;
import com.group10.model.PertandinganNBA;

public class PertandinganNBAController {
	private PertandinganNBA pertandingan1;
	private PertandinganNBA pertandingan2;

	public PertandinganNBA getPertandingan1() {
		return pertandingan1;
	}

	public void setPertandingan1(PertandinganNBA pertandingan1) {
		this.pertandingan1 = pertandingan1;
	}

	public PertandinganNBA getPertandingan2() {
		return pertandingan2;
	}

	public void setPertandingan2(PertandinganNBA pertandingan2) {
		this.pertandingan2 = pertandingan2;
	}
	
	public void play() {
		//pertandingan 1
	      System.out.println("=====Pertandingan 1=====\n");
	      
	      String[] dateString = getPertandingan1().getDate().split("-");
	      	Calendar cal = Calendar.getInstance();
	      	cal.set(Calendar.YEAR, Integer.parseInt(dateString[0]));
	      	cal.set(Calendar.MONTH, Integer.parseInt(dateString[1])-1);
	      	cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(dateString[2]));
	      	Date pertandingan1Date = cal.getTime();
	      	System.out.println(pertandingan1Date);
	      
	      System.out.println(getPertandingan1().getAwayTeam() + " vs " + getPertandingan1().getHomeTeam());
	      
	      String temp = getPertandingan1().getFirstQuarterScore();
	      String[] scoreSplit = temp.split("-");
	      int scoreHome = Integer.parseInt(scoreSplit[1]),
	    	  scoreAway = Integer.parseInt(scoreSplit[0]);
		  System.out.println("First Quarter Score : " + temp + " | Total Score : " + scoreAway + "-" + scoreHome);
	      
		  temp = getPertandingan1().getSecondQuarterScore();
		  scoreSplit = null;
	      scoreSplit = temp.split("-");
	      scoreHome+=Integer.parseInt(scoreSplit[1]);
	      scoreAway+=Integer.parseInt(scoreSplit[0]);
		  System.out.println("Second Quarter Score : " + temp + " | Total Score : " + scoreAway + "-" + scoreHome);
		  
		  
		  temp = getPertandingan1().getThirdQuarterScore();
		  scoreSplit = null;
	      scoreSplit = temp.split("-");
	      scoreHome+=Integer.parseInt(scoreSplit[1]);
	      scoreAway+=Integer.parseInt(scoreSplit[0]);
		  System.out.println("Third Quarter Score : " + temp + " | Total Score : " + scoreAway + "-" + scoreHome);
		  
		  temp = getPertandingan1().getFourthQuarterScore();
		  scoreSplit = null;
	      scoreSplit = temp.split("-");
	      scoreHome+=Integer.parseInt(scoreSplit[1]);
	      scoreAway+=Integer.parseInt(scoreSplit[0]);
		  System.out.println("Fourth Quarter Score : " + temp + " | Total Score : " + scoreAway + "-" + scoreHome);
		  
		  System.out.println("Final Score : " + getPertandingan1().getFinalScore());
		  if(scoreHome > scoreAway)
			  System.out.println("Winner : " + getPertandingan1().getHomeTeam());
		  else if(scoreHome < scoreAway)
			  System.out.println("Winner : " + getPertandingan1().getAwayTeam());
		  else System.out.println("DRAW"); //asumsi nya pertandingan selesai setelah quarter ke-4
		  
	}
}
