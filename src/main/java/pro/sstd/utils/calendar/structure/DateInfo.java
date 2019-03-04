package pro.sstd.utils.calendar.structure;

import java.time.LocalDate;

/**
 * Информация о дате
 */
public class DateInfo {

    /**
     * Дата
     */
    private LocalDate date;

    /**
     * Enum {@link DayType} - тип даты
     * Выходной\праздничный, сокращенный рабочий день, рабочий день
     */
    private DayType type;

    /**
     * Наименование праздничного дня
     */
    private String title;

    /**
     * Конструктор
     * @param date LocalDate - дата
     * @param type Enum {@link DayType} - тип
     */
    public DateInfo(LocalDate date, DayType type) {
        this.date = date;
        this.type = type;
    }

    /**
     * Конструктор
     * @param date LocalDate - дата
     * @param type Enum {@link DayType} - тип
     * @param title String - наимеование праздничного дня
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
