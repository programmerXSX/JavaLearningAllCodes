package 案例实践.案例实践_模拟斗地主;

import java.util.*;
public class fightTheLandlord {
    public static void main(String[] args) {
        //创建集合储存扑克牌
        ArrayList<String> cards = new ArrayList<>();
        //将扑克牌加入集合
        makeCards(cards);
        //将扑克牌顺序打乱
        Collections.shuffle(cards);
        //抽出底牌并给三个玩家发牌
        dealCards(1,"夏浩然",cards);
        dealCards(2,"夏敏",cards);
        dealCards(3,"夏大哥",cards);
        dealFloorCards(cards);
    }
    public static void dealFloorCards(ArrayList<String> cards){
        System.out.println("底牌：" +cards.get(cards.size() - 1) +" " + cards.get(cards.size() - 2) + " " + cards.get(cards.size() - 3));
    }
    public static void dealCards(int playersOrder,String playersName,ArrayList<String> cards){
        int playersSum = 3;
        System.out.print("玩家" + playersOrder + ":" + playersName +"\n\t");
        int order = 1;
        while (order <= (cards.size() - 3)){
            if (order%playersSum == playersOrder || (order%playersSum + playersSum) == playersOrder){
                System.out.print(cards.get(order - 1) + " ");
            }
            order++;
        }
        System.out.println("\n");
    }
    public static void makeCards(ArrayList<String> cards){
        StringBuilder sb = new StringBuilder();
        String s = sb.toString();
        char[] colors = {'♠','♥','♣','♦'};
        String[] strings = {"2","3","4","5","6","7","8","9","10","A","J","Q","k"};
        for (Character color:colors){
            for (String string:strings){
                sb.append(color).append(string);
                s = sb.toString();
                cards.add(s);
                sb.delete(0,10);
            }
        }
        cards.add("大王");
        cards.add("小王");
    }
}
