package classes;

import enums.CarType;

import interfaces.Drivable;

public class Category {

//    private String name;
    private int maxPassengerCapacity;
    private CarType carType;

    public Category() {
    }

    public Category(/*String name,*/ int maxPassengerCapacity, CarType carType) {
//        this.name = name;
        this.maxPassengerCapacity = maxPassengerCapacity;
        this.carType = carType;
    }

//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }

    public void setMaxPassengerCapacity(int maxPassengerCapacity) {
        this.maxPassengerCapacity = maxPassengerCapacity;
    }

    public int getMaxPassengerCapacity() {
        return maxPassengerCapacity;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public CarType getCarType() {
        return carType;
    }

    @Override
    public String toString() {

        String result;

        Drivable d1=(key)->{ return "This car can be started by " + key; };

        if (getCarType().getValue().equals("Sport car")){
            result = d1.drive("button");
        }else{
            result = d1.drive("key");
        }

        return "Category{\n" +
                " Car type: " + getCarType().getValue() +
                "\n Passenger capacity: " + getMaxPassengerCapacity() +
                "\n Car type by comfort: " + getCarType() +
                "\n " + result +
                "\n}";
    }
}
