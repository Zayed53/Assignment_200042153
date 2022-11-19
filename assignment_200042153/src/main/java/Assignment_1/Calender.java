package Assignment_1;

public class Calender {
    public int day;
    public int month;
    public int year;

    public Calender(int day, int month, int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }
    Year checkyear=new Year();
    Month checkmonth=new Month();
    public void nextday(int day, int month, int year){
        if(checkyear.isendofyear(day, month)){
            this.day=1;
            this.month=01;
            this.year++;
        } else if (checkmonth.endofmonth(day, month, checkyear.isleapyear(year))) {
            this.day=01;
            this.month++;
        }else{
            this.day++;
        }
    }
}
