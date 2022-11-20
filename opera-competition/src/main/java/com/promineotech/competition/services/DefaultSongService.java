/**
 * 
 */
package com.promineotech.competition.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.promineotech.competition.entity.Song;
import com.promineotech.competition.exception.ResourceNotFoundException;
import com.promineotech.competition.repository.CompetitorRepository;
import com.promineotech.competition.repository.SongRepository;

/**
 * @author Rainy P
 *
 */
@Service
public class DefaultSongService implements SongService {
  private SongRepository songRepository;
  
  @Autowired
  public DefaultSongService(SongRepository songRepository) {
      this.songRepository = songRepository;
  }

  @Override
  public Song saveSong(Song song) {
    return songRepository.save(song);
  }

  @Override
  public List<Song> getAllSongs() {
    return songRepository.findAll();
  }

  @Override
  public Song getSongById(int id) {
    return songRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Song", "Id", id));
  }

  @Override
  public Song updateSong(Song song, int id) {
    Song existingSong = songRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Song", "Id", id));
    existingSong.setSongTitle(song.getSongTitle());
    songRepository.save(existingSong);
    return existingSong;
  }

  @Override
  public void deleteSong(int id) {
    Song existingSong = songRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Song", "Id", id));
    songRepository.deleteById(id);
  }

}
