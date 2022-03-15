import java.time.LocalDate;
public class Wheel {
    private String season;
    private double diameter;

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getSeason() {
        return season;
    }

    public Wheel(){}

    public Wheel(String season, double diameter){
        this.diameter = diameter;
        this.season = season;
    }
}