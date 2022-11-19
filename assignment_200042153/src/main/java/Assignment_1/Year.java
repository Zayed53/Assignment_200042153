package Assignment_1;

public class Year {
    public boolean isleapyear(int year){
        if( (year % 4 == 0 && year % 100 != 0)){ //(year % 400 == 0) ||
            return true;
        }else{
            return false;
        }

    }
    public boolean isendofyear(int day, int month){
        if(day==31 && month==12){
            return true;
        }else{
            return false;
        }

    }
}
