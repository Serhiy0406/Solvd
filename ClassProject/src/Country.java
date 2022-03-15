public class Country {
    private String name;
    private String city;
    private String district;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getDistrict() {
        return district;
    }

    public Country(){}

    public Country(String name, String city, String district){
        this.name = name;
        this.city = city;
        this.district = district;
    }
}
