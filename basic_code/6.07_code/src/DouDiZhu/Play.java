package DouDiZhu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Play {
    public static void main(String[] args) {

        /*
        * 1、准备牌*/
        ArrayList<String> color=new ArrayList<>();
        ArrayList<String> number=new ArrayList<>();
        ArrayList<String> poker=new ArrayList<>();
        ArrayList<String> one=new ArrayList<>();
        ArrayList<String> two=new ArrayList<>();
        ArrayList<String> three=new ArrayList<>();
        ArrayList<String> end=new ArrayList<>();


        color.add("♠");
        color.add("♥");
        color.add("♣");
        color.add("♦");


        number.add("A");
        number.add("2");
        number.add("3");
        number.add("4");
        number.add("5");
        number.add("6");
        number.add("7");
        number.add("8");
        number.add("9");
        number.add("10");
        number.add("J");
        number.add("Q");
        number.add("K");

        for (int i = 0; i < color.size(); i++) {
            for (int i1 = 0; i1 < number.size(); i1++) {
                poker.add(color.get(i)+number.get(i1));
            }

        }
        poker.add("大王");
        poker.add("小王");

      //  System.out.println(poker.size());
       // System.out.println(poker.get(53));
    //    System.out.println(poker);






        /*
        * 2、洗牌*/
        Collections.shuffle(poker);
     //   System.out.println(poker);




        /*
        * 3.发牌*/

        for (int i = 0; i < poker.size(); i++) {
           // System.out.println(i);
            if (i>=51){
                end.add(poker.get(i));
            }else {
                if (i%3==0){
                    one.add(poker.get(i));
                }else if(i%3==1){
                    two.add(poker.get(i));
                }else {
                    three.add(poker.get(i));
                }
            }

        }


        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(end);













    }
}
