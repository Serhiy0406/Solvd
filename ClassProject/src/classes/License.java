package classes;

import java.time.LocalDate;

public class License {

    private LocalDate dateFrom;
    private LocalDate dateTo;

    public License(){}

    public License(LocalDate dateFrom, LocalDate dateTo){
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
    }

    public void setDateFrom(LocalDate dateFrom) {
        this.dateFrom = dateFrom;
    }

    public LocalDate getDateFrom(){
        return this.dateFrom;
    }

    public void setDateTo(LocalDate dateTo) {
        this.dateTo = dateTo;
    }

    public LocalDate getDateTo(){
        return this.dateTo;
    }

    @Override
    public String toString() {
        return "License{\n" +
                "\n Start date : " + getDateFrom() +
                "\n End date : " + getDateTo() +
                "\n}";
    }
}