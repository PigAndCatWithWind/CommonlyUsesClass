package 时间类;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCanlendar {
    public static void main(String[] args) {
        //build calendar class use date
        Calendar calendar1 = new GregorianCalendar(2020,1,3,10,10,10);
        int year = calendar1.get(Calendar.YEAR);
        System.out.println(year);
        //build calendar class use now time
        Calendar calendar2 = new GregorianCalendar();
        //change date
        calendar2.set(Calendar.YEAR,1111);
        System.out.println(calendar2);

        //calculate date
        Calendar calendar3 = new GregorianCalendar();
        calendar3.add(Calendar.YEAR,-1);
        System.out.println(calendar3);

        //calendar class to be date class
        Date date = calendar3.getTime();

        //data class to be calendar class
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(new Date());

    }
}
