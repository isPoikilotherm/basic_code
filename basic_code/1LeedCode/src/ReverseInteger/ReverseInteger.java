package ReverseInteger;

public class ReverseInteger {
    public static void main(String[] args) {

        int result=reverse(123);
        System.out.println(result);
    }

    public static int reverse(int x) {
        boolean b=false;
        if (x<0){
            x=0-x;
            b=true;
        }
        String string=String.valueOf(x);
        char[] chars = string.toCharArray();
        string="";
        for (int i = chars.length - 1; i >= 0; i--) {
            string=string+chars[i];
        }
        try {
            int num = Integer.parseInt(string, 10);
            if (b){
                num=0-num;
            }
            return num;
        }catch (Exception e){
            return 0;
        }


    }

}
