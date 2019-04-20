package JewelsandStones;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String J = sc.nextLine();
        String S = sc.nextLine();
        System.out.println(numJewelsInStones(J, S));
    }
    public static int numJewelsInStones(String J, String S){
        char[] Js = J.toCharArray();
        int res = 0;
        for (char c: S.toCharArray()) {
            for(int i=0;i<Js.length;i++){
                if(c == Js[i]){
                    res++;
                }
            }
        }
        return res;
    }
}
