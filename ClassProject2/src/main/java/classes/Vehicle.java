package classes;

import exceptions.FuelAmountException;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import interfaces.IMachine;

public abstract class Vehicle implements IMachine {
    private static final Logger LOGGER = LogManager.getLogger("Vehicle");

    protected Category category;
    protected double fuelAmount;
    protected double tankVolume;

    public Vehicle() {
    }

    public Vehicle(Category category, double fuelAmount, double tankVolume) {
        this.category = category;
        this.fuelAmount = fuelAmount;
        this.tankVolume = tankVolume;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public void setTankVolume(double tankVolume) {
        this.tankVolume = tankVolume;
    }

    public double getTankVolume() {
        return tankVolume;
    }

    public void setFuelAmount(double fuelAmount) throws FuelAmountException {
        if(fuelAmount > getTankVolume()){
            throw new FuelAmountException("Amount of fuel must be less than tank volume("+getTankVolume()+")");
        }else{
            this.fuelAmount = fuelAmount;
        }
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "category=" + category +
                ", fuelAmount=" + fuelAmount +
                ", tankVolume=" + tankVolume +
                '}';
    }

    @Override
    final public void startPath() {
        LOGGER.info("Car started the path!");
    }
}
