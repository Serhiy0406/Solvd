package classes;

import exceptions.InvalidValueException;
import org.apache.log4j.Logger;

import java.time.LocalDate;

import org.apache.commons.lang3.StringUtils;

public class Main {

    private static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) throws InvalidValueException {
        try {
            logger.info("its work");

            System.out.println(StringUtils.isEmpty(""));
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
        } catch (Exception exception) {
            System.out.println("Exception: " + exception.getMessage());
            logger.error("Exception: " + exception.getMessage());
        }
    }
}
