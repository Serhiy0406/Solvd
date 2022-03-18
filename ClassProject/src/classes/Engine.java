package classes;

public class Engine {
    private String model;
    private Fuel fuel;

    public Engine(){}

    public Engine(String model, Fuel fuel){
        this.model = model;
        this.fuel = fuel;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Engine{\n" +
                " Model: " + getModel() +
                "\n fuel type : " + getFuel().getName() +
                "\n fuel prize per liter = " + getFuel().getPricePerLiter() +
                "\n}";
    }
}
