package com.promineotech.competition.services;



import java.util.List;
import com.promineotech.competition.entity.Competitor;

public interface CompetitorService {
//Post, Create
	public Competitor saveCompetitor(Competitor competitor);
	
//Read	
	public List<Competitor> getAllCompetitors();
	
//Get competitor by attribute
	public Competitor getCompetitorById(int Id);
	
//Update
	public Competitor updateCompetitor(Competitor competitor, int Id);

//Delete	
	public void deleteCompetitor(int Id);
}
