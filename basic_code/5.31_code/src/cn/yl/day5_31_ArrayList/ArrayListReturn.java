package cn.yl.day5_31_ArrayList;

import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Random;

public class ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r=new Random();
        for (int i = 0; i < 20; i++) {
            int num=r.nextInt(100);
            list.add(num);
        }
        System.out.println(list);
        System.out.println(print(list));
    }

    public static ArrayList print(ArrayList<Integer> li){
        ArrayList<Integer> list_1= new ArrayList<>();
        for (int i = 0; i < li.size(); i++) {
            int a =li.get(i);
            if (a%2==0){
                list_1.add(a);
            }
        }

        return list_1;

    }
}
