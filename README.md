# Производственный календарь (Java)

_Текущая актуальная версия: 0.1_

Небольшая библиотека для работы с производственным календарем. Имеется возможность создавать собственные производственные календари и работать с ними.

## Установка 

### Maven

Добавить репозиторий в .pom
```xml
<repositories>
    <repository>
        <id>mvn-repo</id>
        <url>https://github.com/simokhov/maven</url>
    </repository>
</repositories>
```
Добавить зависимость
```xml
<dependency>
     <groupId>pro.sstd.utils</groupId>
     <artifactId>calendar</artifactId>
     <version>0.1</version>
 </dependency>
``` 

## Использование

### Инициализация

Пустой производственный календарь

`SstdCalendar calendar = new SstdCalendar();`

Производственный календарь РФ

`SstdCalendar calendar = new SstdCalendar(new RU_Days());`

### Методы

`boolean isWeekEnd(LocalDate date)` - Возвращает `true`, если `date` выпадает на выходные (Суббота или Воскресенье)

`boolean isWorkWeek(LocalDate date)` - Возвращает `true`, если `date` **НЕ** выпадает на выходные (Рабочая неделя)

`boolean isShortDay(LocalDate date)` - Возвращает `true`, если `date` отмечен в производственном календаре как Сокращенный рабочий день `DayType.SHORTDAY`

`boolean isWorkDay(LocalDate date)` - Возвращает `true`, если `date` отмечен в производственном календаре как Рабочий день `DayType.WORKDAY` или `date` на рабочей неделе и НЕ отмечен как выходной `DayType.HOLIDAY`

`boolean isHoliday(LocalDate date)` -  Возвращает `true`, если `date` отмечен в производственном календаре как Выходной день `DayType.HOLIDAY` или `date` выходной день (Суббота или Воскресенье) и **НЕ** отмечен как Рабочий день `DayType.WORKDAY` или Сокращенный рабочий день `DayType.SHORTDAY`

`LocalDate getDateAfterInterval(LocalDate date, int dayInterval)` - Возвращает дату через `dayInterval` календарных дней от `date`

`LocalDate getWorkDateAfterInterval(LocalDate date, int dayInterval)` - Возвращает ближайший рабочей день через `dayInterval` календарных дней от `date`

`LocalDate getDateAfterWorkDaysInterval(LocalDate date, int workDayInterval)` - Возвращает ближайший рабочий день через `dayInterval` **РАБОЧИХ** дней от `date`

`DateInfo getDateInfo(LocalDate date)` - Возвращает информацию об указанной дате (дата, тип, наименование праздника)

### Структура DateInfo

`LocalDate getDate()` - дата

`DayType getType()` - тип `DayType.HOLIDAY`, `DayType.WORKDAY` или `DayType.SHORTDAY`

`String getTitle()` - наименование праздника (если есть) 

## Добавление календарей

Создать новый класс календаря унаследованный от пустого `DefaultDays`
```java
public class My_Days extends DefaultDays {
    
     // Инициализируем собственный список праздников
     @Override
        public void init() {
           add("2019-01-01", DayType.HOLIDAY, "New Year!");
           add("2019-01-02", DayType.SHORTDAY);
           add("2019-01-06", DayType.WORKDAY, "Yeaaaah! Working Sunday!");
        }
}
```

Используем новый календарь 

`SstdCalendar myCalendar = new SstdCalendar(new My_Days());`

