package com.promineotech.competition.services;

import java.util.List;

import com.promineotech.competition.entity.Placement;

public interface PlacementService {
	
	//Post, Create
	  public Placement savePlacement(Placement placement);
	  
	//Read  
	  public List<Placement> getAllPlacements();
	  
	//Get competitor by attribute
	  public Placement getPlacementById(int Id);
	  
	//Update
	  public Placement updatePlacement(Placement placement, int Id);

	//Delete    
	  public void deletePlacement(int Id);

}
