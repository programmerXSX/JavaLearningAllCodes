package 案例实践.案例实践_Collection集合储存学生对象并遍历;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Collection<String> name = new ArrayList<String>();
        Collection<String> age = new ArrayList<String>();
        Scanner sc =new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入第" +(i+1)+ "个学生信息：");
            System.out.println("姓名：");
            name.add(sc.nextLine());
            System.out.println("年龄：");
            age.add(sc.nextLine());
        }
        Iterator<String> it = name.iterator();
        Iterator<String> it2 = age.iterator();
        while(it.hasNext()&&it2.hasNext()){
            System.out.println(it.next());
            System.out.println(it2.next());
        }

    }

}
