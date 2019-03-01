package pro.sstd.utils.calendar;

import org.junit.Assert;
import org.junit.Test;
import pro.sstd.utils.calendar.days.DefaultDays;
import pro.sstd.utils.calendar.structure.DateInfo;
import pro.sstd.utils.calendar.structure.DayType;

import java.time.LocalDate;

public class SstdCalendarTest {

    private SstdCalendar calendar = new SstdCalendar(new TestDays());
    private static String TEST_HOLIDAY_TEXT = "Test Holiday";
    private static String TEST_WORKDAY_TEXT = "Test Workday";
    private static String TEST_SHORTDAY_TEXT = "Test Shortday";

    private class TestDays extends DefaultDays {
        @Override
        public void init() {
            add("2019-01-25", DayType.HOLIDAY, TEST_HOLIDAY_TEXT);
            add("2019-01-27", DayType.WORKDAY, TEST_WORKDAY_TEXT);
            add("2019-01-31", DayType.SHORTDAY, TEST_SHORTDAY_TEXT);
            add("2019-02-01", DayType.HOLIDAY, TEST_HOLIDAY_TEXT);
            add("2019-02-02", DayType.WORKDAY, TEST_WORKDAY_TEXT);
        }
    }

    @Test
    public void isWeekEnd() {
        //Test SAT-SUN
        Assert.assertTrue(calendar.isWeekEnd(LocalDate.parse("2019-01-05")));
        Assert.assertTrue(calendar.isWeekEnd(LocalDate.parse("2019-01-06")));
        //Test MON-FRI
        Assert.assertFalse(calendar.isWeekEnd(LocalDate.parse("2019-01-04")));
        Assert.assertFalse(calendar.isWeekEnd(LocalDate.parse("2019-01-03")));
        Assert.assertFalse(calendar.isWeekEnd(LocalDate.parse("2019-01-02")));
        Assert.assertFalse(calendar.isWeekEnd(LocalDate.parse("2019-01-01")));
        Assert.assertFalse(calendar.isWeekEnd(LocalDate.parse("2018-12-31")));
    }

    @Test
    public void isWorkWeek() {
        //Test MON-FRI
        Assert.assertTrue(calendar.isWorkWeek(LocalDate.parse("2018-12-31")));
        Assert.assertTrue(calendar.isWorkWeek(LocalDate.parse("2019-01-01")));
        Assert.assertTrue(calendar.isWorkWeek(LocalDate.parse("2019-01-02")));
        Assert.assertTrue(calendar.isWorkWeek(LocalDate.parse("2019-01-03")));
        Assert.assertTrue(calendar.isWorkWeek(LocalDate.parse("2019-01-04")));
        //Test SAT-SUN
        Assert.assertFalse(calendar.isWorkWeek(LocalDate.parse("2019-01-05")));
        Assert.assertFalse(calendar.isWorkWeek(LocalDate.parse("2019-01-06")));
    }

    @Test
    public void isShortDay() {
        // Test SHORTDAY
        Assert.assertTrue(calendar.isShortDay(LocalDate.parse("2019-01-31")));
        // Test HOLIDAY
        Assert.assertFalse(calendar.isShortDay(LocalDate.parse("2019-02-01")));
        // Test WORKDAY
        Assert.assertFalse(calendar.isShortDay(LocalDate.parse("2019-02-02")));
        // Test WEEKEND
        Assert.assertFalse(calendar.isShortDay(LocalDate.parse("2019-01-06")));
    }

    @Test
    public void isWorkDay() {
        // Test WORKDAY
        Assert.assertTrue(calendar.isWorkDay(LocalDate.parse("2019-02-02")));
        // Test SHORTDAY
        Assert.assertTrue(calendar.isWorkDay(LocalDate.parse("2019-01-31")));
        // Test HOLIDAY
        Assert.assertFalse(calendar.isWorkDay(LocalDate.parse("2019-02-01")));
        // Test WEEKEND
        Assert.assertFalse(calendar.isWorkDay(LocalDate.parse("2019-01-06")));
    }

    @Test
    public void isHoliday() {
        // Test HOLIDAY
        Assert.assertTrue(calendar.isHoliday(LocalDate.parse("2019-02-01")));
        // Test WORKDAY
        Assert.assertFalse(calendar.isHoliday(LocalDate.parse("2019-02-02")));
        // Test SHORTDAY
        Assert.assertFalse(calendar.isHoliday(LocalDate.parse("2019-01-31")));
    }

    @Test
    public void getDateAfterInterval() {
        Assert.assertEquals(calendar.getDateAfterInterval(LocalDate.parse("2019-01-01"), 5), LocalDate.parse("2019-01-06"));
    }

    @Test
    public void getWorkDateAfterInterval() {
        // Test working days
        Assert.assertEquals(calendar.getWorkDateAfterInterval(LocalDate.parse("2019-01-21"), 1), LocalDate.parse("2019-01-22"));
        // Test with weekend
        Assert.assertEquals(calendar.getWorkDateAfterInterval(LocalDate.parse("2019-01-21"), 6), LocalDate.parse("2019-01-27"));
        // Test with holidays and workday
        Assert.assertEquals(calendar.getWorkDateAfterInterval(LocalDate.parse("2019-01-21"), 4), LocalDate.parse("2019-01-27"));
    }

    @Test
    public void getDateAfterWorkDaysInterval() {
        // Test working days
        Assert.assertEquals(calendar.getDateAfterWorkDaysInterval(LocalDate.parse("2019-01-21"), 1), LocalDate.parse("2019-01-22"));
        // Test working days through weekend
        Assert.assertEquals(calendar.getDateAfterWorkDaysInterval(LocalDate.parse("2019-01-14"), 7), LocalDate.parse("2019-01-23"));
        // Test working days through holidays and workdays
        Assert.assertEquals(calendar.getDateAfterWorkDaysInterval(LocalDate.parse("2019-01-14"), 9), LocalDate.parse("2019-01-27"));
    }

    @Test
    public void getDateInfo(){
        // test presence in days dictionary
        DateInfo dictionaryDayInfo = calendar.getDateInfo(LocalDate.parse("2019-02-01"));
        Assert.assertNotNull(dictionaryDayInfo);
        Assert.assertEquals(dictionaryDayInfo.getType(), DayType.HOLIDAY);
        Assert.assertEquals(dictionaryDayInfo.getTitle(), TEST_HOLIDAY_TEXT);

        // test workday not in days dictionary
        DateInfo workDayInfo = calendar.getDateInfo(LocalDate.parse("2019-01-04"));
        Assert.assertNotNull(workDayInfo);
        Assert.assertEquals(workDayInfo.getType(), DayType.WORKDAY);
        Assert.assertNull(workDayInfo.getTitle());

        // test holiday not in days dictionary
        DateInfo holidayInfo = calendar.getDateInfo(LocalDate.parse("2019-01-05"));
        Assert.assertNotNull(holidayInfo);
        Assert.assertEquals(holidayInfo.getType(), DayType.HOLIDAY);
        Assert.assertNull(holidayInfo.getTitle());
    }
}
