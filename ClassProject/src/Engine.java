public class Engine {
    private String model;
    private Fuel fuel;


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

    public Engine(){
        setModel("Stirling");
        setFuel(new Fuel());
    }
    public Engine(String model, Fuel fuel){
        setFuel(fuel);
        setModel(model);
    }
}
