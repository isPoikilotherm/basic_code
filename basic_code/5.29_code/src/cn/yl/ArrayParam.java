package cn.yl;

public class ArrayParam {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9};
        int[] array1={11,12,13,14,15,16,17,18,19};
        int[] array2={21,22,23,24,25,26,27,28,29};
        print(array);
        print(array1);
        print(array2);

    }


    /*
    * 数组作为方法的参数，传递的是数组的地址
    */

    public static void print(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
