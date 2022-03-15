import java.time.LocalDate;
public class License {
    private LocalDate dateFrom;
    private LocalDate dateTo;

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

    public License(){}

    public License(LocalDate dateFrom, LocalDate dateTo){
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
    }
}