package br.com.namoralves.jokenpogameserver.model;

import java.io.Serializable;

public class ResultMatch implements Serializable {

    private Player play1;
    private Player play2;
    private Player winner;

    public ResultMatch(Player play1, Player play2, Player winner) {
        this.play1 = play1;
        this.play2 = play2;
        this.winner = winner;
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

    @Override
    public String toString() {
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append("Jogada do " + play1.getName() + ": " + play1.getSelectedPlayEnum().toString() + "<br />");
        strBuilder.append("Jogada do " + play2.getName() + ": " + play2.getSelectedPlayEnum().toString() + "<br />");
        strBuilder.append("<br />RESULTADO: ");
        if (this.winner == null) {
            strBuilder.append("EMPATE");
        } else {
            strBuilder.append(winner.getName() + " VENCEU!");
        }

        return strBuilder.toString();
    }
}
