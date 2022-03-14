public class Passenger extends People{
    private double pathToRide;
    private Cash cash;

    public void setCash(Cash cash) {
        this.cash = cash;
    }

    public Cash getCash(){
        return this.cash;
    }

    public void setPathToRide(double pathToRide) {
        this.pathToRide = pathToRide;
    }

    public double getPathToRide(){
        return this.pathToRide;
    }


    public Passenger(){
       super();
       setCash(new Cash());
    }

    public Passenger(String name, String surname, int pathToRide, Cash cash){
        super(name, surname);
        setPathToRide(pathToRide);
        setCash(cash);
    }

    public void payForTaxi(Service service){
        double tempIncome = service.getIncome();
        double tempSum = getPathToRide() * service.getPrizePerMeter();
        if(tempSum <= cash.getAmount()){
            String x = getCash().getType();
            if(x == "Card"){
                tempSum*=0.7;
            }
            double tempCash = getCash().getAmount()-tempSum;
            getCash().setAmount(tempCash);
            service.setIncome(tempIncome + tempSum);
            System.out.println("Payment was success! Passenger had enough money!");
        }else{
            System.out.println("Payment was failed! Passenger hadn't enough money!");
        }
    }

}
