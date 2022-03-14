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

    public Wheel(){
        setDiameter(20.0);
        String[] seasonArr = {
                "Winter", "Winter", "Spring", "Spring", "Spring", "Summer",
                "Summer", "Summer", "Autumn", "Autumn", "Autumn", "Winter"
        };
        setSeason(seasonArr[LocalDate.now().getMonthValue()-1]);
    }

    public Wheel(String season, double diameter){
        setSeason(season);
        setDiameter(diameter);
    }
}