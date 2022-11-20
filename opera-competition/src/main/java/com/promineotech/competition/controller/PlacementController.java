package com.promineotech.competition.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.promineotech.competition.entity.Placement;

import com.promineotech.competition.services.PlacementService;

@RestController
@RequestMapping("/operacompetition/placement")
public class PlacementController {
	private PlacementService placementService;
	
	@Autowired
	public PlacementController(PlacementService placementService) {
		super();
		this.placementService = placementService;
	}
	
	//Create
	  @PostMapping
	  public ResponseEntity<Placement> savePlacement(@RequestBody Placement placement) {
	      return new ResponseEntity<Placement>(placementService.savePlacement(placement), HttpStatus.CREATED);
	  }
	  //Read
	  @GetMapping
	  public List<Placement> getAllPlacements(){
	    return placementService.getAllPlacements();
	  }
	  
	//Update
	  @PutMapping("{placement_id}")
	  public ResponseEntity<Placement> updatePlacement(@PathVariable("placement_id") int placementId, @RequestBody Placement placement) {
	    return new ResponseEntity<Placement>(placementService.updatePlacement(placement, placementId), HttpStatus.OK);
	  }
	  
	    //Delete
	  @DeleteMapping("{placement_id}")
	  public ResponseEntity<String> deletePlacement(@PathVariable("placement_id") int placementId) {
	    placementService.deletePlacement(placementId);
	    return new ResponseEntity<String>("Placement has been deleted.", HttpStatus.OK);
	  }

}
