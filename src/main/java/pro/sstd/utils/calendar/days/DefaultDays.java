package pro.sstd.utils.calendar.days;

import pro.sstd.utils.calendar.structure.DateInfo;
import pro.sstd.utils.calendar.structure.DayType;

import java.time.LocalDate;
import java.util.TreeMap;

public class DefaultDays implements SstdCalendarDaysInterface{

    TreeMap<LocalDate, DateInfo> days = new TreeMap<>();

    public DefaultDays() {
        init();
    }

    public void init(){};

    public void add(String date, DayType type) {
        add(date, type, null);
    }

    public void add(String date, DayType type, String title){
        LocalDate localDate = LocalDate.parse(date);
        days.put(localDate, new DateInfo(localDate, type, title));
    }

    public TreeMap<LocalDate, DateInfo> getDays() {
        return days;
    }
}
