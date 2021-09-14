package 方法引用.Lambda表达式支持的方法引用.引用构造器;

public class StudentDemo {
    public static void main(String[] args) {
        //Lambda表达式
//        无参构造
//        useStudentBuilder((s,a)->{
//            Student student = new Student();
//            student.setName(s);
//            student.setAge(a);
//            return student;
//        });
//        带参构造
//        useStudentBuilder((s,a)->{
//            Student student = new Student(s,a);
//            return student;
//        });
        //省略模式
        useStudentBuilder((s,a)->new Student(s,a));

        //引用构造器——带参构造方法
        useStudentBuilder(Student::new);
        //Lambda表达式被构造器代替的时候，它的形式参数全部传递给构造器作为函数
    }
    public static void useStudentBuilder(StudentBuilder studentBuilder){
        Student student = studentBuilder.build("xsx", 18);
        System.out.println("姓名："+student.getName()+", 年龄："+ student.getAge());
    }
}
