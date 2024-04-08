package miu.mpp.lab4_payroll;

import java.time.LocalDate;
import java.time.YearMonth;

public class DateRange {
    private LocalDate startDate;
    private LocalDate endDate;

    public DateRange(LocalDate startDate, LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    private boolean isInRange(LocalDate date) {
        return false;
    }

    @Override
    public String toString() {
        return startDate + "-" + endDate;
    }

    public static int getFirstDayOfMonth() {
        return 1;
    }
    public static int getLastDayOfMonth(int month, int year) {
        YearMonth yearMonth = YearMonth.of(year, month);
        return yearMonth.lengthOfMonth();
    }
}
