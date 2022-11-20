package com.promineotech.competition.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineotech.competition.entity.Placement;
import com.promineotech.competition.exception.ResourceNotFoundException;
import com.promineotech.competition.repository.PlacementRepository;

@Service
public class DefaultPlacementService implements PlacementService {
	private PlacementRepository placementRepository;
	
	@Autowired
	public DefaultPlacementService(PlacementRepository placementRepository) {
		this.placementRepository = placementRepository;
	}

	@Override
	public Placement savePlacement(Placement placement) {
		return placementRepository.save(placement);
	}

	@Override
	public List<Placement> getAllPlacements() {
		return placementRepository.findAll();
	}

	@Override
	public Placement getPlacementById(int id) {
		return placementRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Placement", "Id", id));
	}

	@Override
	public Placement updatePlacement(Placement placement, int id) {
		Placement existingPlacement = placementRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Placement", "Id", id));
	    existingPlacement.setPlacementNumber(placement.getPlacementNumber());
	    placementRepository.save(existingPlacement);
	    return existingPlacement;
	}

	@Override
	public void deletePlacement(int id) {
		Placement existingPlacement = placementRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Placement", "Id", id));
	    placementRepository.deleteById(id);
		
	}

}
