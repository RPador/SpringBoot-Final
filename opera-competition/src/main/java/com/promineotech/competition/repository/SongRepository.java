/**
 * 
 */
package com.promineotech.competition.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.promineotech.competition.entity.Song;

/**
 * @author Rainy P
 *
 */
@Repository
public interface SongRepository extends JpaRepository<Song, Integer> {

}
