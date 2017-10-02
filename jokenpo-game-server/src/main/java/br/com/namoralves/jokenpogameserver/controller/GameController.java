package br.com.namoralves.jokenpogameserver.controller;

import br.com.namoralves.jokenpogameserver.exception.BlankValueException;
import br.com.namoralves.jokenpogameserver.model.Player;
import br.com.namoralves.jokenpogameserver.model.ResultMatch;
import br.com.namoralves.jokenpogameserver.model.enums.SelectedPlayEnum;
import br.com.namoralves.jokenpogameserver.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@RestController
@EnableWebMvc
@RequestMapping("/jokenpo")
public class GameController {

    @Autowired
    private GameService service;

    @RequestMapping(value = "start/{player1Name}={played1}/{player2Name}={played2}", method = RequestMethod.GET)
    public ResponseEntity<?> startGame(@PathVariable String played1, @PathVariable String player1Name, @PathVariable String played2, @PathVariable String player2Name) {
        if ("".equals(player1Name) || "".equals(player2Name)) {
            throw new BlankValueException("Nome do player 1 ou player 2");
        }

        Player player1 = new Player();
        player1.setName(player1Name);
        player1.setSelectedPlayEnum(SelectedPlayEnum.getEnumByString(played1));

        Player player2 = new Player();
        player2.setName(player2Name);
        player2.setSelectedPlayEnum(SelectedPlayEnum.getEnumByString(played2));

        ResultMatch resultMatch = this.service.calculateWinner(player1, player2);

        return ResponseEntity.ok(resultMatch.toString());
    }


}
