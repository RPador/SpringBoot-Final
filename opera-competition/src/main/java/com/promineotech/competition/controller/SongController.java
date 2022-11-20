/**
 * 
 */
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
import com.promineotech.competition.entity.Song;
import com.promineotech.competition.services.SongService;


/**
 * @author Rainy P
 *
 */
@RestController
@RequestMapping("/operacompetition/song")
public class SongController {
  
  private SongService songService;
  
  @Autowired
  public SongController(SongService songService) {
      super();
      this.songService = songService;
  }
  
//Create
  @PostMapping
  public ResponseEntity<Song> saveSong(@RequestBody Song song) {
      return new ResponseEntity<Song>(songService.saveSong(song), HttpStatus.CREATED);
  }
  //Read
  @GetMapping
  public List<Song> getAllSongs(){
    return songService.getAllSongs();
  }
  
//Update
  @PutMapping("{song_id}")
  public ResponseEntity<Song> updateSong(@PathVariable("song_id") int songId, @RequestBody Song song) {
    return new ResponseEntity<Song>(songService.updateSong(song, songId), HttpStatus.OK);
  }
  
    //Delete
  @DeleteMapping("{competitor_pk}")
  public ResponseEntity<String> deleteSong(@PathVariable("song_id") int songId) {
    songService.deleteSong(songId);
    return new ResponseEntity<String>("Song has been deleted.", HttpStatus.OK);
  }
  
  
}
