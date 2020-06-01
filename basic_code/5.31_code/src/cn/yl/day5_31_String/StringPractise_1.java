package cn.yl.day5_31_String;

public class StringPractise_1 {
    public static void main(String[] args) {
        int[] array={1,2,3};
        System.out.println(method(array));

    }
    public static String method(int[] array){
        String str="[";
        for (int i = 0; i < array.length; i++) {
            if (i==array.length-1){
                str+="word"+array[i]+"]";
            }else {
                str+="word"+array[i]+"#";
            }
        }
        return str;
    }
}
