package classes;

public class Cash {
    private String type;
    private double amount;

    public Cash(){}

    public Cash(String type, double amount){
        this.type = type;
        this.amount = amount;
    }

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

    @Override
    public  String toString(){
        return "Cash{\n" +
                "\ncash type: " + getType() +
                "\ncash amount = " + getAmount() +
                "\n}";
    }
}
