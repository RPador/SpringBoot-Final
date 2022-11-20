package com.promineotech.competition.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.promineotech.competition.entity.Competitor;

@Repository
public interface CompetitorRepository extends JpaRepository<Competitor, Integer> {

}
