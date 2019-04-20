package RemoveOutermostParentheses;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        System.out.println(removeOuterParentheses(S));
    }

    public static String removeOuterParentheses(String S){
        StringBuilder sb = new StringBuilder();
        int flag = 0;
        for (char c: S.toCharArray()) {
            if(c == '('){
                if(flag > 0)
                    sb.append(c);
                flag++;
            }
            if (c == ')'){
                if(flag > 1)
                    sb.append(c);
                flag--;
            }
        }
        return sb.toString();
    }
}
