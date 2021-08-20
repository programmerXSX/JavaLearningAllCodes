package 案例实践.案例实践_将学生成绩排序并储存到文件中;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class mainDemo {
    public static void main(String[] args) throws IOException {

                //创建TreeSet集合并按总分排序
        TreeSet< Student> studentsTreeSet = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num =  s2.getPoints() - s1.getPoints();
                return num == 0?1:num;
            }
        });
                //创建文件缓冲输出流对象写数据
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream
                ("java 语言基础\\src\\案例实践\\案例实践_将学生成绩排序并储存到文件中\\StudentInformation.txt"));

                //创建学生数组并键入信息
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入学生人数：");
        int sum = scanner.nextInt();
        Student[] students = new Student[sum];
        creatStudents(students,sum);

                //将学生添加到集合中
        for (Student student:students){studentsTreeSet.add(student);}

                //将集合中的元素写入文件中
       writeFile(bos,studentsTreeSet);

                //释放资源
        bos.close();
    }

    public static void writeFile(BufferedOutputStream bos,TreeSet<Student> studentsTreeSet) throws IOException{
        bos.write("姓名\t语文\t数学\t英语\t总分\r\n".getBytes(StandardCharsets.UTF_8));
        for (Student student:studentsTreeSet){
            bos.write((student.getName() + "\t").getBytes(StandardCharsets.UTF_8));
            bos.write((student.getChineseScore() + "\t").getBytes(StandardCharsets.UTF_8));
            bos.write((student.getMathScore() + "\t").getBytes(StandardCharsets.UTF_8));
            bos.write((student.getEnglishScore() + "\t").getBytes(StandardCharsets.UTF_8));
            bos.write((student.getPoints() + "\t").getBytes(StandardCharsets.UTF_8));
            bos.write("\r\n".getBytes(StandardCharsets.UTF_8));
        }

    }
    public static void creatStudents(Student[] students,int sum){
        for (int i = 0;i<sum;i++){
            students[i] = new Student();
            scannerStudent(students[i],i+1 );
        }
    }
    public static void scannerStudent(Student student,int order){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第" +  order+"位学生姓名：");
        student.setName(sc.nextLine());
        System.out.print("\t请输入语文成绩：");
        student.setChineseScore(sc.nextInt());
        System.out.print("\t请输入数学成绩：");
        student.setMathScore(sc.nextInt());
        System.out.print("\t请输入英语成绩：");
        student.setEnglishScore(sc.nextInt());
        student.setPoints(student.getChineseScore()+student.getMathScore()+student.getEnglishScore());
    }
}
