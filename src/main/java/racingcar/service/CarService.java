package racingcar.service;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.entity.Car;
import racingcar.entity.Game;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class CarService {
    GameService gameService = new GameService();

    public void performCarRacing(Game game) {
        OutputView.executionResultInfoMessage();
        for(int i = 0; i < game.getMoveCount(); i++) {
            getRandomNumberValues(game.getCars());
        }
        gameService.getWinner(game);
    }

    private void getRandomNumberValues(Car[] cars) {
        for(int i = 0; i < cars.length; i++) {
            int randomNumber = generateRandomNumber();
            if(randomNumber >= 4)
                moveCar(cars[i]);
            if(randomNumber < 4)
                stopCar();
        }
        getCarStatus(cars);
    }

    private int generateRandomNumber() {
        return Randoms.pickNumberInRange(0,9);
    }

    private void addMovementStatus(Car car) {
        car.addMovementStatus();
    }

    private void getCarStatus(Car[] cars) {
        OutputView.printCarRacingSituation(cars);
    }

    private void moveCar(Car car) {
        addMovementStatus(car);
    }

    private void stopCar() {
        /* 정지(stop) 기능 */
    }
}