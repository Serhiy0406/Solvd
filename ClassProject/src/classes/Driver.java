package classes;

import exceptions.FuelAmountException;
import exceptions.InvalidValueException;
import interfaces.IDriver;

public final class Driver extends People implements IDriver {

    private License license;

    public Driver() {
    }

    public Driver(License license, String name, String surname) {
        super(name, surname);
        this.license = license;
    }

    public void setLicense(License license) {
        this.license = license;
    }

    public License getLicense() {
        return license;
    }

    @Override
    public void refuelCar(Car car, Service service) throws InvalidValueException, FuelAmountException {
        double neededFuel = car.getTankVolume() - car.getFuelAmount();
        double neededCash = neededFuel * car.getEngine().getFuel().getPricePerLiter();
        double tempIncome = service.getIncome();
        if (neededCash <= tempIncome) {
            service.setIncome(tempIncome - neededCash);
            car.setFuelAmount(neededFuel + car.getFuelAmount());
            System.out.println("Car was successfully refueled");
        } else {
            System.out.println("There is not enough of income to pay for fuel");
        }

    }

    @Override
    public void driveThePassenger(Passenger passenger, Service service, Car car) throws InvalidValueException, FuelAmountException {
        double tempFuelAmount = car.getFuelAmount() - passenger.getPathToRide() * 0.001;// 1 liter to 1000 meters
        if (tempFuelAmount >= 0) {
            car.startPath();
            car.setFuelAmount(tempFuelAmount);
            System.out.println("Taxi completed the drive/trip!");
            passenger.payForTaxi(service);
        } else {
            System.out.println("The car don't have enough fuel for the trip!");
            System.out.println("Sending driver to refuel the car");
            System.out.println("<-------------------------------->");
            refuelCar(car, service);
        }
    }

    @Override
    public void takeOrder(Car car, Service service) throws InvalidValueException, FuelAmountException {
        double tempFuelAmount = car.getFuelAmount() - service.getOrder().getMetersToPassenger() * 0.001;// 1 liter to 1000 meters
        if (tempFuelAmount >= 0) {
            refuelCar(car, service);
        }
        car.setFuelAmount(tempFuelAmount);
        driveThePassenger(service.getOrder().getPassenger(), service, car);
    }

    @Override
    public String toString() {
        return "Driver{\n" +
                " Name: " + getName() +
                "\n Surname: " + getSurname() +
                "\n license start date : " + getLicense().getDateFrom() +
                "\n license end date : " + getLicense().getDateTo() +
                "\n}";
    }
}
