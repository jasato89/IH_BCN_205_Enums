package enums;

public enum Status {
    ONLINE(100, "This user is Online"),
    OFFLINE(0, "Offline"),
    REMOVED(-10, "Removed"),
    IDDLE(50, "Iddle");

    private int value;
    private String name;

    private Status(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

}
