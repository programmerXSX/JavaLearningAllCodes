package 集合框架.集合进阶.Collections类.Collections常用方法;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("i");
        list.add("lof");
        list.add("ldkjab");
        list.add("jkhg");

        Collections.sort(list);
        //sort按照自然排序
        System.out.println(list);

        Collections.reverse(list);
        //反转集合
        System.out.println(list);

        Collections.shuffle(list);
        //随机排列集合
        System.out.println(list);

        System.out.println("------------------");
        ArrayList<Student> arrayList =  new ArrayList<>();
        Student s1 = new Student("xsx",12);
        Student s2 = new Student("jzt",13);
        Student s3 = new Student("xm",1);
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
//        Collections.sort(arrayList);    Student实例不可以使用Collections
        //但是可以使用Comparator重写
        Collections.sort(arrayList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return 0;
            }
        });



    }
}
