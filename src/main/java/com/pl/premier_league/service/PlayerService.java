package com.pl.premier_league.service;

import com.pl.premier_league.entity.Player;
import com.pl.premier_league.repository.PlayerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepo playerRepo;

    public List<Player> findAll(){
        return playerRepo.findAll();
    }

    public List<Player> findByTeam(String team){
        return playerRepo.findByTeamIgnoreCase(team);
    }

    public List<Player> findByNation(String nation){
        return playerRepo.findByNation(nation);
    }

    public List<Player> findByTeamAndPosition(String team, String pos){
        return playerRepo.findByTeamIgnoreCaseAndPosIgnoreCase(team, pos);
    }

    public Player addPlayer(Player player) {
        playerRepo.save(player);
        return player;
    }
}
