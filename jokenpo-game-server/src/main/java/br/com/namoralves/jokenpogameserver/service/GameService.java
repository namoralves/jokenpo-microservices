package br.com.namoralves.jokenpogameserver.service;

import br.com.namoralves.jokenpogameserver.model.Player;
import br.com.namoralves.jokenpogameserver.model.ResultMatch;
import org.springframework.stereotype.Service;

@Service
public class GameService {

    public ResultMatch calculateWinner(Player player1, Player player2) {
        Player winner = getWinner(player1, player2);
        ResultMatch resultMatch = new ResultMatch(player1, player2, winner, false);
        resultMatch.setDraw(winner == null);

        return resultMatch;
    }

    public Player getWinner(Player play1, Player play2) {
        Integer codeResult = play1.getSelectedPlayEnum().getPlayCode() - play2.getSelectedPlayEnum().getPlayCode();

        if (codeResult == 1 || codeResult == -2) {
            return  play1;
        } else if (codeResult == -1 || codeResult == 2) {
            return play2;
        }

        // Draw
        return null;
    }

}
