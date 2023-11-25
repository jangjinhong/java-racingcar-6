package racingcar.service;

import camp.nextstep.edu.missionutils.Console;
import racingcar.view.ErrorMessage;

public class PlayerService {
    public String[] promptForCarNames() {
        String[] carNames = Console.readLine().split(",");
        if(!checkOrLess(carNames)) {
            ErrorMessage.NotFiveorLessErrorMessage();
            throw new IllegalArgumentException();
        }

        return carNames;
    }

    private boolean checkOrLess(String[] carNames) {
        for(int i=0; i<carNames.length; i++) {
            if(!isOrLess(carNames[i]))
                return false;
        }
        return true;
    }

    private boolean isOrLess(String carName) {
        if(carName.length() > 5) {
            System.out.println("carName.length(): " + carName.length());
            return false;
        }
        return true;
    }

    public int promptForMoveCount() {
        return Integer.parseInt(Console.readLine());
    }
}
