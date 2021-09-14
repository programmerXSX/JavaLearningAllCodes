package JavaLeetcode100道题目.题001;

/*
给定⼀个数组和⼀个⽬标和，从数组中找两个数字相加等于⽬标和，输出这两个数字的下标
example:
        Given nums = {2,7,11,15},target = 9;
        return [0,1]
 */

import java.util.*;

public class Answer {
    public static int target = 9;
    public static int[] nums = {2,7,11,15,1,8,10};
    public static void main(String[] args) {
        answer1();
        answer2();
    }

    /*
方法一：利用两层for循环找到合适的数据
        最简单粗暴的方法，两重循环，遍历所有情况看相加是否等于⽬标和，如果符合直接输出
        空间复杂度：O（1）
        时间复杂度：O（n²）
     */
    public static void answer1(){
        int x = -1, y = -1;
        System.out.print("return{");
        for(int i = 0;i<nums.length - 1;i++){
            for (int j = i +1;j<nums.length;j++){
                if (nums[i] + nums[j] == target){
                    x = i;
                    y = j;

                    System.out.print("[" + x +"," + y + "]," );
                }
            }
        }
        System.out.println("\b}");
    }

    /*
方法二：HashMap,不⽤遍历就可以找到元素⾥有没有等于 sub(target - nums[i]) 的
        把数组的每个元素保存为 hash 的 key，下标保存为 hash 的 value,
        这样只需判断 sub 在不在 hash 的 key ⾥就可以了
        需要注意的地⽅是，还需判断找到的元素不是当前元素，因为题⽬⾥不允许自身加自身对于target
        但是只需要将HashMap的put方法放到if条件之后，这样每次就添加不到当前元素，也就不需要判断了
                最后我只能说这程序牛逼！！！！！！！！！
        空间复杂度：O（1）
        时间复杂度：O（n²）
     */
    private static void answer2() {
        Map<Integer,Integer> numsMap = new HashMap<>();
        System.out.print("return{");
        for (int i = 0;i < nums.length;i++){
            int sub = target - nums[i];
            if (numsMap.containsKey(sub)){
                System.out.print("[" + numsMap.get(sub) +"," + i + "]," );
            }
            numsMap.put(nums[i], i);
        }
        System.out.println("\b}");
    }
    /*
方法三：
    看解法⼆中，两个 for 循环，他们⻓的⼀样，我们当然可以把它合起来。复杂度上不会带来什么变化，变化
仅仅是不需要判断是不是当前元素了，因为当前元素还没有添加进 hash ⾥
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int sub=target-nums[i];
            if(map.containsKey(sub)){
                return new int[]{i,map.get(sub)};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
