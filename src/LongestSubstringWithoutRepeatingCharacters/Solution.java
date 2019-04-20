package LongestSubstringWithoutRepeatingCharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s){
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int j = 0, i = 0;j < n; j++){
            if(map.containsKey(s.charAt(j))){
                // if we find s[j] has a duplicate in the range [i,j) with index j', we can skip all the
                // element in the range[i, j'] and let i to be j'+1 directly
                i = Math.max(i, map.get(s.charAt(j))+1);

            }
            ans = Math.max(ans, j-i+1);
            map.put(s.charAt(j), j);
        }
        return ans;
    }
}
