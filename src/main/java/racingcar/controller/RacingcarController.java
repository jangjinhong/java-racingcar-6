package racingcar.controller;

import racingcar.service.CarService;
import racingcar.service.PlayerService;
import racingcar.view.InputView;

public class RacingcarController {
    private final PlayerService playerService = new PlayerService();
    private final CarService carService = new CarService();

    public void run() {
        /* ---- carNames, moveCount 안내 순서대로 입력 받기 ---- */
        InputView.displayCarNamesMessage();
        String[] carNames = inputCarName();

        InputView.displayMoveCountMessage();
        int moveCount = inputMoveCount();

        /* ---- 입력받은 값으로 car 객체 생성 ---- */
        /* ---- moveCount만큼 난수 생성 및 [이동or정지] 수행 ---- */
        // carService.createCar(carNames);
        func(carNames, moveCount);
    }

    public void func(String[] carNames, int moveCount) {
        for(int i=0; i<moveCount; i++) {
            System.out.println("============" + (i+1) + "번째 =============");
            carService.createCar(carNames);
        }
    }

    public String[] inputCarName() {
        return playerService.promptForCarNames();
    }

    public int inputMoveCount() {
        return playerService.promptForMoveCount();
    }
}
