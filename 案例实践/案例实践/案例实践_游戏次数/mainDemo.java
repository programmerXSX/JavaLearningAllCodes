package 案例实践.案例实践_游戏次数;

import java.io.*;
import java.util.*;

public class mainDemo {
    public static final File gameDataFile = new File("java 语言基础\\src\\案例实践\\案例实践_游戏次数\\Game.txt");
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Map<Integer,IDdata> GameData  = new HashMap<>();//创建游戏数据集合对象
        ObjectInputStream GameDataFileRead = new ObjectInputStream(new FileInputStream(gameDataFile));//创建数据读出文件对象
        IDdata iDdata = new IDdata();//创建游戏账户对象
        Map<String,String> ID = new HashMap<>();//创建账号密码键值对
        IDdata allIDdata = null;// = (IDdata)GameDataFileRead.readObject(); //读取文件数据
        System.out.print("\t\t登录\n已有账号，抠1登录\n无账号？抠2注册\n");
        ObjectOutputStream GameDataFileWrite = new ObjectOutputStream(new FileOutputStream(gameDataFile));//创建数据输入文件对象
        log(GameDataFileRead,GameDataFileWrite,allIDdata,iDdata,ID);//登录或注册
        playGame pg = new playGame();//创建游戏对象
        setPlayerName(iDdata,pg);//设置游戏内昵称
        pg.guessNumber();//进入游戏
        iDdata.setCount(allIDdata.getCount()+ 1);

        GameData.put(iDdata.getCount(),iDdata);//设置游戏玩家键值集合（键：玩游戏次数；值：游戏数据）
        GameDataFileWrite.writeObject(iDdata);//将数据写入文件

        System.out.println(GameData);
        GameDataFileWrite.close();
        GameDataFileRead.close();
    }
    public static void log(ObjectInputStream GameDataFileRead ,ObjectOutputStream GameDataFileWrite, IDdata allIData, IDdata iDdata,Map<String,String> ID) throws IOException, ClassNotFoundException {
        while (true) {
            Scanner sc = new Scanner(System.in);
            int islog = sc.nextInt();
            while (true) {
                if (islog == 1) {
                    System.out.print("账号：");
                    String identity = sc.next();
                    System.out.print("密码：");
                    String password = sc.next();
                    allIData = (IDdata) GameDataFileRead.readObject();
                    if (allIData.getIdentity() == identity & allIData.getPassword() == password) {
                        System.out.println("登陆成功");
                        return;
                    }
                } else if (islog == 2) {
                    String identity = randomIdentity(iDdata, ID);//随机生成账号
                    System.out.println("已为您自动生成账号:" + identity);
                    setpassword(iDdata, ID);//设置密码
                    GameDataFileWrite.writeObject(iDdata);
                    GameDataFileWrite.flush();
                    System.out.println("请重新登录");
                    islog = 1;
                } else {
                    System.out.println("别瞎输，要么抠1要么抠2，重新输入：");
                    break;
                }
            }
        }
    }
    public static void logagain(){

    }
    public static String randomIdentity(IDdata iDdata,Map<String,String> ID){
        Random r = new Random();
        String identity = "2021"  + r.nextInt(10) + r.nextInt(10) + r.nextInt(10) + r.nextInt(10);
        if (ID.get(identity) == null){
            iDdata.setIdentity(identity);
            return identity;
        }else {
            return randomIdentity(iDdata,ID);
        }
    }
    public static void setPlayerName(IDdata iDdata,playGame pg){
        Scanner sc = new Scanner(System.in);
        System.out.println("亲爱的玩家，欢迎来到猜数字游戏！\n请告诉我您的昵称：");
        String playerName = sc.nextLine();
        pg.setPlayerName(playerName);
        iDdata.setPg(pg);
    }
    public static void setpassword(IDdata iDdata,Map<String,String> ID){
        System.out.println("请输入密码：");
        Scanner sc = new Scanner(System.in);
        String password0 = sc.nextLine();
        System.out.println("请再次输入确认：");
        String password1 = sc.nextLine();
        if (password1.equals(password0)){
            System.out.println("密码设置成功，请牢记账号密码");
            iDdata.setPassword(password0);
            ID.put(iDdata.getIdentity(),password0);
        }else {
            System.out.println("两次密码不一致，请重新输入：");
            setpassword(iDdata,ID);
        }
    }
}
