public class Service {
    private String name;
    private String phone;
    private double prizePerMeter;
    private double income;
    private Country country;

    public void setCountry(Country country) {
        this.country = country;
    }

    public Country getCountry() {
        return country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public double getIncome() {
        return income;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPrizePerMeter(double prizePerMeter) {
        this.prizePerMeter = prizePerMeter;
    }

    public double getPrizePerMeter() {
        return prizePerMeter;
    }

    public Service(){}

    public Service(String name, String phone, double prizePerMeter, double income){
        this.name = name;
        this.phone = phone;
        this.prizePerMeter = prizePerMeter;
        this.income = income;
    }

    public void makeOrder(Passenger passenger, int metersToPassenger){
        Order order = new Order(passenger, metersToPassenger);
    }
    public void sendOrder(Driver driver, Car car, Order order){
        driver.takeOrder(order, car, this);
    }
}
