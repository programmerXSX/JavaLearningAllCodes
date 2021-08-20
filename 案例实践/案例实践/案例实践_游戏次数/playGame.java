package 案例实践.案例实践_游戏次数;

import java.io.Serializable;
import java.util.Random;
import java.util.Scanner;

public class playGame implements Serializable {

    private String playerName;//玩家昵称
    private int score;//分数
    private int stepNumber = 0;//步数

    public boolean guessNumber() {

        Random r = new Random();
        int number = r.nextInt(101);
        System.out.println("\t\t猜数字游戏\n5步之内猜到得100分，步数越少得分越高哦");
        System.out.println("0-100之间的随机数字，快来猜猜他是多少吧!");
        Scanner sc = new Scanner(System.in);

        while (true) {
            int scannerNumber = sc.nextInt();
            if (++stepNumber <= 5){
                score = 100;
            }else {
                score = 100-10*(stepNumber - 5);
            }
            if (scannerNumber < 0 || scannerNumber > 100) {
                System.out.println("你他妈有毛病吧，\n让你输入0-100的数字，\n你输的啥玩意？？？");
            } else {
                if (scannerNumber < number & scannerNumber >= 0) {
                    System.out.println("数字小了呢，再猜猜看");
                } else if (scannerNumber > number & scannerNumber <= 100) {
                    System.out.println("数字大了呢，再试试");
                } else if (scannerNumber == number) {
                    System.out.println("恭喜你，猜对啦，奖励一个如花的么么哒😘");
                    System.out.println("总步数：" + stepNumber);
                    System.out.println("最终得分：" + score);
                    break;
                }
            }
        }
        return true;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getStepNumber() {
        return stepNumber;
    }

    public void setStepNumber(int stepNumber) {
        this.stepNumber = stepNumber;
    }

    @Override
    public String toString() {
        return "playGame{" +
                "playerName='" + playerName + '\'' +
                ", score=" + score +
                ", stepNumber=" + stepNumber +
                '}';
    }
}
