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
        this.type = "Card";
        this.amount = 12000;
    }
    public Cash(String type, double amount){
        this.type = type;
        this.amount = amount;
    }
}
