package com.example.hawks2;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {

    private PlayerMapper playerMapper;

    public PlayerService(PlayerMapper playerMapper) {
        this.playerMapper = playerMapper;
    }

    public List<Player> findByTeam(String team){
        if(team!=null&&!team.isEmpty()){
            return playerMapper.findByTeamWith(team);
        }else {
            return playerMapper.findAll();
        }
    }

    public Player findPlayer(int id) {
        Optional<Player> user = this.playerMapper.findById(id);
        if (user.isPresent()) {
            return user.get();
        } else {
            throw new PlayerNotFoundException("user not found");
        }
    }
}
