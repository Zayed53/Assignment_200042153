import Assignment_1.Calender;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Calender_test {
    @Test
    public void daytest(){
        Calender calender=new Calender(2, 01, 22);
        calender.nextday(calender.day, calender.month, calender.year);
        assertEquals(3, calender.day);
        assertEquals(1, calender.month);
        assertEquals(22, calender.year);
    }
    @Test
    public void monthtest(){
        Calender calender=new Calender(31, 01, 22);
        calender.nextday(calender.day, calender.month, calender.year);
        assertEquals(1, calender.day);
        assertEquals(2, calender.month);
        assertEquals(22, calender.year);
    }
    @Test
    public void yeartest(){
        Calender calender=new Calender(31, 12, 22);
        calender.nextday(calender.day, calender.month, calender.year);
        assertEquals(1, calender.day);
        assertEquals(1, calender.month);
        assertEquals(23, calender.year);
    }
    @Test
    public void leapyeartest(){
        Calender calender=new Calender(28, 2, 20);
        calender.nextday(calender.day, calender.month, calender.year);
        assertEquals(29, calender.day);
        assertEquals(2, calender.month);
        assertEquals(20, calender.year);
    }
}


