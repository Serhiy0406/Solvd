package enums;

public enum CarType {
    VIP("Sport car"),
    COMFORT("Sedan"),
    ORDINARY("Hatchback");

    private final String value;

    CarType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}