package cn.yl.day5_31_ArrayList;

import java.util.ArrayList;

public class ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(12);
        list.add(13);
        list.add(15);
        list.add(16);
        System.out.println(list);
        print(list);
    }

    public static void print(ArrayList li){
        System.out.print("{");
        for (int i = 0; i < li.size(); i++) {
            if (i==li.size()-1){
                System.out.print(li.get(i));
            }else {
                System.out.print(li.get(i)+"@");
            }


        }
        System.out.println("}");
    }
}
