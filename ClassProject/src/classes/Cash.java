package classes;

import exceptions.InvalidStringException;
import exceptions.InvalidValueException;
import org.apache.commons.lang3.StringUtils;

public class Cash {

    private String type;
    private double amount;

    public Cash() {
    }

    public Cash(String type, double amount) {
        this.amount = amount;
        this.type = type;
    }

    public void setAmount(double amount) throws InvalidValueException {
        if (amount < 0) {
            throw new InvalidValueException("Cash value can't be negative");
        } else {
            this.amount = amount;
        }
    }

    public double getAmount() {
        return amount;
    }

    public void setType(String type) throws InvalidStringException {
        if (StringUtils.isEmpty(type)) {
            throw new InvalidStringException("Type of a cash can't be empty/null");
        } else {
            this.type = type;
        }
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Cash{\n" +
                "\ncash type: " + getType() +
                "\ncash amount = " + getAmount() +
                "\n}";
    }
}
