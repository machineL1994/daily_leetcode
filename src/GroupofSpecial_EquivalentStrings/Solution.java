package GroupofSpecial_EquivalentStrings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] nums = new int[cnt];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(ArraystoString_test(nums));
    }

    /**
     * 该函数的作用就是统计一个字符串的奇数下标字符和偶数下标字符
     * @param A
     * @return
     */
    public static int numSpecialEquivGroups(String[] A){
        Set<String> set = new HashSet<>();
        for (String s:A) {
            int[] cs = new int[52];
            for (int i = 0; i < s.length(); i++) {
                cs[s.charAt(i) - 'a' + 26 *(i%2)]++;
            }
            set.add(Arrays.toString(cs));
        }
        return set.size();
    }
    public static String ArraystoString_test(int[] A){
        return Arrays.toString(A);
    }
}
