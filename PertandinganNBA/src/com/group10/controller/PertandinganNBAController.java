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
	      
	      PertandinganNBA pertandingan1 = new PertandinganNBA();
	      
	      String pertandingan1DateString = getPertandingan1().getDate();
	      pertandingan1.setDate(pertandingan1DateString);
	      String[] dateString = pertandingan1DateString.split("-");
	      	Calendar cal = Calendar.getInstance();
	      	cal.set(Calendar.YEAR, Integer.parseInt(dateString[0]));
	      	cal.set(Calendar.MONTH, Integer.parseInt(dateString[1])-1);
	      	cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(dateString[2]));
	      	Date pertandingan1Date = cal.getTime();
	      	System.out.println(pertandingan1Date);
	      
	      System.out.println(getPertandingan1().getAwayTeam() + " vs " + getPertandingan1().getHomeTeam());
	      pertandingan1.setHomeTeam(getPertandingan1().getHomeTeam());
	      pertandingan1.setAwayTeam(getPertandingan1().getAwayTeam());
	      
	      String temp = getPertandingan1().getFirstQuarterScore();
	      pertandingan1.setFirstQuarterScore(temp);
	      String[] scoreSplit = temp.split("-");
	      int scoreHome = Integer.parseInt(scoreSplit[1]),
	    	  scoreAway = Integer.parseInt(scoreSplit[0]);
		  System.out.println("First Quarter Score : " + temp + " | Total Score : " + scoreAway + "-" + scoreHome);
	      
		  temp = getPertandingan1().getSecondQuarterScore();
		  pertandingan1.setSecondQuarterScore(temp);
		  scoreSplit = null;
	      scoreSplit = temp.split("-");
	      scoreHome+=Integer.parseInt(scoreSplit[1]);
	      scoreAway+=Integer.parseInt(scoreSplit[0]);
		  System.out.println("Second Quarter Score : " + temp + " | Total Score : " + scoreAway + "-" + scoreHome);
		  
		  
		  temp = getPertandingan1().getThirdQuarterScore();
		  pertandingan1.setThirdQuarterScore(temp);
		  scoreSplit = null;
	      scoreSplit = temp.split("-");
	      scoreHome+=Integer.parseInt(scoreSplit[1]);
	      scoreAway+=Integer.parseInt(scoreSplit[0]);
		  System.out.println("Third Quarter Score : " + temp + " | Total Score : " + scoreAway + "-" + scoreHome);
		  
		  temp = getPertandingan1().getFourthQuarterScore();
		  pertandingan1.setFourthQuarterScore(temp);
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
		  
		  pertandingan1.setFinalScore(getPertandingan1().getFinalScore());
		  
		//pertandingan 2
	      System.out.println("\n=====Pertandingan 2=====\n");
	      
	      PertandinganNBA pertandingan2 = new PertandinganNBA();
	      
	      String pertandingan2DateString = getPertandingan2().getDate();
	      pertandingan2.setDate(pertandingan2DateString);
	      dateString = null;
	       dateString = pertandingan2DateString.split("-");
	       cal = null;
	      	cal = Calendar.getInstance();
	      	cal.set(Calendar.YEAR, Integer.parseInt(dateString[0]));
	      	cal.set(Calendar.MONTH, Integer.parseInt(dateString[1])-1);
	      	cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(dateString[2]));
	      	Date pertandingan2Date = cal.getTime();
	      	System.out.println(pertandingan2Date);
	      
	      System.out.println(getPertandingan2().getAwayTeam() + " vs " + getPertandingan2().getHomeTeam());
	      pertandingan2.setHomeTeam(getPertandingan2().getHomeTeam());
	      pertandingan2.setAwayTeam(getPertandingan2().getAwayTeam());
	      
	      temp = getPertandingan2().getFirstQuarterScore();
	      pertandingan2.setFirstQuarterScore(temp);
	      scoreSplit = temp.split("-");
	      scoreHome = Integer.parseInt(scoreSplit[1]);
	      scoreAway = Integer.parseInt(scoreSplit[0]);
		  System.out.println("First Quarter Score : " + temp + " | Total Score : " + scoreAway + "-" + scoreHome);
	      
		  temp = getPertandingan2().getSecondQuarterScore();
		  pertandingan2.setSecondQuarterScore(temp);
		  scoreSplit = null;
	      scoreSplit = temp.split("-");
	      scoreHome+=Integer.parseInt(scoreSplit[1]);
	      scoreAway+=Integer.parseInt(scoreSplit[0]);
		  System.out.println("Second Quarter Score : " + temp + " | Total Score : " + scoreAway + "-" + scoreHome);
		  
		  
		  temp = getPertandingan2().getThirdQuarterScore();
		  pertandingan2.setThirdQuarterScore(temp);
		  scoreSplit = null;
	      scoreSplit = temp.split("-");
	      scoreHome+=Integer.parseInt(scoreSplit[1]);
	      scoreAway+=Integer.parseInt(scoreSplit[0]);
		  System.out.println("Third Quarter Score : " + temp + " | Total Score : " + scoreAway + "-" + scoreHome);
		  
		  temp = getPertandingan2().getFourthQuarterScore();
		  pertandingan2.setFourthQuarterScore(temp);
		  scoreSplit = null;
	      scoreSplit = temp.split("-");
	      scoreHome+=Integer.parseInt(scoreSplit[1]);
	      scoreAway+=Integer.parseInt(scoreSplit[0]);
		  System.out.println("Fourth Quarter Score : " + temp + " | Total Score : " + scoreAway + "-" + scoreHome);
		  
		  System.out.println("Final Score : " + getPertandingan2().getFinalScore());
		  if(scoreHome > scoreAway)
			  System.out.println("Winner : " + getPertandingan2().getHomeTeam());
		  else if(scoreHome < scoreAway)
			  System.out.println("Winner : " + getPertandingan2().getAwayTeam());
		  else System.out.println("DRAW"); //asumsi nya pertandingan selesai setelah quarter ke-4
		  
		  pertandingan2.setFinalScore(getPertandingan2().getFinalScore());
		  
		  AbstractApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		   PertandinganNBAService pertandinganNBAService = context.getBean("pertandinganNBAService", PertandinganNBAService.class);
		   pertandinganNBAService.deleteAll();
		   
		   pertandinganNBAService.create(pertandingan1);
		   pertandinganNBAService.create(pertandingan2);
		   
		   context.close();
	}
}
