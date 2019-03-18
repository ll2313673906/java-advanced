package com.java.util;

/**
 * author 刘恋
 * 2019.3.18
 */

public class Star {
    private String name;
    private String nickname;
    private Double score;
    private Double rebounds;
    private  Double assists;

    public Star(String name, String nickname, Double score, Double rebounds, Double assists) {
        this.name = name;
        this.nickname = nickname;
        this.score = score;
        this.rebounds = rebounds;
        this.assists = assists;
    }

    public Star() {
    }

    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }

    public Double getScore() {
        return score;
    }

    public Double getRebounds() {
        return rebounds;
    }

    public Double getAssists() {
        return assists;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public void setRebounds(Double rebounds) {
        this.rebounds = rebounds;
    }

    public void setAssists(Double assists) {
        this.assists = assists;
    }

    @Override
    public String toString() {
        return "Star{" +
                "name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                ", score=" + score +
                ", rebounds=" + rebounds +
                ", assists=" + assists +
                '}';
    }
}
