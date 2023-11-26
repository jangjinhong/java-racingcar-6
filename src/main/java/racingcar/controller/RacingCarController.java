package racingcar.controller;

import racingcar.entity.Game;
import racingcar.service.CarService;
import racingcar.service.GameService;
import racingcar.view.InputView;

public class RacingCarController {
    GameService gameService = new GameService();
    CarService carService = new CarService();

    public void run() {
        performCarRacing(createGame());
    }

    public void performCarRacing(Game game) {
        carService.performCarRacing(game);
    }

    public Game createGame() {
        return gameService.createGameFromStrings(inputCarName(), inputStringMoveCount());
    }

    public String[] inputCarName() {
        return gameService.promptForStringCarNames(InputView.displayCarNamesMessage());
    }

    public String inputStringMoveCount() {
        return InputView.displayMoveCountMessage();
    }
}