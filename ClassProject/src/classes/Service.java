package classes;

import exceptions.FuelAmountException;
import exceptions.InvalidStringException;
import exceptions.InvalidValueException;
import interfaces.IService;
import org.apache.commons.lang3.StringUtils;

public class Service implements IService {

    private String name;
    private String phone;
    private double prizePerMeter;
    private double income;
    private Country country;
    private Order order;

    public Service() {
    }

    public Service(String name, String phone, double prizePerMeter, double income,
                   Country country, Order order) {
        this.income = income;
        this.prizePerMeter = prizePerMeter;
        this.name = name;
        this.phone = phone;
        this.country = country;
        this.order = order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Country getCountry() {
        return country;
    }

    public void setName(String name) throws InvalidStringException {
        if (StringUtils.isEmpty(name)) {
            throw new InvalidStringException("Name of company can't be null");
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void setIncome(double income) throws InvalidValueException {
        if (income < 0) {
            throw new InvalidValueException("income can't be negative");
        } else {
            this.income = income;
        }

    }

    public double getIncome() {
        return income;
    }

    public void setPhone(String phone) throws InvalidStringException {
        if (StringUtils.isEmpty(phone)) {
            throw new InvalidStringException("Phone can't be null");
        } else {
            this.phone = phone;
        }
    }

    public String getPhone() {
        return phone;
    }

    public void setPrizePerMeter(double prizePerMeter) throws InvalidValueException {
        if (prizePerMeter < 0) {
            throw new InvalidValueException("Prize per meter can't be negative");
        } else {
            this.prizePerMeter = prizePerMeter;
        }
    }

    public double getPrizePerMeter() {
        return prizePerMeter;
    }

    @Override
    public void makeOrder(Passenger passenger, int metersToPassenger) {
        this.order = new Order(passenger, metersToPassenger);
    }

    @Override
    public void sendOrder(Driver driver, Car car) throws InvalidValueException, FuelAmountException {
        driver.takeOrder(car, this);
    }

    @Override
    public String toString() {
        return "Service{\n" +
                " Name : " + getName() +
                "\n Phone : " + getPhone() +
                "\n Prize per meter = " + getPrizePerMeter() +
                "\n Income = " + getIncome() +
                "\n country : " + getCountry().getName() +
                "\n city : " + getCountry().getCity() +
                "\n district : " + getCountry().getDistrict() +
                "\n order given to : " + getOrder().getPassenger().getName() +
                " " + getOrder().getPassenger().getSurname() +
                "\n}";
    }
}
