package 方法引用.Lambda表达式支持的方法引用.引用对象的实例方法;

public class PrintDemo {
    public static void main(String[] args) {
        //Lambda表达式
        usePrinter(s -> System.out.println(s.toUpperCase()));
        //PrintString类中已经有了我们需要的方案，因此可以直接引用
        //先创建对象
        PrintString printString = new PrintString();
        usePrinter(printString::printUpper);
        //Lambda表达式被对象的实例化方法替代的时候，它的形式参数全部传递给该方法作为参数
    }

    public static void usePrinter(Printer printer) {
        printer.printUpperCase("Hello World!");
    }
}
