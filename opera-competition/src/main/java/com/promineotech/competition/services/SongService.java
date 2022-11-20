/**
 * 
 */
package com.promineotech.competition.services;

import java.util.List;

import com.promineotech.competition.entity.Song;

/**
 * @author Rainy P
 *
 */
public interface SongService {
//Post, Create
  public Song saveSong(Song song);
  
//Read  
  public List<Song> getAllSongs();
  
//Get competitor by attribute
  public Song getSongById(int Id);
  
//Update
  public Song updateSong(Song song, int Id);

//Delete    
  public void deleteSong(int Id);

}
