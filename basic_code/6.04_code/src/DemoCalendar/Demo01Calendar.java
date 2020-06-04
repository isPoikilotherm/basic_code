package DemoCalendar;

import java.time.Year;
import java.util.Calendar;
abstract class A{
    public A(){}
    public int dis(){
        System.out.println("1");
        return 0;
    }
}

public class Demo01Calendar extends A {
    public int dis(){
        System.out.println("2");
        return 0;
    }
    public static final int a=0;
    public static void main(String[] args) {
//        method1(); ```````````````````````````````````````````
        A a=new Demo01Calendar();
         a.dis();
    }

    private static void method1() {
        Calendar calendar = Calendar.getInstance();
        int year=calendar.get(Calendar.YEAR);
        System.out.println(year);
        System.out.println(calendar.YEAR);



        calendar.set(Calendar.YEAR,1999);
        int year1=calendar.get(Calendar.YEAR);
        System.out.println(year1);
        System.out.println(calendar.YEAR);
    }
}
