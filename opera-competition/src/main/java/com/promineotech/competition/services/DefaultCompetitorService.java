package com.promineotech.competition.services;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineotech.competition.entity.Competitor;
import com.promineotech.competition.exception.ResourceNotFoundException;
import com.promineotech.competition.repository.CompetitorRepository;

@Service
public class DefaultCompetitorService implements CompetitorService {
	private CompetitorRepository competitorRepository;
	
	@Autowired
	public DefaultCompetitorService(CompetitorRepository competitorRepository) {
		this.competitorRepository = competitorRepository;
	}
	
	
	@Override
	public Competitor saveCompetitor(Competitor competitor) {
		return competitorRepository.save(competitor);
	}


  @Override
  public List<Competitor> getAllCompetitors() {
    return competitorRepository.findAll();
  }


  @Override
  public Competitor getCompetitorById(int id) {
    return competitorRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Competitor", "Id", id));
  }


  @Override
  public Competitor updateCompetitor(Competitor competitor, int id) {
    Competitor existingCompetitor = competitorRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Competitor", "Id", id));
    existingCompetitor.setFirst_name(competitor.getFirst_name());
    existingCompetitor.setLast_name(competitor.getLast_name());
    existingCompetitor.setPhone(competitor.getPhone());
    
    competitorRepository.save(existingCompetitor);
    return existingCompetitor;
  }


  @Override
  public void deleteCompetitor(int id) {
    Competitor existingCompetitor = competitorRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Player", "Id", id));
    competitorRepository.deleteById(id);
  }

	
}
