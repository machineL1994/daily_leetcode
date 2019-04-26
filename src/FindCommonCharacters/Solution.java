package FindCommonCharacters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

    }

    /***
     * there is a cool idea
     * 统计每个字符串中字符出现的个数，然后用最小值来更新
     * @param A
     * @return
     */
    public static List<String> commonChars(String[] A){
        int[] counts = new int[26];
        Arrays.fill(counts, Integer.MAX_VALUE);
        for (String s : A) {
            int[] tmpcnts = new int[26];
            for (char c: s.toCharArray()) {
                tmpcnts[c - 'a']++;
            }
            for (int i = 0; i < tmpcnts.length; i++) {
                counts[i] = Math.min(counts[i], tmpcnts[i]);
            }
        }
        List<String> res = new ArrayList<>();
        for (int i = 0; i < counts.length; i++) {
            while(counts[i]-->0){
                res.add(Character.toString((char)(i+'a')));
            }
        }
        return res;
    }
}
