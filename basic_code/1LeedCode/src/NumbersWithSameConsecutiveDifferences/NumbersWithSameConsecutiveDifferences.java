package NumbersWithSameConsecutiveDifferences;

import java.util.ArrayList;

public class NumbersWithSameConsecutiveDifferences {
    public static void main(String[] args) {


        int[] ints=numsSameConsecDiff(2,1);
        for (int anInt : ints) {
            System.out.println(anInt);
        }

    }

    public static int[] numsSameConsecDiff(int N, int K) {
        ArrayList<Integer> list=new ArrayList<>();
        int i=0;
        if (N==1){
           int[] ints={0,1,2,3,4,5,6,7,8,9};
           return ints;
        }
        for (int j=1;j<=9;j++){
            get(list,N,K,j);
        }
        int[] ints1=new int[list.size()];
        for (Integer integer : list) {
            ints1[i]=integer;
            i+=1;
        }
        return ints1;

    }
    public static void get(ArrayList<Integer> list,int n,int k,int s){
        if (String.valueOf(s).length()==n){
            list.add(s);
            return;
        }
        int num;
        for (int i=0;i<=9;i++){
            if ((s%10)-i==k||i-(s%10)==k){
                num=s*10+i;
                get(list,n,k,num);
            }
        }
        return;
    }
}
