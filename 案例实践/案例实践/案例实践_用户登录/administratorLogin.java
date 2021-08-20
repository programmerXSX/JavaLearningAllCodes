package 案例实践.案例实践_用户登录;
import java.util.*;
public class administratorLogin {
    public static String userName = "",userPassword = "";
    public static void main(String[] args) {
        Scanner users = new Scanner(System.in);
        login(users);
    }

    public class administrator{
        private String administratorName;
        private String administratorPassword;
        public administrator(){ }
        public administrator(String administratorName,String administratorPassword){
            this.administratorName = administratorName;
            this.administratorPassword = administratorPassword;
        }
        public void setAdministratorName(String name){
            administratorName = name;
        }
        public String getAdministratorName(){
            return administratorName;
        }
        public void setAdministratorPassword(String Password){
            administratorPassword = Password;
        }
        public String getAdministratorPassword(){
            return  administratorPassword;
        }
    }
    public static void login(Scanner users){
        System.out.println("\t输入用户名和密码登陆账户\t");
        System.out.print("请输入用户名：");
        String Name  = users.nextLine();
        System.out.print("请输入密码：");
        String Password = users.nextLine();
        if(userName.equals(Name) == true && userPassword.equals(Password) == true){
            System.out.println("密码正确，已成功登陆");
        }else {
            System.out.println("用户名或密码错误，请重新输入");
        }
    }
}
