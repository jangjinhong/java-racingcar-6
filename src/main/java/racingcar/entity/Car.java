package racingcar.entity;

public class Car {
    private String CarName;
    private String movementStatus = "";

    public Car(String CarName) {
        this.CarName = CarName;
    }

    public String getMovementStatus() {
        return movementStatus;
    }

    public void addMovementStatus() {
        this.movementStatus += "-";
    }
}
