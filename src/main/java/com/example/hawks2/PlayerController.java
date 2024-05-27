package com.example.hawks2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlayerController {
    private PlayerMapper playerMapper;

    public PlayerController(PlayerMapper playerMapper) {
        this.playerMapper = playerMapper;
    }

    @GetMapping("/players")
    public List<Player> findAll() {
        return playerMapper.findAll();
    }

}
