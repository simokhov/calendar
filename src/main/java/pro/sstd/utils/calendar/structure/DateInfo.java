package pro.sstd.utils.calendar.structure;

import java.time.LocalDate;

public class DateInfo {

    /**
     * Date
     */
    private LocalDate date;

    /**
     * Enum {@link DayType}
     */
    private DayType type;

    /**
     * Optional. Title of holiday
     */
    private String title;

    /**
     * Constructor.
     * @param date LocalDate
     * @param type Enum {@link DayType}
     */
    public DateInfo(LocalDate date, DayType type) {
        this.date = date;
        this.type = type;
    }

    /**
     * Constructor
     * @param date LocalDate
     * @param type Enum {@link DayType}
     * @param title String
     */
    public DateInfo(LocalDate date, DayType type, String title) {
        this.date = date;
        this.type = type;
        this.title = title;
    }

    // getters and setters

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public DayType getType() {
        return type;
    }

    public void setType(DayType type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
