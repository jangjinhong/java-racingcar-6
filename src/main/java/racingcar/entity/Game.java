package racingcar.entity;

public class Game {
    private int moveCount;
    private Car[] cars;

    public Game(Car[] cars, int moveCount) {
        this.cars = cars;
        this.moveCount = moveCount;
    }

    public Car[] getCars() {
        return cars;
    }

    public int getMoveCount() {
        return moveCount;
    }
}
