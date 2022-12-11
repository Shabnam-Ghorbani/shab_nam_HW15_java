package ir.maktab.view;

import java.util.Date;

public class DateRangeValidator {
    final Date startDate;
    final Date endDate;


    public DateRangeValidator(Date startDate, Date endDate) {
        this.startDate=startDate;
        this.endDate=endDate;
    }

    public boolean isWithinRange(Date testDate) {
      /*    boolean result = false;
        if ((testDate.equals(startDate) || testDate.equals(endDate)) ||
                (testDate.after(startDate) && testDate.before(endDate))) {
            result = true;
        }
        return result;*/
        return testDate.getTime() >= startDate.getTime() &&
                testDate.getTime() <= endDate.getTime();
    }
}
