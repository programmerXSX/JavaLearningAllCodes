package 方法引用.Lambda表达式支持的方法引用.引用类方法;

public class ConverterDemo {
    public static void main(String[] args) {
        //Lambda表达式
        useConverter(s -> s.length());
        //引用
        useConverter(Integer::parseInt);
        //Lambda表达式被引用类方法替代的时候，它的形式参数全部传递给静态方法做参数
    }
    public static void useConverter(Converter c){
        int i = c.converter("651565");
        System.out.println(i);
    }
}
