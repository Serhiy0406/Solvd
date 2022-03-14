public class Fuel {
    private String name;
    private double pricePerLiter;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPricePerLiter(double pricePerLiter) {
        this.pricePerLiter = pricePerLiter;
    }

    public double getPricePerLiter() {
        return pricePerLiter;
    }

    public Fuel(){
        setName("Diesel");
        setPricePerLiter(46.99);
    }
    public Fuel(String name, double pricePerLiter){
        setName(name);
        setPricePerLiter(pricePerLiter);
    }
}
