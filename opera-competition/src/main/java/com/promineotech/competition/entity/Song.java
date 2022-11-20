package com.promineotech.competition.entity;

import java.util.Set;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import org.springframework.data.relational.core.mapping.Column;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
//@Setter
//@Getter
//@AllArgsConstructor
//@NoArgsConstructor
@Entity
@Table(name="song")
public class Song {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int song_id;
	
//	private String songTitle;
//    
//	@ManyToMany(mappedBy = "competitors",fetch = FetchType.LAZY)
//	@JsonManagedReference
//	private Set<Competitor> competitors;
	
	
	
    @Column(value="song_title")
    private String songTitle;
}
