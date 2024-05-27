package com.example.hawks2;

public class Player {
    private int id;

    private String name;

    private int number;

    private  String team;

    public Player(int id, String name, int number, String team) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.team = team;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public String getTeam() {
        return team;
    }
}
