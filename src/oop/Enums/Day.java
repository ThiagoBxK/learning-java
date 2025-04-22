package oop.Enums;

public enum Day {
    MONDAY("Start of the week", 1),
    TUESDAY("Second day", 2),
    WEDNESDAY("Middle of the week", 3),
    THURSDAY("Almost there", 4),
    FRIDAY("End of work week", 5),
    SATURDAY("Weekend!", 6),
    SUNDAY("Rest day", 7);

    private final String description;
    private final int dayNumber;

    Day(String description, int dayNumber) {
        this.description = description;
        this.dayNumber = dayNumber;
    }

    public String getDescription() {
        return description;
    }

    public int getDayNumber() {
        return dayNumber;
    }
}
