package cn.yl;

public class ArrayReverse {
    public static void main(String[] args) {

        int[] array={1,2,3,4,5,6,7,8,9};
        int min=0;
        int max=array.length-1;
        int temp;
        while (min<max){
            temp=array[min];
            array[min]=array[max];
            array[max]=temp;
            max--;
            min++;
        }
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }

    }
}
