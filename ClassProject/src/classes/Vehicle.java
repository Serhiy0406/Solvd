package classes;

import interfaces.IMachine;

public abstract class Vehicle implements IMachine {

    protected Category category;
    protected double fuelAmount;
    protected double tankVolume;

    public Vehicle(){}

    public Vehicle(Category category, double fuelAmount, double tankVolume) {
        this.category = category;
        this.fuelAmount = fuelAmount;
        this.tankVolume = tankVolume;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setTankVolume(double tankVolume) {
        this.tankVolume = tankVolume;
    }

    public double getTankVolume() {
        return tankVolume;
    }

    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public Category getCategory() {
        return category;
    }

    final public void startPath() {
        System.out.println("Car started the path!");
    }
}
