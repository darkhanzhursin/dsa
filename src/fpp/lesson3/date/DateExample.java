package fpp.lesson3.date;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateExample {

    static Date currentDate = new Date();
    static GregorianCalendar calendar = new GregorianCalendar();

    public static void main(String[] args) {
        System.out.println(currentDate);
        System.out.println(currentDate.getTime());

        Date curDate2 = new Date(1709223137714L);
        System.out.println(curDate2);

        System.out.println(calendar.getTime());

        GregorianCalendar calendar2 = new GregorianCalendar(2020, 2, 18);
        System.out.println(calendar2.getTime());

        GregorianCalendar calendar3 = new GregorianCalendar();
        System.out.println(calendar3.getTimeZone().getDisplayName());
        System.out.println(calendar3.isLeapYear(2024));

        System.out.println(LocalDate.now());

        System.out.println(LocalDate.now().getChronology().dateNow(ZoneId.of("UTC")));
    }
}
