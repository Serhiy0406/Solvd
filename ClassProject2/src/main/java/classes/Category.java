package classes;

public class Category {

    private String name;
    private int maxPassengerCapacity;
    private double lengthMeters;
    private double widthMeters;

    public Category() {
    }

    public Category(String name, int maxPassengerCapacity,
                    double lengthMeters, double widthMeters) {
        this.name = name;
        this.lengthMeters = lengthMeters;
        this.maxPassengerCapacity = maxPassengerCapacity;
        this.widthMeters = widthMeters;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLengthMeters(double lengthMeters) {
        this.lengthMeters = lengthMeters;
    }

    public double getLengthMeters() {
        return lengthMeters;
    }

    public void setMaxPassengerCapacity(int maxPassengerCapacity) {
        this.maxPassengerCapacity = maxPassengerCapacity;
    }

    public int getMaxPassengerCapacity() {
        return maxPassengerCapacity;
    }

    public void setWidthMeters(double widthMeters) {
        this.widthMeters = widthMeters;
    }

    public double getWidthMeters() {
        return widthMeters;
    }

    @Override
    public String toString() {
        return "Category{\n" +
                " Name: " + getName() +
                "\n Passenger capacity: " + getMaxPassengerCapacity() +
                "\n length in meters = " + getLengthMeters() +
                "\n width in meters = " + getWidthMeters() +
                "\n}";
    }
}
