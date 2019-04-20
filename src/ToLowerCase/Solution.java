package ToLowerCase;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(toLowerCase(str));
    }

    public static String toLowerCase(String str){
        StringBuilder sb = new StringBuilder();
        for (char c: str.toCharArray()) {
            if(c >= 'A'&& c<='Z'){
                c += 'a' - 'A';
            }
            sb.append(c);
        }
        return sb.toString();
    }

}
