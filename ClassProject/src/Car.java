public class Car {
    private String mark;
    private Engine engine;
    private Wheel[] wheels;
    private double fuelAmount;
    private double tankVolume;

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
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

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public Car(){}

    public Car(double tankVolume, double fuelAmount, Engine engine, Wheel[] wheels, String mark){
        this.mark = mark;
        this.engine = engine;
        this.wheels = wheels;
        this.fuelAmount = fuelAmount;
        this.tankVolume = tankVolume;
    }

    public void startPath(){
        System.out.println("Car is started by key!");
    }

}
