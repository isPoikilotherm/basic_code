package cn.yk;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        findChar(str);
    }

    private static void findChar(String string) {
        Map<Character,Integer> map=new HashMap<>();
        char[] charArray = string.toCharArray();
      //  System.out.println(charArray);
        for (int i = 0; i < charArray.length; i++) {
            if (map.containsKey(charArray[i])){
                Integer num=map.get(charArray[i]);
                /*Integer integer = */map.put(charArray[i], num+1);
                //System.out.println(integer);
            }else{
                map.put(charArray[i],1);
            }
        }
        System.out.println(map);
    }
}
