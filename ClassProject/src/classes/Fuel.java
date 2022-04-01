package classes;

import exceptions.InvalidStringException;
import exceptions.InvalidValueException;
import org.apache.commons.lang3.StringUtils;

public class Fuel {

    private String name;
    private double pricePerLiter;

    public Fuel() {
    }

    public Fuel(String name, double pricePerLiter) {
        this.name = name;
        this.pricePerLiter = pricePerLiter;
    }

    public void setName(String name) throws InvalidStringException {
        if (StringUtils.isEmpty(name)) {
            throw new InvalidStringException("Name of fuel can't be empty");
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void setPricePerLiter(double pricePerLiter) throws InvalidValueException {
        if (pricePerLiter < 0) {
            throw new InvalidValueException("price per liter value can't be negative");
        } else {
            this.pricePerLiter = pricePerLiter;
        }
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
