package pro.sstd.utils.calendar;

import pro.sstd.utils.calendar.days.DefaultDays;
import pro.sstd.utils.calendar.days.SstdCalendarDaysInterface;
import pro.sstd.utils.calendar.structure.DateInfo;
import pro.sstd.utils.calendar.structure.DayType;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.TreeMap;

public class SstdCalendar {

    TreeMap<LocalDate, DateInfo> days;

    /**
     * Constructor
     *
     * @param sstdCalendarDays SstdCalendarDaysInterface extends {@link DefaultDays} class
     */
    public SstdCalendar(SstdCalendarDaysInterface sstdCalendarDays) {
        this.days = sstdCalendarDays.getDays();
    }

    public SstdCalendar() {
        DefaultDays defaultDays = new DefaultDays();
        this.days = defaultDays.getDays();
    }

    public boolean isWeekEnd(LocalDate date){
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        return dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY;
    }

    public boolean isWorkWeek(LocalDate date){
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        return dayOfWeek != DayOfWeek.SATURDAY && dayOfWeek != DayOfWeek.SUNDAY;
    }

    public boolean isShortDay(LocalDate date) {
        return days.containsKey(date) && days.get(date).getType() == DayType.SHORTDAY;
    }

    public boolean isWorkDay(LocalDate date){
        if (days.containsKey(date)) {
            if (days.get(date).getType().equals(DayType.WORKDAY))
                return true;
            if (days.get(date).getType().equals(DayType.HOLIDAY))
                return false;
        }
        return isWorkWeek(date);
    }

    public boolean isHoliday(LocalDate date){
        if(days.containsKey(date)) {
            if (days.get(date).getType().equals(DayType.HOLIDAY))
                return true;
            if (days.get(date).getType().equals(DayType.WORKDAY) || days.get(date).getType().equals(DayType.SHORTDAY))
                return false;
        }
        return isWeekEnd(date);
    }

    public LocalDate getDateAfterInterval(LocalDate date, int dayInterval) {
        return date.plusDays(dayInterval);
    }

    public LocalDate getWorkDateAfterInterval(LocalDate date, int dayInterval) {
        LocalDate result = date.plusDays(dayInterval);
        while (isHoliday(result))
            result = result.plusDays(1);
        return result;
    }

    public LocalDate getDateAfterWorkDaysInterval(LocalDate date, int workDayInterval) {
        for (int i = 0; i < workDayInterval; i++) {
            date = getWorkDateAfterInterval(date, 1);
        }
        return date;
    }

    public DateInfo getDateInfo(LocalDate date) {
        if (days.containsKey(date))
            return days.get(date);
        else if (isWorkDay(date))
            return new DateInfo(date, DayType.WORKDAY);
        else if (isHoliday(date))
            return new DateInfo(date, DayType.HOLIDAY);
        else
            return null;
    }
}
