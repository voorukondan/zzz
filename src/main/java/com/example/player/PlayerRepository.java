// Write your code here
package com.example.player;

import com.example.player.Player;

public interface PlayerRespository {
    ArrayList<Player> getPlayer();

    Player getPlayerById(int playerId);

    Player addPlayer(Player player);

    Player updatePlayer(int playerId, Player player);

    void deletePlayer(int playerId);
}