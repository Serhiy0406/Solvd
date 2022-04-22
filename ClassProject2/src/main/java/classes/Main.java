package classes;

import enums.CarType;
import org.apache.log4j.BasicConfigurator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.commons.lang3.RandomUtils;

import java.time.LocalDate;

public class Main {

    private static final Logger LOGGER = LogManager.getLogger(classes.Main.class);

    public static void main(String[] args) {
        try {
            BasicConfigurator.configure();
            LOGGER.info("work started");

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
            Wheel wheel = new Wheel("Winter", RandomUtils.nextInt(50, 70));
            CarType carType =  CarType.VIP;
            Category category = new Category(5, carType);

            Car car = new Car(RandomUtils.nextDouble(30.0, 50.0), RandomUtils.nextDouble(30.0, 50.0), engine,
                    wheel, "Mercedes", category );

            LOGGER.info(passenger.toString());
            LOGGER.info(Alex.toString());
            LOGGER.info(car.toString());

        } catch (Exception exception) {
            LOGGER.error("Exception: " + exception.getMessage());
        }
    }
}
