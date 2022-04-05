package interfaces;

import classes.Car;
import classes.Passenger;
import classes.Service;
import exceptions.FuelAmountException;
import exceptions.InvalidValueException;

public interface IDriver {

    void refuelCar(Car car, Service service) throws InvalidValueException, FuelAmountException;

    void driveThePassenger(Passenger passenger, Service service, Car car) throws InvalidValueException, FuelAmountException;

    void takeOrder(Car car, Service service) throws InvalidValueException, FuelAmountException;

}
