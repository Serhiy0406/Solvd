package classes;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.time.LocalDate;

public class Main {

    private static final Logger LOGGER = LogManager.getLogger(Main.class.getName());

    public static void main(String[] args) {
        try {
            LOGGER.info("its work");

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

            //System.out.println(passenger);
            LOGGER.info(passenger);
        } catch (Exception exception) {
            //System.out.println("Exception: " + exception.getMessage());
            LOGGER.error("Exception: " + exception.getMessage());
        }
    }
}
