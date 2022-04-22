package classes;

import java.time.LocalDate;

public class Wheel {
    final static int count = 4;
    private String season;
    private double diameter;

    public Wheel() {
    }

    public Wheel(String season, double diameter) {
        this.diameter = diameter;
        this.season = season;
    }

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

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Wheel {\n" +
                "\n count of wheels : " + getCount() +
                "\n season for : " + getSeason() +
                "\n diameter = " + getDiameter() +
                "\n}";
    }
}