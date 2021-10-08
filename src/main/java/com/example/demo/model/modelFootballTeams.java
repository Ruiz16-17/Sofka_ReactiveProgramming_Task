package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "FootballTeams")
public class modelFootballTeams {

    @Id
    public int id;
    public String name;
    public int age;
    public String icon;
    public String national;
    public int winners;
    public int games;
    public String club;

    public modelFootballTeams(int id, String name, int age, String icon, String national, int winners, int games, String club) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.icon = icon;
        this.national = national;
        this.winners = winners;
        this.games = games;
        this.club = club;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setNational(String national) {
        this.national = national;
    }

    public void setWinners(int winners) {
        this.winners = winners;
    }

    public void setGames(int games) {
        this.games = games;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getIcon() {
        return icon;
    }

    public String getNational() {
        return national;
    }

    public int getWinners() {
        return winners;
    }

    public int getGames() {
        return games;
    }

    public String getClub() {
        return club;
    }
}
