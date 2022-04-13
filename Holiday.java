public class Holiday {
    private String name;
    private String month;
    private int day;

    public int getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public String getName() {
        return name;
    }

    public Holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }
}
