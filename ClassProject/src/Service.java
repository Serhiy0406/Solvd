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

    public Service(){
        setName("Uklon");
        setPhone("+380993482488");
        setPrizePerMeter(0.1);
        setIncome(0);
    }
    public Service(String name, String phone, double prizePerMeter, double income){
        setIncome(income);
        setPrizePerMeter(prizePerMeter);
        setName(name);
        setPhone(phone);
    }
}
