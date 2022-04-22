package classes;

public class Car extends Vehicle {

    private String mark;
    private Engine engine;
    private Wheel wheels;


    public Car() {
    }

    public Car(double tankVolume, double fuelAmount, Engine engine,
               Wheel wheels, String mark, Category category) {
        super(category, fuelAmount, tankVolume);
        this.mark = mark;
        this.engine = engine;
        this.wheels = wheels;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setWheels(Wheel wheels) {
        this.wheels = wheels;
    }

    public Wheel getWheels() {
        return wheels;
    }

    @Override
    public String toString() {
        return "Car{\n" +
                " Mark : " + getMark() +
                "\n" + getCategory() +
                "\n" + getEngine() +
                "\n" + getWheels() +
                "\n fuel amount =" + getFuelAmount() +
                "\n tank volume = " + getTankVolume() +
                "\n " + category.toString() +
                "\n}";
    }
}
