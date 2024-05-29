package com.example.hawks2;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PlayerService {

    private PlayerMapper playerMapper;

    public PlayerService(PlayerMapper playerMapper) {
        this.playerMapper = playerMapper;
    }

    public Player findPlayer(int id) {
        Optional<Player> player = playerMapper.findById(id);
        if (player.isPresent()) {
            return player.get();
        }else {
            throw new PlayerNotFoundException("user not found" + id + "not found");
        }
    }
}
