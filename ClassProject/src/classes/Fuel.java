package classes;

public class Fuel {

    private String name;
    private double pricePerLiter;

    public Fuel(){}

    public Fuel(String name, double pricePerLiter){
        this.name = name;
        this.pricePerLiter = pricePerLiter;
    }

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

    @Override
    public String toString() {
        return "Fuel{\n" +
                "\n Name : " + getName() +
                "\n Prize per liter = " + getPricePerLiter() +
                "\n}";
    }
}
