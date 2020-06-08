package cn.yk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class DouDIZhuSort {
    public static void main(String[] args) {

        // 准备牌
        // 创建一个Map集合存储牌的索引和组装好的牌
        HashMap<Integer,String> poker =new HashMap<>();

        // 创建一个List集合，存储牌的索引
        ArrayList<Integer> pokerIndex=new ArrayList<>();

        // 定义两个集合，存储花色和序号
        List<String> color=List.of("♠","♥","♣","♦");
        List<String> number=List.of("2","A","3","4","5","6","7","8","9","10","J","Q","K");

        int index=0;
        poker.put(index,"大王");
        pokerIndex.add(index);
        index++;
        poker.put(index,"小王");
        pokerIndex.add(index);
        index++;

        for (String s : number) {
            for (String s1 : color) {
                poker.put(index,s1+s);
                pokerIndex.add(index);
                index++;
            }
            
        }


        Collections.shuffle(pokerIndex);


        ArrayList<Integer> one=new ArrayList<>();
        ArrayList<Integer> two=new ArrayList<>();
        ArrayList<Integer> three=new ArrayList<>();
        ArrayList<Integer> end=new ArrayList<>();

        for (int i = 0; i < pokerIndex.size(); i++) {
            Integer integer =pokerIndex.get(i);
            if (i>=51){
                end.add(integer);
            }else {
                if (i%3==0){
                    one.add(integer);
                }else if(i%3==1){
                    two.add(integer);
                }else {
                    three.add(integer);
                }
            }

        }


        Collections.sort(one);
        Collections.sort(three);
        Collections.sort(two);
        Collections.sort(end);



        look("刘德华",poker,one);
        look("周星驰",poker,two);
        look("周润发",poker,three);
        look("底牌",poker,end);







    }

    private static void look(String name,HashMap<Integer,String> hashMap,ArrayList<Integer> arrayList) {
        System.out.print(name+"：");
        for (Integer integer : arrayList) {
            String value=hashMap.get(integer);
            System.out.print(value+"");
        }
        System.out.println();
    }
}
