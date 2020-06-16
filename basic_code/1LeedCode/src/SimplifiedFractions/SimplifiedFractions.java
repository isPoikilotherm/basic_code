package SimplifiedFractions;

import java.util.*;

public class SimplifiedFractions {
    public static void main(String[] args) {

        List<String> list=new ArrayList<>();
        list=simplifiedFractions(100);
        for (String s : list) {
            System.out.println(s);
        }
    }

    public static List<String> simplifiedFractions(int n) {
        List<String> list = new ArrayList<>();
        for (int i=2;i<=n;i++){
            for (int j=1;j<i;j++){
                if (huzhi(i,j)){
                   String str=j+"/"+i;
                   list.add(str);
                }
            }
        }
        return list;
    }

    public static  Boolean huzhi(int a,int b){
        int tag=b;
        for (;tag>1;tag--){
            if (a%tag==0&&b%tag==0){
                return false;
            }
        }
       return true;
    }
}
