package com.example.winz_fast.model.person;

public class Level {
    private int id;
    private String name;

    public Level(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Level() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
