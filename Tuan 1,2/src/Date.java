public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean EarlierDate(Date that) {
        if (this.year > that.year) return true;
        if (this.year < that.year) return false;

        if (this.month > that.month) return true;
        if (this.month < that.month) return false;

        if (this.day > that.day) return true;
        return false;
    }
}