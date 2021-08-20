package 流程控制语句.循环语句;

public class while语句 {
    public static void main(String[] args) {
        int i = 0;
        while(i <= 10){
            if((i%2) == 0){
                i++;
                continue;
            }
            System.out.println("i  = " + i);
            i++;
        }
    }
}
