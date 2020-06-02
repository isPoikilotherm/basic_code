package cn.laptop;

public class LapTop {

    public void openPC(){
        System.out.println("笔记本打开了");
    }

    public void closePC(){
        System.out.println("笔记本关闭了");
    }

    public void useusb(USb uSb){
        if (uSb instanceof Mouse){
            Mouse mouse=(Mouse) uSb;
            mouse.open();
            mouse.click();
            mouse.close();
        }
        if (uSb instanceof KeyBoard){
            KeyBoard keyBoard = (KeyBoard) uSb;
            keyBoard.open();
            keyBoard.onclick();
            keyBoard.close();
        }

    }
}
