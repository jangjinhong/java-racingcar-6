package racingcar;

import racingcar.controller.RacingCarController;


public class Application {
    public static void main(String[] args) {
        RacingCarController racingcarController = new RacingCarController();

        //System.out.println(racingcarController.promptForMoveCount());
        racingcarController.run();
    }
}
