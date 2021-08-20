package 案例实践.案例实践_字符串中的数据排序及split用法;

public class Demo {
    public static void main(String[] args) {

        /*
        1、如果用“.”作为分隔的话,必须是如下写法,String.split("\\."),
这样才能正确的分隔开,不能用String.split(".");
        2、如果用“|”作为分隔的话,必须是如下写法,String.split("\\|"),
这样才能正确的分隔开,不能用String.split("|");“.”和“|”都是转义字符,必须得加"\\";
        3、如果在一个字符串中有多个分隔符,可以用“|”作为连字符,比如,
“acount=? and uu =? or n=?”,把三个都分隔出来,可以用String.split("and|or");
         */
        String te = "acount=? and uu =? or n=?";
        String[] s = te.split("and|or");
        for(int i = 0;i<te.length();i++){
            System.out.println(s[i]);
        }

        String str = "23 89 90 78 58 85";
        String[] temp = str.split(" ");
        int[] a = new int[temp.length];
        for (int i = 0; i < temp.length; i++) {
            a[i] = Integer.valueOf(temp[i]);//将String转换为Integer类型
        }
        for (int i = 0; i < temp.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\n");
        for (int i = 0; i < temp.length -1; i++) {
            for (int j = 0; j < temp.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }

        for (int i = 0; i < temp.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
