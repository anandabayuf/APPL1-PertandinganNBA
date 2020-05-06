package com.group10.controller;

import java.util.List;

import com.group10.model.PertandinganNBA;

public interface PertandinganNBAService {
	public void create(PertandinganNBA pertandinganNBA);
	
	public void update(PertandinganNBA pertandinganNBA);
	
	public void delete(PertandinganNBA pertandinganNBA);
	
	public void deleteAll();
	
	public PertandinganNBA findByid(String id);
	
	public List<PertandinganNBA> findByDate(String date);
	
	public List<PertandinganNBA> findByHomeTeam(String homeTeam);
	
	public List<PertandinganNBA> findByAwayTeam(String awayTeam);
	
	public List<PertandinganNBA> findAll();
}
