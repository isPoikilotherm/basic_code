package Lambda.test01_noPara_noReturn;

public class test {
    public static void main(String[] args) {


        invokeCook(new Cook() {
            @Override
            public void makefood() {
                System.out.println("匿名内部类");
            }
        });



        //Lambda表达式
        invokeCook(()->{
                System.out.println("Lambda表达式");

        });


        //Lambda表达式省略
        invokeCook(()->System.out.println("Lambda表达式省略"));

    }

    public static void invokeCook(Cook cook) {
        cook.makefood();

    }
}
