package pro.sstd.utils.calendar.days;

import pro.sstd.utils.calendar.structure.DateInfo;
import pro.sstd.utils.calendar.structure.DayType;

import java.time.LocalDate;
import java.util.Map;

/**
 * Интерфейс для производственного календаря
 */
public interface SstdCalendarDaysInterface {

    void init();

    void add(String date, DayType type);

    void add(String date, DayType type, String title);

    Map<LocalDate, DateInfo> getDays();

}
