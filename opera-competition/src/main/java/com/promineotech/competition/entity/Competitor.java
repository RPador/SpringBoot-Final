package com.promineotech.competition.entity;


import java.util.Set;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import org.springframework.data.relational.core.mapping.Column;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
//@Setter
//@Getter
//@AllArgsConstructor
//@NoArgsConstructor
@Data
@Table(name="competitor")
public class Competitor {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int competitor_pk;
//	private String first_name;
//	private String last_name;
//	private String phone;
//	
//	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//	@JoinTable(name = "competitor",
//	joinColumns = {
//			@JoinColumn(name = "competitor_pk",referencedColumnName = "competitor_pk")
//	},
//	inverseJoinColumns = {
//			@JoinColumn(name = "song_id",referencedColumnName = "song_id")
//	})
//	@JsonManagedReference
//	private Set<Song> songs;
	
	@Column(value="first_name")
	private String first_name;
	
	@Column(value="last_name")
	private String last_name;
	
	@Column(value="phone")
	private String phone;
}
