package com.group10.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	private final int play = 10000;
	private final int breakHalf = 10000;
	private final int breakQuarter = 5000;
	@Before("execution(public String get*QuarterScore())")
	public void playing() {
		System.out.println("\nplaying...\n");
		try {
			Thread.sleep(play);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Before("execution(public String getSecondQuarterScore()) || execution(public String getFourthQuarterScore())")
	public void BreakQuarter() {
		System.out.println("\nbreak quarter time..");
		try {
			Thread.sleep(breakQuarter);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Before("execution(public String getThirdQuarterScore())")
	public void BreakHalf() {
		System.out.println("\nbreak half time..");
		try {
			Thread.sleep(breakHalf);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
