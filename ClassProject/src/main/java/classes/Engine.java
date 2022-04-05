package classes;

import exceptions.InvalidStringException;
import org.apache.commons.lang3.StringUtils;

public class Engine {

    private String model;
    private Fuel fuel;

    public Engine() {
    }

    public Engine(String model, Fuel fuel) {
        this.model = model;
        this.fuel = fuel;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public void setModel(String model) throws InvalidStringException {
        if (StringUtils.isEmpty(model)) {
            throw new InvalidStringException("Name of model can't be empty");
        } else {
            this.model = model;
        }
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
