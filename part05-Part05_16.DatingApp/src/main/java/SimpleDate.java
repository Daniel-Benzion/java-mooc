
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public void advance() {
        boolean day30 = day == 30;
        boolean month12 = month == 12;
        
        if (day30 && month12) {
            day = 1;
            month = 1;
            year++;
        } else if (day30) {
            day = 1;
            month++;
        } else {
            day++;
        }
    }
    
    public void advance(int howManyDays) {
        day += howManyDays;
        if (day > 30) {
            month += 1;
            day -= 30;
            if (month > 12) {
                month -= 12;
                year++;
            }
        }
    }
    
    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newDate = new SimpleDate(day, month, year);

        if (!this.equals(newDate)) {
            if (days >= 0) {
                newDate.day += days;
                if (newDate.day > 30) {
                    newDate.day = newDate.day - 30;
                    newDate.month += 1;
                    if (newDate.month > 12) {
                        newDate.month = 1;
                        newDate.year += 1;
                    }
                }
            }
            return newDate;
        }
        return new SimpleDate(this.day, this.month, this.year);
    }

}
