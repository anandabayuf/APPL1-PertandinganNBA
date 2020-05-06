package com.group10.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.group10.model.*;

@Repository
public interface PertandinganNBARepository extends MongoRepository {
	@Query("{ 'id' : ?0 }")
	List<PertandinganNBA> findByid(String id);
	
	@Query("{ 'date' : ?0 }")
	List<PertandinganNBA> findByDate(String date);
	
	@Query("{ 'homeTeam' : ?0 }")
	List<PertandinganNBA> findByHomeTeam(String homeTeam);
	
	@Query("{ 'awayTeam' : ?0 }")
	List<PertandinganNBA> findByAwayTeam(String awayTeam);
}
