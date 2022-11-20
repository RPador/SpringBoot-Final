package com.promineotech.competition.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.data.relational.core.mapping.Column;
import lombok.Data;

@Data
@Entity
@Table(name="placement")
public class Placement {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int placementId;
    
    @Column(value="placement_number")
    private String placementNumber;
}
