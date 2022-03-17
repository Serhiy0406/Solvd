public class Order {
    private Passenger passenger;
    private int metersToPassenger;

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

    public Order(){}

    public Order(Passenger passenger, int metersToPassenger){
        this.metersToPassenger = metersToPassenger;
        this.passenger = passenger;
    }
}
