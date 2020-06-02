package cn.laptop;

public class UseLoptop {
    public static void main(String[] args) {
        LapTop pc=new LapTop();
        Mouse mouse=new Mouse();
        KeyBoard keyBoard=new KeyBoard();

        pc.openPC();
        pc.useusb(mouse);
        pc.useusb(keyBoard);
        pc.closePC();
    }
}
