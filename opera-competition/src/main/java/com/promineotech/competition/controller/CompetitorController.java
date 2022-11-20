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

import com.promineotech.competition.entity.Competitor;
import com.promineotech.competition.services.CompetitorService;


@RestController
@RequestMapping("/operacompetition/competitor")
public class CompetitorController {

		private CompetitorService competitorService;
		
		@Autowired
		public CompetitorController(CompetitorService competitorService) {
			super();
			this.competitorService = competitorService;
		
		}
		
		//Create
		@PostMapping
		public ResponseEntity<Competitor> saveCompetitor(@RequestBody Competitor competitor) {
			return new ResponseEntity<Competitor>(competitorService.saveCompetitor(competitor), HttpStatus.CREATED);
		}
		//Read
		@GetMapping
		public List<Competitor> getAllCompetitors(){
		  return competitorService.getAllCompetitors();
		}
		//Read by Id
//		@GetMapping("{competitor_pk}")
//		public ResponseEntity<Competitor> getCompetitorbyId(@PathVariable("competitor_pk") int competitorId) {
//		  return new ResponseEntity<Competitor>(competitorService.getCompetitorById(competitorId), HttpStatus.CREATED);
//		}
		
		//Update
		@PutMapping("{competitor_pk}")
        public ResponseEntity<Competitor> updateCompetitor(@PathVariable("competitor_pk") int competitorId, @RequestBody Competitor competitor) {
          return new ResponseEntity<Competitor>(competitorService.updateCompetitor(competitor, competitorId), HttpStatus.OK);
		}
        
          //Delete
		@DeleteMapping("{competitor_pk}")
		public ResponseEntity<String> deleteCompetitor(@PathVariable("competitor_pk") int competitorId) {
		  competitorService.deleteCompetitor(competitorId);
		  return new ResponseEntity<String>("Competitor has left.", HttpStatus.OK);
		}
}
		