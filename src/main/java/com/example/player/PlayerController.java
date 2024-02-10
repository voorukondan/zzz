/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.ArrayList;
 * 
 */

// Write your code here.
package com.example.player;

import java.util.*;

import com.example.player.PlayerService;
import com.example.player.Player;

@RestController
public class PlayerController {
    PlayerService playerService= new PlayerService(){
    @GetMapping("/players")
    public ArrayList<Player>getPlayer(){
        return playerService.getPlayer();
    }
    @GetMapping("/players/{playerId}")
    public Player getPlayerById (@PathVariable("playerId") int playerId) {
        return playerService.getPlayerById(playerId);
    }
    @PostMapping("/players")
    public Player addPlayer (@RequestBody Player player) {
        Return playerService.addPlayer(player)
    }
    @DeleteMapping("/players/{playerId}")
    public void deletePlayer(@PathVariable int playerId) {
        PlayerService.deletePlayer(playerId);
    }

    

    
}