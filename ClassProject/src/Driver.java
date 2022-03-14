public class Driver extends People {

    private License license;

    public void setLicense (License license){
        this.license = license;
    }

    public License getLicense() {
        return license;
    }

    public Driver(){
        super();
        setLicense(new License());
    }
    public Driver(License license, String name, String surname){
        super(name, surname);
        setLicense(license);
    }
    public void refuelCar(Car car, Service service){
        double neededFuel = car.getTankVolume() - car.getFuelAmount();
        double neededCash = neededFuel * car.getEngine().getFuel().getPricePerLiter();
        double tempIncome = service.getIncome();
        if(neededCash <= tempIncome){
            service.setIncome(tempIncome - neededCash);
            car.setFuelAmount(car.getTankVolume());
            System.out.println("Car was successfully refueled");
        }else {
            System.out.println("There is not enough of income to pay for fuel");
        }

    }
}
