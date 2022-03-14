public class Cash {
    private String type;
    private double amount;

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public Cash(){
        setType("Card");
        setAmount(12000);
    }
    public Cash(String type, double amount){
        setAmount(amount);
        setType(type);
    }
}
