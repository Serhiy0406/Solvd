package classes;

public class Order {

    private Passenger passenger;
    private int metersToPassenger;

    public Order() {
    }

    public Order(Passenger passenger, int metersToPassenger) {
        this.metersToPassenger = metersToPassenger;
        this.passenger = passenger;
    }

    public int getMetersToPassenger() {
        return metersToPassenger;
    }

    public void setMetersToPassenger(int metersToPassenger) {
        this.metersToPassenger = metersToPassenger;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    @Override
    public String toString() {
        return "Order {\n" +
                " passenger name: " + getPassenger().getName() +
                "\n passenger surname: " + getPassenger().getSurname() +
                "\n how far away passenger (in meters) = " + getMetersToPassenger() +
                "\n}";
    }
}
