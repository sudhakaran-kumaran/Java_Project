package H_Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class H_Date {
    public static void main(String[] args) {
        Date date=new Date();
        SimpleDateFormat s1=new SimpleDateFormat("E dd/MM/yyyy");
        System.out.println(s1.format(date));
    }
}
