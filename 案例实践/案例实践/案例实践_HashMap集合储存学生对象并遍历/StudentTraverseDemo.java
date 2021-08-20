package 案例实践.案例实践_HashMap集合储存学生对象并遍历;

import java.util.*;

public class StudentTraverseDemo {
    public static void main(String[] args) {
        Map<String,Integer> studentsMap = new HashMap<>();
        Student[] students = new Student[3];
        students[0]  = new Student("xsx",12);
        students[1] = new Student("jzt",14);
        students[2] = new Student("xzt",-13);
        for (int i = 0;i<3;i++){
            studentsMap.put(students[i].getName(),students[i].getScore());
        }
        traverseStudentMap traverse = new traverseStudentMap();
        traverse.traverse(studentsMap);
    }
}
