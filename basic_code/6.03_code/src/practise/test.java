package practise;

import java.util.Objects;

public class test {
    public static void main(String[] args) {
        String s1=null;
        String s2=null;
        System.out.println(s1);
        System.out.println(s2);
        boolean b = Objects.equals(s1,s2);
        System.out.println(b);
    }
}
