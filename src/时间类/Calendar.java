package 时间类;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) throws ParseException {
        String string = "";
        System.out.println("please enter the date (for example:2020-01-10) : ");
        string = new Scanner(System.in).nextLine();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = dateFormat.parse(string);
        java.util.Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);

        int day = calendar.get(java.util.Calendar.DAY_OF_MONTH);
        int days = calendar.getActualMaximum(java.util.Calendar.DATE);
        System.out.println("日\t一\t二\t三\t四\t五\t六");
        calendar.set(java.util.Calendar.DAY_OF_MONTH,1);

        for (int i = 0; i <calendar.get(java.util.Calendar.DAY_OF_WEEK)-1 ; i++) {
            System.out.print("\t");
        }

        for (int i = 0; i <days ; i++) {
            if(day == calendar.get(java.util.Calendar.DAY_OF_MONTH)){
                System.out.print(calendar.get(java.util.Calendar.DAY_OF_MONTH)+"*\t");
            }else {
                System.out.print(calendar.get(java.util.Calendar.DAY_OF_MONTH)+"\t");
            }

            if(calendar.get(java.util.Calendar.DAY_OF_WEEK)== java.util.Calendar.SATURDAY){
                System.out.println();
            }

            calendar.add(java.util.Calendar.DAY_OF_MONTH,1);
        }
    }
}
