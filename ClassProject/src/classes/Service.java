package classes;

public class Service {
    private String name;
    private String phone;
    private double prizePerMeter;
    private double income;
    private Country country;
    private Order order;

    public Service(){}

    public Service(String name, String phone, double prizePerMeter, double income){
        this.name = name;
        this.phone = phone;
        this.prizePerMeter = prizePerMeter;
        this.income = income;
        this.order = new Order();
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }

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

    public void makeOrder(Passenger passenger, int metersToPassenger){
         this.order = new Order(passenger, metersToPassenger);
    }

    public void sendOrder(Driver driver, Car car){
        driver.takeOrder(car, this);
    }

    @Override
    public String toString() {
        return "Service{\n" +
                " Name : " + getName() +
                "\n Phone : " + getPhone() +
                "\n Prize per meter = " + getPrizePerMeter() +
                "\n Income = " + getIncome() +
                "\n country : " + getCountry().getName() +
                "\n city : " + getCountry().getCity() +
                "\n district : " + getCountry().getDistrict() +
                "\n order given to : " + getOrder().getPassenger().getName() +
                " " + getOrder().getPassenger().getSurname() +
                "\n}";
    }
}
