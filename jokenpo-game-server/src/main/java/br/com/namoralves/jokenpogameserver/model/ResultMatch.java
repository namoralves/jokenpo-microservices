package br.com.namoralves.jokenpogameserver.model;

import java.io.Serializable;

public class ResultMatch implements Serializable {

    private Player play1;
    private Player play2;
    private Player winner;
    private Boolean draw;

    public ResultMatch(Player play1, Player play2, Player winner, Boolean draw) {
        this.play1 = play1;
        this.play2 = play2;
        this.winner = winner;
        this.draw = draw;
    }

    public Player getPlay1() {
        return play1;
    }

    public void setPlay1(Player play1) {
        this.play1 = play1;
    }

    public Player getPlay2() {
        return play2;
    }

    public void setPlay2(Player play2) {
        this.play2 = play2;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public Boolean getDraw() {
        return draw;
    }

    public void setDraw(Boolean draw) {
        this.draw = draw;
    }
}