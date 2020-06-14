package Lambda.test03_Para_Return;

public class test03 {
    public static void main(String[] args) {

        invokecalc(3, 4, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a+b;
            }
        });


        //Lambda表达式
        invokecalc(3,4,(int a,int b)->{
            return a+b;
        });


        //Lambda表达式省略
        invokecalc(3,4,(a,b)->a+b);


    }

    private static void invokecalc(int a,int b,Calculator calculator){

        int result=calculator.calc(a, b);
        System.out.println("结果是"+result);
    }
}
