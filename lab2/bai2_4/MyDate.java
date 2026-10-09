package bai2_4;

public class MyDate {
    
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setDay(int day) {
        if (day < 1 || day > 31) {
            System.out.println("ngay khong hop le");
        } else this.day = day;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            System.out.println("thang khong hop le");
        } else this.month = month;
    }

    public void setYear(int year) {
        if (year < 0) {
            System.out.println("nam khong hop le");
        } else this.year = year;
    }

    public void getDate() {
        System.out.println("ngay sinh: " + day + "/" + month + "/" + year);
    }
    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }


}
