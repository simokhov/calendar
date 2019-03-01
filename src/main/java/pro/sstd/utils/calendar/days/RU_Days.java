package pro.sstd.utils.calendar.days;

import pro.sstd.utils.calendar.structure.DayType;

public class RU_Days extends DefaultDays {

    static private String NEW_YEAR = "Новогодние каникулы (в ред. Федерального закона от 23.04.2012 № 35-ФЗ)";
    static private String CHRISTMAS = "Рождество Христово";
    static private String MENDAY = "День защитника Отечества";
    static private String WOMENDAY = "Международный женский день";
    static private String MAYDAY = "Праздник Весны и Труда";
    static private String VICTORYDAY = "День Победы";
    static private String RUSSIADAY = "День России";
    static private String PEOPLEDAY = "День народного единства";


    @Override
    public void init() {

        // 2013 Holidays list
        add("2013-01-01", DayType.HOLIDAY, NEW_YEAR);
        add("2013-02-01", DayType.HOLIDAY, NEW_YEAR);
        add("2013-03-01", DayType.HOLIDAY, NEW_YEAR);
        add("2013-04-01", DayType.HOLIDAY, NEW_YEAR);
        add("2013-05-01", DayType.HOLIDAY, NEW_YEAR);
        add("2013-06-01", DayType.HOLIDAY, NEW_YEAR);
        add("2013-07-01", DayType.HOLIDAY, CHRISTMAS);
        add("2013-08-01", DayType.HOLIDAY, NEW_YEAR);
        add("2013-22-02", DayType.SHORTDAY);
        add("2013-23-02", DayType.HOLIDAY, MENDAY);
        add("2013-07-03", DayType.SHORTDAY);
        add("2013-08-03", DayType.HOLIDAY, WOMENDAY);
        add("2013-10-03", DayType.HOLIDAY);
        add("2013-30-04", DayType.SHORTDAY);
        add("2013-01-05", DayType.HOLIDAY, MAYDAY);
        add("2013-02-05", DayType.HOLIDAY);
        add("2013-03-05", DayType.HOLIDAY);
        add("2013-08-05", DayType.SHORTDAY);
        add("2013-09-05", DayType.HOLIDAY, VICTORYDAY);
        add("2013-10-05", DayType.HOLIDAY);
        add("2013-11-06", DayType.SHORTDAY);
        add("2013-12-06", DayType.HOLIDAY, RUSSIADAY);
        add("2013-04-11", DayType.HOLIDAY, PEOPLEDAY);
        add("2013-31-12", DayType.SHORTDAY);

        // 2014 Holidays list
        add("2014-01-01", DayType.HOLIDAY, NEW_YEAR);
        add("2014-02-01", DayType.HOLIDAY, NEW_YEAR);
        add("2014-03-01", DayType.HOLIDAY, NEW_YEAR);
        add("2014-04-01", DayType.HOLIDAY, NEW_YEAR);
        add("2014-05-01", DayType.HOLIDAY, NEW_YEAR);
        add("2014-06-01", DayType.HOLIDAY, NEW_YEAR);
        add("2014-07-01", DayType.HOLIDAY, CHRISTMAS);
        add("2014-08-01", DayType.HOLIDAY, NEW_YEAR);
        add("2014-23-02", DayType.HOLIDAY, MENDAY);
        add("2014-24-02", DayType.SHORTDAY);
        add("2014-07-03", DayType.SHORTDAY);
        add("2014-08-03", DayType.HOLIDAY, WOMENDAY);
        add("2014-10-03", DayType.HOLIDAY);
        add("2014-30-04", DayType.SHORTDAY);
        add("2014-01-05", DayType.HOLIDAY, MAYDAY);
        add("2014-02-05", DayType.HOLIDAY);
        add("2014-08-05", DayType.SHORTDAY);
        add("2014-09-05", DayType.HOLIDAY, VICTORYDAY);
        add("2014-11-06", DayType.SHORTDAY);
        add("2014-12-06", DayType.HOLIDAY, RUSSIADAY);
        add("2014-13-06", DayType.HOLIDAY);
        add("2014-03-11", DayType.HOLIDAY);
        add("2014-04-11", DayType.HOLIDAY, PEOPLEDAY);
        add("2014-31-12", DayType.SHORTDAY);

        // 2015 Holidays list
        add("2015-01-01", DayType.HOLIDAY, NEW_YEAR);
        add("2015-02-01", DayType.HOLIDAY, NEW_YEAR);
        add("2015-03-01", DayType.HOLIDAY, NEW_YEAR);
        add("2015-04-01", DayType.HOLIDAY, NEW_YEAR);
        add("2015-05-01", DayType.HOLIDAY, NEW_YEAR);
        add("2015-06-01", DayType.HOLIDAY, NEW_YEAR);
        add("2015-07-01", DayType.HOLIDAY, CHRISTMAS);
        add("2015-08-01", DayType.HOLIDAY, NEW_YEAR);
        add("2015-09-01", DayType.HOLIDAY);
        add("2015-23-02", DayType.HOLIDAY, MENDAY);
        add("2015-08-03", DayType.HOLIDAY, WOMENDAY);
        add("2015-09-03", DayType.HOLIDAY);
        add("2015-30-04", DayType.SHORTDAY);
        add("2015-01-05", DayType.HOLIDAY, MAYDAY);
        add("2015-04-05", DayType.HOLIDAY);
        add("2015-08-05", DayType.SHORTDAY);
        add("2015-09-05", DayType.HOLIDAY, VICTORYDAY);
        add("2015-11-05", DayType.HOLIDAY);
        add("2015-11-06", DayType.SHORTDAY);
        add("2015-12-06", DayType.HOLIDAY, RUSSIADAY);
        add("2015-03-11", DayType.SHORTDAY);
        add("2015-04-11", DayType.HOLIDAY, PEOPLEDAY);
        add("2015-31-12", DayType.SHORTDAY);

        // 2016 Holidays list
        add("2016-01-01", DayType.HOLIDAY, NEW_YEAR);
        add("2016-02-01", DayType.HOLIDAY, NEW_YEAR);
        add("2016-03-01", DayType.HOLIDAY, NEW_YEAR);
        add("2016-04-01", DayType.HOLIDAY, NEW_YEAR);
        add("2016-05-01", DayType.HOLIDAY, NEW_YEAR);
        add("2016-06-01", DayType.HOLIDAY, NEW_YEAR);
        add("2016-07-01", DayType.HOLIDAY, CHRISTMAS);
        add("2016-08-01", DayType.HOLIDAY, NEW_YEAR);
        add("2016-20-02", DayType.SHORTDAY);
        add("2016-22-02", DayType.HOLIDAY);
        add("2016-23-02", DayType.HOLIDAY, MENDAY);
        add("2016-07-03", DayType.HOLIDAY);
        add("2016-08-03", DayType.HOLIDAY, WOMENDAY);
        add("2016-01-05", DayType.HOLIDAY, MAYDAY);
        add("2016-02-05", DayType.HOLIDAY);
        add("2016-03-05", DayType.HOLIDAY);
        add("2016-09-05", DayType.HOLIDAY, VICTORYDAY);
        add("2016-12-06", DayType.HOLIDAY, RUSSIADAY);
        add("2016-13-06", DayType.HOLIDAY);
        add("2016-03-11", DayType.SHORTDAY);
        add("2016-04-11", DayType.HOLIDAY, PEOPLEDAY);

        // 2017 Holidays list
        add("2017-01-01", DayType.HOLIDAY, NEW_YEAR);
        add("2017-02-01", DayType.HOLIDAY, NEW_YEAR);
        add("2017-03-01", DayType.HOLIDAY, NEW_YEAR);
        add("2017-04-01", DayType.HOLIDAY, NEW_YEAR);
        add("2017-05-01", DayType.HOLIDAY, NEW_YEAR);
        add("2017-06-01", DayType.HOLIDAY, NEW_YEAR);
        add("2017-07-01", DayType.HOLIDAY, CHRISTMAS);
        add("2017-08-01", DayType.HOLIDAY, NEW_YEAR);
        add("2017-22-02", DayType.SHORTDAY);
        add("2017-23-02", DayType.HOLIDAY, MENDAY);
        add("2017-24-02", DayType.HOLIDAY);
        add("2017-07-03", DayType.SHORTDAY);
        add("2017-08-03", DayType.HOLIDAY, WOMENDAY);
        add("2017-01-05", DayType.HOLIDAY, MAYDAY);
        add("2017-08-05", DayType.HOLIDAY);
        add("2017-09-05", DayType.HOLIDAY, VICTORYDAY);
        add("2017-12-06", DayType.HOLIDAY, RUSSIADAY);
        add("2017-03-11", DayType.SHORTDAY);
        add("2017-04-11", DayType.HOLIDAY, PEOPLEDAY);
        add("2017-06-11", DayType.HOLIDAY);

        // 2018 Holidays list
        add("2018-01-01", DayType.HOLIDAY, NEW_YEAR);
        add("2018-02-01", DayType.HOLIDAY, NEW_YEAR);
        add("2018-03-01", DayType.HOLIDAY, NEW_YEAR);
        add("2018-04-01", DayType.HOLIDAY, NEW_YEAR);
        add("2018-05-01", DayType.HOLIDAY, NEW_YEAR);
        add("2018-06-01", DayType.HOLIDAY, NEW_YEAR);
        add("2018-07-01", DayType.HOLIDAY, CHRISTMAS);
        add("2018-08-01", DayType.HOLIDAY, NEW_YEAR);
        add("2018-22-02", DayType.SHORTDAY);
        add("2018-23-02", DayType.HOLIDAY, MENDAY);
        add("2018-07-03", DayType.SHORTDAY);
        add("2018-08-03", DayType.HOLIDAY, WOMENDAY);
        add("2018-09-03", DayType.HOLIDAY);
        add("2018-28-04", DayType.SHORTDAY);
        add("2018-30-04", DayType.HOLIDAY);
        add("2018-01-05", DayType.HOLIDAY, MAYDAY);
        add("2018-02-05", DayType.HOLIDAY);
        add("2018-08-05", DayType.SHORTDAY);
        add("2018-09-05", DayType.HOLIDAY, VICTORYDAY);
        add("2018-09-06", DayType.SHORTDAY);
        add("2018-11-06", DayType.HOLIDAY);
        add("2018-12-06", DayType.HOLIDAY, RUSSIADAY);
        add("2018-04-11", DayType.HOLIDAY, PEOPLEDAY);
        add("2018-05-11", DayType.HOLIDAY);
        add("2018-29-12", DayType.SHORTDAY);
        add("2018-31-12", DayType.HOLIDAY);

        // 2018 Holidays list
        add("2019-01-01", DayType.HOLIDAY, NEW_YEAR);
        add("2019-02-01", DayType.HOLIDAY, NEW_YEAR);
        add("2019-03-01", DayType.HOLIDAY, NEW_YEAR);
        add("2019-04-01", DayType.HOLIDAY, NEW_YEAR);
        add("2019-05-01", DayType.HOLIDAY, NEW_YEAR);
        add("2019-06-01", DayType.HOLIDAY, NEW_YEAR);
        add("2019-07-01", DayType.HOLIDAY, CHRISTMAS);
        add("2019-08-01", DayType.HOLIDAY, NEW_YEAR);
        add("2019-22-02", DayType.SHORTDAY);
        add("2019-23-02", DayType.HOLIDAY, MENDAY);
        add("2019-07-03", DayType.SHORTDAY);
        add("2019-08-03", DayType.HOLIDAY, WOMENDAY);
        add("2019-30-04", DayType.SHORTDAY);
        add("2019-01-05", DayType.HOLIDAY, MAYDAY);
        add("2019-02-05", DayType.HOLIDAY);
        add("2019-03-05", DayType.HOLIDAY);
        add("2019-08-05", DayType.SHORTDAY);
        add("2019-09-05", DayType.HOLIDAY, VICTORYDAY);
        add("2019-10-05", DayType.HOLIDAY);
        add("2019-11-06", DayType.SHORTDAY);
        add("2019-12-06", DayType.HOLIDAY, RUSSIADAY);
        add("2019-04-11", DayType.HOLIDAY, PEOPLEDAY);
        add("2019-31-12", DayType.SHORTDAY);
    }
}
