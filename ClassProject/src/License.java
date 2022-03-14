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

    public License(){
        this.dateFrom = LocalDate.now();
        this.dateTo = dateFrom.plusYears(10);
    }
    public License(LocalDate dateFrom, LocalDate dateTo){
        setDateFrom(dateFrom);
        setDateTo(dateTo);
    }
}