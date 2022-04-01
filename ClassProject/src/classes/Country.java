package classes;

import exceptions.InvalidStringException;
import org.apache.commons.lang3.StringUtils;

public class Country {

    private String name;
    private String city;
    private String district;

    public Country() {
    }

    public Country(String name, String city, String district) {
        this.name = name;
        this.city = city;
        this.district = district;
    }

    public void setName(String name) throws InvalidStringException {
        if (StringUtils.isEmpty(name)) {
            throw new InvalidStringException("Name of country can't be null");
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return this.name;
    }

    public void setCity(String city) throws InvalidStringException {
        if (StringUtils.isEmpty(city)) {
            throw new InvalidStringException("Name of city can't be null");
        } else {
            this.city = city;
        }
    }

    public String getCity() {
        return city;
    }

    public void setDistrict(String district) throws InvalidStringException {
        if (StringUtils.isEmpty(district)) {
            throw new InvalidStringException("Name of district can't be null");
        } else {
            this.district = district;
        }
    }

    public String getDistrict() {
        return district;
    }

    @Override
    public String toString() {
        return "Country{\n" +
                " Name: " + getName() +
                "\n city : " + getCity() +
                "\n district : " + getDistrict() +
                "\n}";
    }
}
