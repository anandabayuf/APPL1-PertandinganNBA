package com.group10.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group10.model.*;
import com.group10.repositories.*;

@Service("pertandinganNBAService")
public class PertandinganNBAServiceImpl implements PertandinganNBAService {

	@Autowired
	PertandinganNBARepository pertandinganNBARepo;
	
	@Override
	public void create(PertandinganNBA pertandinganNBA) {
		// TODO Auto-generated method stub
		PertandinganNBA pertNBA = (PertandinganNBA) pertandinganNBARepo.insert(pertandinganNBA);
		System.out.println("Created : - " + pertNBA);
	}

	@Override
	public void update(PertandinganNBA pertandinganNBA) {
		// TODO Auto-generated method stub
		PertandinganNBA pertNBA = (PertandinganNBA) pertandinganNBARepo.save(pertandinganNBA);
		System.out.println("Updated : - " + pertNBA);
	}

	@Override
	public void delete(PertandinganNBA pertandinganNBA) {
		// TODO Auto-generated method stub
		pertandinganNBARepo.delete(pertandinganNBA);
		System.out.println("Created : - " + pertandinganNBA.getId());
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		pertandinganNBARepo.deleteAll();
	}

	@Override
	public PertandinganNBA findByid(String id) {
		// TODO Auto-generated method stub
		return pertandinganNBARepo.findByid(id).get(0);
	}

	@Override
	public List<PertandinganNBA> findByDate(String date) {
		// TODO Auto-generated method stub
		return pertandinganNBARepo.findByDate(date);
	}

	@Override
	public List<PertandinganNBA> findByHomeTeam(String homeTeam) {
		// TODO Auto-generated method stub
		return pertandinganNBARepo.findByHomeTeam(homeTeam);
	}

	@Override
	public List<PertandinganNBA> findByAwayTeam(String awayTeam) {
		// TODO Auto-generated method stub
		return pertandinganNBARepo.findByAwayTeam(awayTeam);
	}

	@Override
	public List<PertandinganNBA> findAll() {
		// TODO Auto-generated method stub
		return pertandinganNBARepo.findAll();
	}
	
}
