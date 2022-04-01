package interfaces;

import classes.Service;
import exceptions.InvalidValueException;

public interface IPassenger {

    void payForTaxi(Service service) throws InvalidValueException;

}
