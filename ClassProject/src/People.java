public class People {
    private String name;
    private String surname;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public People(){
        setName("Tom");
        setSurname("Watson");
    }
    public People(String name, String surname){
        setName(name);
        setSurname(surname);
    }
}
