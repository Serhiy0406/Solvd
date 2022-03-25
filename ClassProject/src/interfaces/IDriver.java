package interfaces;

import classes.Car;
import classes.Passenger;
import classes.Service;

public interface IDriver {

    void refuelCar(Car car, Service service);

    void driveThePassenger(Passenger passenger, Service service, Car car);

    void takeOrder(Car car, Service service);

}
