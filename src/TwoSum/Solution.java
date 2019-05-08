package TwoSum;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int[] nums = new int[str.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(str[i]);
        }
        int target = sc.nextInt();
        int[] result = twoSum_test2(nums, target);
        for (int r: result
             ) {
            System.out.println(r+"  ");

        }

    }
    /**
     * 正常思路为双重循环，复杂度为O(n2);需要降低复杂度就需要将之前遍历的时候的信息存储下来，这样时间复杂度会降低
     * 使用比较方便的就是使用map，也就是hashmap来存储信息
     */

    public static int[] twoSum(int[] nums, int target){
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])){
                result[1] = i;
                result[0] = map.get(target - nums[i]);
            }
            map.put(nums[i], i);
        }
        return result;
    }

    public static int[] twoSum_test2(int[] nums, int target) {
        Map<Integer, Integer> m = new HashMap();
        for(int i = 0; i<nums.length; i++){
            if(m.get(target-nums[i]) != null){//get方法获取键值
                return new int[]{m.get(target-nums[i]), i};
            }
            m.put(nums[i],i);
        }
        throw null;
    }//这个没太懂，最后的返回值是0,0，还有第一次循环时，map里是不是没有东西
}
