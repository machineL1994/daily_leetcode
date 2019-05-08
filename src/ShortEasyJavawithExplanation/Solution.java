package ShortEasyJavawithExplanation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {

    }

    /**
     * 思路为：
     * 1. 首先将每一行的字母都存下来，根据题目的信息，这里主要分为三行 "QWERTYUIOP","ASDFGHJKL","ZXCVBNM"
     * 2. 然后将每一行的数字存到一个map中，其中key-value为字符-字符所在的行数
     * 3. 然后遍历输入进来的字符串，判断当前字符串的字符所在的行和当前的行是否匹配,当前的行默认为第一个字符的行数
     * @param words
     * @return
     */
    public static String[] findWords(String[] words){
        String[] strs = { "QWERTYUIOP","ASDFGHJKL","ZXCVBNM"};
        Map<Character, Integer> c2r_mapping = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            for (char c : strs[i].toCharArray()) {
                c2r_mapping.put(c, i);
            }
        }

        List<String> res = new ArrayList<>();
        for (String word : words) {
            if (word == null) continue;
            int c_index = c2r_mapping.get(word.toUpperCase().charAt(0));
            for (char c : word.toUpperCase().toCharArray()) {
                if (c2r_mapping.get(c) != c_index) {
                    c_index = -1;
                    break;
                }
            }
            if (c_index != -1) res.add(word);
        }
            String[] real_res = new String[res.size()];
            real_res = res.toArray(real_res);
            return real_res;
    }
}
