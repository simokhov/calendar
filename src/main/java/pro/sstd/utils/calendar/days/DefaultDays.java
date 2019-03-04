package pro.sstd.utils.calendar.days;

import pro.sstd.utils.calendar.structure.DateInfo;
import pro.sstd.utils.calendar.structure.DayType;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/**
 * Производственный календарь по-умолчанию
 */
public class DefaultDays implements SstdCalendarDaysInterface{

    /**
     * Хранилище для производственного календаря с поиском по ключу
     */
    private Map<LocalDate, DateInfo> days = new HashMap<>();

    /**
     * Консктруктор
     */
    public DefaultDays() {
        init();
    }

    /**
     * Инициализируем пустой календаоь
     */
    public void init(){};

    /**
     * Добавить в календарь дату
     *
     * @param date - дата
     * @param type - тип {@link DayType}
     */
    public void add(String date, DayType type) {
        add(date, type, null);
    }

    /**
     * Добавить в календарь дату
     *
     * @param date  - дата
     * @param type  - тип {@link DayType}
     * @param title - наименование праздника
     */
    public void add(String date, DayType type, String title){
        LocalDate localDate = LocalDate.parse(date);
        days.put(localDate, new DateInfo(localDate, type, title));
    }

    /**
     * Возвращает производственный календарь в виде Map
     * Ключ - дата, значение - {@link DateInfo}
     *
     * @return Map<LocalDate       ,               DateInfo>
     */
    public Map<LocalDate, DateInfo> getDays() {
        return days;
    }
}
