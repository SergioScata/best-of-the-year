package org.learning.Best.of.the.year;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping ("/song")
public class songController {
    @GetMapping
    private String getSongs(Model model){
        List<Song> songs = getSongs();
        model.addAttribute("songs", songs);
        return "Songs";
    }
    @GetMapping("/details")
    public String songDetails(@RequestParam int id, Model model) {
        // Cerco la canzone con l'ID come parametro
        Song song = getSongById(id);
        model.addAttribute("song", song);
        return "Details";
    }



    private List<Song> getSongs(){
    List<Song> allSongs = new ArrayList<>();


        allSongs.add(new Song(1, "Sarà lui, sarà lei", "Paolo"));
        allSongs.add(new Song(2, "The lady is mine", "Michael Jackson"));
        allSongs.add(new Song(3, "Sir Duke", "Stevie Wonder"));
        allSongs.add(new Song(4, "Confidence", "Ocean alley"));
        allSongs.add(new Song(5, "L'amore non si spiega", "Sergio Cammariere"));

        return allSongs;
    }



    private Song getSongById(int id) {
        Song song = null;
        for (Song s : getSongs()) {
            if (s.getId() == id) {
                song = s;
                break;
            }
        }
        return song;
    }
}
