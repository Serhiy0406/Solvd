package classes;

public abstract class Vehicle {
    private Category category;

    public Vehicle(){}

    public Vehicle(Category category){
        this.category = category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }
}
