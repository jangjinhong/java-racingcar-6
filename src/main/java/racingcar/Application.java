package racingcar;

import racingcar.controller.RacingcarController;


public class Application {
    public static void main(String[] args) {
        RacingcarController racingcarController = new RacingcarController();

        //System.out.println(racingcarController.promptForMoveCount());
        racingcarController.run();
    }
}
