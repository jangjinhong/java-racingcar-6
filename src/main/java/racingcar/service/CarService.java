package racingcar.service;

import camp.nextstep.edu.missionutils.Randoms;
import racingcar.entity.Car;

public class CarService {
    public void createCar(String[] carNames) {
        for(String carName : carNames)
            matchCarName(carName);
    }
    private Car matchCarName(String carName) {
        return new Car(carName);
    }

    public void getRandomNumberValues(Car car) {
        int randomNumber = generateRandomNumber();
        if(randomNumber >= 4)
            moveCar(car);
        if(randomNumber < 4)
            stopCar();

        getCarStatus(car);
    }

    public int generateRandomNumber() {
        return Randoms.pickNumberInRange(0,9);
    }

    public void addMovementStatus(Car car) {
        car.addMovementStatus();
    }

    public void moveCar(Car car) {
        addMovementStatus(car);
        System.out.println("car Move");
    }

    public void getCarStatus(Car car) {
       System.out.println(car.getMovementStatus());
    }

    public void stopCar() {
        System.out.println("car Stop");
    }
}
