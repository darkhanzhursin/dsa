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

    public boolean isInRange(LocalDate date) {
        return !startDate.isAfter(date) && !endDate.isBefore(date);
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
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
