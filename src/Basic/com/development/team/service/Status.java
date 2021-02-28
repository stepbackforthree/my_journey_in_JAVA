package Basic.com.development.team.service;

public enum Status {
    FREE("FREE"), VOCATION("VOCATION"), BUSY("BUSY");

    private final String name;

    Status(String name) {
        this.name = name;
    }

    public String getNAME() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
