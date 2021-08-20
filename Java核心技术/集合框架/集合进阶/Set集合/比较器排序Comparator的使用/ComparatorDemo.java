package 集合框架.集合进阶.Set集合.比较器排序Comparator的使用;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemo {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num1 = o1.getAge() - o2.getAge();
                int num2 = num1==0?o1.getName().compareTo(o2.getName()):num1;
                return num2;
            }
        });
        Student s1 = new Student("xsxx",54);
        Student s2 = new Student("jknk",251);
        Student s3 = new Student("kbbs",54);
        Student s4 = new Student("xsxx",54);
        ts.add(s4);
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        for (Student s:ts){
            System.out.println(s);
        }
    }
}
