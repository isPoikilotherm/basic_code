package DemoDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Brithday {
    public static void main(String[] args) throws ParseException {
        System.out.println("请输入出生日期，格式为：年.月.日");
        Scanner scanner=new Scanner(System.in);
        String brithday=scanner.next();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy.MM.dd");
        Date brithdaydate = simpleDateFormat.parse(brithday);
        Date today=new Date();
//        System.out.println(brithdaydate);
//        System.out.println(today);
        long ms=today.getTime()-brithdaydate.getTime();
        System.out.println(ms);
        long day=ms/86400000;
        System.out.println(day);

    }
}
