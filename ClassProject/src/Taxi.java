public class Taxi {
    private Car car;
    private Driver driver;
    private Service service;

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

    public Taxi(){
        setCar(new Car());
        setService(new Service());
        setDriver(new Driver());
    }

    public void driveThePassenger(Passenger passenger, Driver driver){
        double tempFuelAmount = car.getFuelAmount() - passenger.getPathToRide() * 0.001;// 1 liter to 1000 meters
        if(tempFuelAmount >= 0){
            car.startPath();
            car.setFuelAmount(tempFuelAmount);
            System.out.println("Taxi completed the drive/trip!");
            passenger.payForTaxi(getService());
        }else {
            System.out.println("The car don't have enough fuel for the trip!");
            System.out.println("Sending driver to refuel the car");
            System.out.println("<-------------------------------->");
            driver.refuelCar(getCar(), getService());
        }

    }
}
