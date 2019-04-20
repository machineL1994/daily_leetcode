package MyTwoSum;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/***
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int[] nums = new int[s.length];
        for (int i = 0; i < s.length ; i++) {
            nums[i] = Integer.parseInt(s[i]);
        }
        int target = sc.nextInt();
        int[] res = twoSum(nums, target);
        for (int i = 0; i < 2; i++) {
            System.out.println(res[i]);
        }

    }

    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length ; i++) {
            if(map.containsKey(target-nums[i])){
                res[0] = map.get(target-nums[i]);
                res[1] = i;
            }
            map.put(nums[i], i);
        }
        return res;
    }
}
