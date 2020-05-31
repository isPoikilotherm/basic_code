package cn.yl.day5_31_ArrayList;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListRandom {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList =new ArrayList<>();
        Random random=new Random();

        for (int i = 0; i <6 ; i++) {
            int a=random.nextInt(33)+1;
            arrayList.add(a);
        }

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));

        }
    }
}
