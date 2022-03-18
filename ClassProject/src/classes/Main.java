package classes;

public class Main {
    public static void main(String[] args) {
        Cash cash = new Cash("Card", 25000);
        Passenger passenger = new Passenger("Tom", "Watson", 250, cash);
        System.out.println(passenger);
    }
}
