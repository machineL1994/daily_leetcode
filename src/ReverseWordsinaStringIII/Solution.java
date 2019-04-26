package ReverseWordsinaStringIII;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s){
        String[] ss = s.split(" ");
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < ss.length; i++) {
            if(i<ss.length-1) {
                res.append(new StringBuilder(ss[i]).reverse() + " ");
            }else
                res.append(new StringBuilder(ss[i]).reverse());
        }
//        for (String str : ss) {
//            res.append(new StringBuilder(str).reverse()+" ");
//        }
//        return res.toString().trim();
        return res.toString();
    }
}
