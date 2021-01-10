package 时间类;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormat {
    public static void main(String[] args) throws ParseException {

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String string1  = dateFormat.format(new Date());
        System.out.println(string1);

        dateFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
        Date date = dateFormat.parse("2020/01/10 11:58:59");
        System.out.println(date);

    }
}
