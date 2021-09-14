package 面向对象.Object类;

public class ObjectDemo {
    public static void main(String[] args) {
        /*toString方法*/
        Student s = new Student(12,"xm");
        System.out.println(s);
        System.out.println(s.toString());

        /*equals方法*/
        Student s1 = new Student(10,"xh");
        Student s2 = new Student(16,"xx");
        Student s3 = new Student(10,"xh");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.toString().equals(s3.toString()));
        /*
        equals比较的是地址值,重写equlas可比较内容
         */
    }
}
