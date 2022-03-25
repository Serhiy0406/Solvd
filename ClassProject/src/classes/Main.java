package classes;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cash cash = new Cash("Card", 25000);
        Passenger passenger = new Passenger("Tom", "Watson", 250, cash);

        License license = new License(LocalDate.of(2002, 1, 8),
                LocalDate.of(2020, 1, 8));
        Driver Alex = new Driver(license, "Alex", "Griffin");

        Order order = new Order();
        Country Ukraine = new Country("Ukraine", "Kyiv", "Nash");
        Service service = new Service("Uklon", "+3809901532352",
                0.1, 0, Ukraine, order);

        Fuel diesel = new Fuel("Diesel", 30.5);
        Engine engine = new Engine("someModel", diesel);
        Wheel wheel = new Wheel("Winter", 50);

        System.out.println(passenger);
    }
}
