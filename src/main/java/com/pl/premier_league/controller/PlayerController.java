package com.pl.premier_league.controller;


import com.pl.premier_league.entity.Player;
import com.pl.premier_league.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @GetMapping
    public List<Player> getAllPlayers(){
        return playerService.findAll();
    }

    @GetMapping("/team/{team}")
    public List<Player> getByTeam(@PathVariable String team){
        return playerService.findByTeam(team);
    }

    @GetMapping("/nation/{nation}")
    public List<Player> getByNation(@PathVariable String nation){
        return playerService.findByNation(nation);
    }

    @GetMapping("/team/{team}/position/{pos}")
    public List<Player> getByTeamAndPosition(@PathVariable String team,@PathVariable String pos){
        return playerService.findByTeamAndPosition(team, pos);
    }
}
