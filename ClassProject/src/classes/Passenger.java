package classes;

import exceptions.InvalidValueException;
import interfaces.IPassenger;

public final class Passenger extends People implements IPassenger {

    public static final double TEMP_SUM = 0.7;
    private double pathToRide;
    private Cash cash;

    public Passenger() {
    }

    public Passenger(String name, String surname, int pathToRide, Cash cash) {
        super(name, surname);
        this.pathToRide = pathToRide;
        this.cash = cash;
    }

    public void setCash(Cash cash) {
        this.cash = cash;
    }

    public Cash getCash() {
        return this.cash;
    }

    public void setPathToRide(double pathToRide) throws InvalidValueException {
        if (pathToRide <= 0) {
            throw new InvalidValueException("path can't be zero or less");
        }else{
            this.pathToRide = pathToRide;
        }
    }

    public double getPathToRide() {
        return this.pathToRide;
    }

    @Override
    public void payForTaxi(Service service) throws InvalidValueException {
        double tempIncome = service.getIncome();
        double tempSum = getPathToRide() * service.getPrizePerMeter();
        if (tempSum <= cash.getAmount()) {
            String cashType = getCash().getType();
            if (cashType.equals("Card")) {
                tempSum *= TEMP_SUM;
            }
            double tempCash = getCash().getAmount() - tempSum;
            getCash().setAmount(tempCash);
            service.setIncome(tempIncome + tempSum);
            System.out.println("Payment was success! classes.Passenger had enough money!");
        } else {
            System.out.println("Payment was failed! classes.Passenger hadn't enough money!");
        }
    }

    @Override
    public String toString() {
        return "Passenger{\n" +
                " Name: " + getName() +
                "\n Surname: " + getSurname() +
                "\n pathToRide = " + getPathToRide() +
                "\n cash type: " + getCash().getType() +
                "\n cash amount = " + getCash().getAmount() +
                "\n}";
    }
}
