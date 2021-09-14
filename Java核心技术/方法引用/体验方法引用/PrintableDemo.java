package 方法引用.体验方法引用;

public class PrintableDemo {
    public static void main(String[] args) {
        usePrintable((s)->{
            System.out.println(s);
        });
        //方法引用符：::
        usePrintable(System.out::println);

    }
    private static void usePrintable(Printable printable) {
        printable.printString("sbJava");
    }
}
