package 案例实践.案例实践_HashSet集合储存学生对象;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<>();
        Student[] students  = new Student[4];
        students[0] = new Student(1,"sc");
        students[1] = new Student(12,"jbd");
        students[2] = new Student(6545,"gajb");
        students[3] = new Student(1,"sc");
        for (Student i:students) {
            hs.add(i);
        }
        for(Student i:hs){
            System.out.println(i.getAge() +" " + i.getName());
        }
        Student s1 = new Student(12,"xs");
        Student s2 = new Student(12,"xs");
        hs.add(s1);
        hs.add(s2);
        System.out.println(hs);

    }
}
