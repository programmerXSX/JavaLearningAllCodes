package 集合框架.集合进阶.Set集合.自然排序Comparable的使用;

import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>();
        Student s1 = new Student("xishi",20);
        Student s2 = new Student("jjy",24);
        Student s3 = new Student("daq",22);
        Student s4 = new Student("yujji",18);
        Student s5 = new Student("jin",18);
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        for (Student s:ts){
            System.out.println(s);
        }
    }
}
