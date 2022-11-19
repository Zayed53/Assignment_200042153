package Assignment_1;

public class Month {
    public boolean is31month(int month){
        int[] months={1,3,5, 7, 8,10, 12};
        for(int i=0;i<months.length;i++){
            if(months[i]==month){
                return true;
            }
        }return false;
    }
    public boolean isendofmonth31days(int day){
        if(day==31){
            return true;
        }else{
            return false;
        }
    }
    public boolean isendofmonth30days(int day){
        if(day==30){
            return true;
        }else{
            return false;
        }
    }
    public boolean isendoffeb(boolean leapyear,int day){
        if(leapyear&&day==29){
            return true;
        } else if (!leapyear&&day==28) {
            return true;
        } else{
            return false;
        }
    }
    public boolean endofmonth(int day, int month, boolean leapyear){
        if(is31month(month)&&isendofmonth31days(day)){
            return true;
        } else if (isendofmonth30days(day)) {
            return true;
        } else if (month==2&&isendoffeb(leapyear,day)) {
            return true;
        }else{
            return false;
        }
    }
}
