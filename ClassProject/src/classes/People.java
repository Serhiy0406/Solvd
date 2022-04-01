package classes;

import exceptions.InvalidStringException;
import org.apache.commons.lang3.StringUtils;

public abstract class People {

    private String name;
    private String surname;

    public People() {
    }

    public People(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void setName(String name) throws InvalidStringException {
        if (StringUtils.isEmpty(name)) {
            throw new InvalidStringException("Name can't be empty");
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) throws InvalidStringException {
        if (StringUtils.isEmpty(surname)) {
            throw new InvalidStringException("Surname can't be empty");
        } else {
            this.surname = surname;
        }
    }

    public String getSurname() {
        return surname;
    }
}
