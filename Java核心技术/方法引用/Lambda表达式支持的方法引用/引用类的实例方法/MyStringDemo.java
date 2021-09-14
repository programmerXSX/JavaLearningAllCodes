package 方法引用.Lambda表达式支持的方法引用.引用类的实例方法;

public class MyStringDemo {
    public static void main(String[] args) {
        //Lambda表达式
//        useMySubString((String s,int x,int y)->{
//            return s.substring(x,y);
//        });
        useMySubString((s,x,y)->s.substring(x,y));
        //引用类的实例方法
        useMySubString(String::substring);
        //Lambda表达式被类的实例方法调用的时候
        //第一个参数作为调用者
        //后面的参数全部传递给该方法作为参数
    }
    public static void useMySubString(MyString myString){
        System.out.println(myString.mySubString("bsdufbfusdbfsekdfdno",5,9));

    }
}
