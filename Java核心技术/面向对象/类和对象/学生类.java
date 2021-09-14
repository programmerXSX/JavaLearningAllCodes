package 面向对象.类和对象;

public class 学生类 {
    String order;
    String name;
   private   int   score;
    String phone_number;
    String home;

    /* 构造方法*/
    public 学生类(String order, String name, String phone_number, String home){
        this.phone_number = phone_number;
        this.order = order;
        this.name = name;
        this.home = home;
        System.out.println("已初始化");

    }

    public void setScore(int a){
        score = a;
    }
    public int getScore(){
        return score;
    }

    public void show(){
        System.out.println("姓名：" +this.name);
        System.out.println("学号：" + this.order);
        System.out.println("联系方式：" + this.phone_number);
        System.out.println("家庭住址：" + this.home);
    }
//
//    public void entry(){
//        Scanner student = new Scanner(System.in);
//        System.out.print("请输入家的位置：");
//        this.home = student.nextLine();
//        System.out.print("请输入学生姓名：");
//        this.name = student.nextLine();
//        System.out.print("请输入学号：");
//        this.order = student.nextLong();
//        System.out.print("请输入电话号码：");
//        this.phone_number = student.nextLong();
//        System.out.print("请输入学生成绩：");
//        this.score = student.nextInt();
//
//    }

}
