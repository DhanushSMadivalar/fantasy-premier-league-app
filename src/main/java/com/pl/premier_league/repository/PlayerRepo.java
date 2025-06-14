package com.pl.premier_league.repository;

import com.pl.premier_league.entity.Player;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PlayerRepo extends MongoRepository<Player, String> {

    List<Player> findByTeamIgnoreCase(String team);

    List<Player> findByPos(String pos);

    List<Player> findByNation(String nation);

    List<Player> findByTeamIgnoreCaseAndPosIgnoreCase(String team, String pos);
}

