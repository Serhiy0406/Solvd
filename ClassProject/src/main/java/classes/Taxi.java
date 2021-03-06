package classes;

public class Taxi {

    private Car car;
    private Driver driver;
    private Service service;

    public Taxi() {
    }

    public Taxi(Car car, Driver driver, Service service) {
        this.car = car;
        this.driver = driver;
        this.service = service;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Service getService() {
        return service;
    }
}
