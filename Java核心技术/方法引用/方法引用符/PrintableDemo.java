package 方法引用.方法引用符;

public class PrintableDemo {
    public static void main(String[] args) {
        //Lambda表达式
        usePrintInt(i -> System.out.println(i));
        //方法引用
        usePrintInt(System.out::println);

    }
    public static void usePrintInt(Printable printable){
        printable.PrintInt(90);
    }
}
