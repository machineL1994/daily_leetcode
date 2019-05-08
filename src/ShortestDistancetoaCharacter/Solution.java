package ShortestDistancetoaCharacter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        char C = sc.next().toCharArray()[0];
        int[] res = shortestToChar_test(S, C);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }

    /***
     * 当前的思路是首先将该字符串中的字符的下标值都存起来，按照顺序存储起来
     * 然后遍历字符串中的下标，从前到后，判断当前字符串的该下标对应的值和存储的下标对应的值，存储的下标每次按照顺序取出一个
     * 然后取之前下标和当前取出的最新的下标之间的经过计算的distance的最小值
     * 存储的下标的更新规则为当前新的下标得到的距离小于之前的下标得到的距离，则需要更新
     * @param s
     * @param C
     * @return
     */
    public static int[] shortestToChar(String s, char C){
        List<Integer> indexs = new ArrayList<>();
        return  null;
    }

    /***
     * 该思路是两次遍历，第一次遍历记录当前值和左边的c的距离，第二次遍历记录当前值和右边的c的距离，然后同时记录最小值
     * @param s
     * @param C
     * @return
     */
    public static int[] shortestToChar_test(String s, char C){
        int[] res = new int[s.length()];
        int idx = -s.length();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == C) idx = i;
            res[i] = i - idx;
        }
        idx = 2*s.length();
        for(int i = s.length()-1;i>=0;i--){
            if(s.charAt(i) == C) idx = i;
            res[i] = Math.min(res[i], idx - i);
        }
        return res;
    }


}
