package interfaces;

import classes.Car;
import classes.Driver;
import classes.Passenger;
import exceptions.FuelAmountException;
import exceptions.InvalidValueException;

public interface IService {

    void sendOrder(Driver driver, Car car) throws InvalidValueException, FuelAmountException;

    void makeOrder(Passenger passenger, int metersToPassenger);

}
