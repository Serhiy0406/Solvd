package interfaces;

import classes.Car;
import classes.Driver;
import classes.Passenger;

public interface IService {

    void sendOrder(Driver driver, Car car);

    void makeOrder(Passenger passenger, int metersToPassenger);

}
