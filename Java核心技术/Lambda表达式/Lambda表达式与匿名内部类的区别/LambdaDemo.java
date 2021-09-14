package Lambda表达式.Lambda表达式与匿名内部类的区别;

public class LambdaDemo {
    public static void main(String[] args) {
        //匿名内部类
        useStudent(new Student(){
            @Override
            public void study() {
                System.out.println("匿名内部类重写具体类");
            }
        });
        useAnimal(new Animal() {
            @Override
            public void method() {
                System.out.println("匿名内部类重写抽象类");
            }
        });
        useInter(new Inter() {
            @Override
            public void show() {
                System.out.println("匿名内部类重写接口");
            }
        });

        //Lambda表达式，只能用于接口
        useInter(()-> System.out.println("Lambda表达式重写接口"));
//        useStudent(()-> System.out.println("Lambda表达式重写具体类"));
//        useAnimal(()-> System.out.println("Lambda表达式重写抽象类"));
    }
    public static void useStudent(Student student){
        student.study();
    }
    public static void useInter(Inter inter){
        inter.show();
    }
    public static void useAnimal(Animal animal){
        animal.method();
    }
}
