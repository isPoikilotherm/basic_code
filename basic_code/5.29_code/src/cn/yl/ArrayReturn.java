package cn.yl;

public class ArrayReturn {
    public static void main(String[] args) {

        int a=1,b=2,c=3;
        int[] result=calculate(a,b,c);
        System.out.println("总和是："+result[0]);
        System.out.println("平均数是："+result[1]);
    }

    /*
    * 数组作为返回值返回的也是地址*/
    public static  int[] calculate(int a,int b,int c){
        int sum=a+b+c;
        int avg=sum/3;
        int[] array=new int[2];
        array[0]=sum;
        array[1]=avg;
        return array;

    }
}
