package Lambda.test01;

public class test {
    public static void main(String[] args) {


        invokeCook(new Cook() {
            @Override
            public void makefood() {
                System.out.println("匿名内部类");
            }
        });



        invokeCook(()->{
                System.out.println("Lambda表达式");

        });

    }

    public static void invokeCook(Cook cook) {
        cook.makefood();

    }
}
