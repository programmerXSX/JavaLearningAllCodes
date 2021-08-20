package 流程控制语句.if_switch语句;

public class switch语句 {
    public static void main(String[] args) {
        int a = 10, b = 20, c = a+b;
        switch (c) {
            case 10:
                System.out.println("a = " + a);
                break;
            case 20:
                System.out.println("b  = " + b);
                break;
            case 30:
                System.out.println("c = " + c);
                break;
            default:break;
        }
    }
}
