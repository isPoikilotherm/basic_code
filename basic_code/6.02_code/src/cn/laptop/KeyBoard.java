package cn.laptop;

public class KeyBoard implements USb {
    @Override
    public void open() {
        System.out.println("打开键盘");
    }

    @Override
    public void close() {
        System.out.println("关闭键盘");
    }

    public void onclick(){
        System.out.println("敲击");


    }
}
