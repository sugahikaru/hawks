package com.example.hawks2;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;

@RestController
public class PlayerController {

    private PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }


    @GetMapping("/players")
    public List<Player> findPlayerTeam(@RequestParam(value = "team", required = false) String team) {
        return playerService.findByTeam(team);
    }

    @GetMapping("/players/{id}")
    public Player findPlayer(@PathVariable("id") int id) {
        return playerService.findPlayer(id);
    }
}


