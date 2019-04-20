package RobotReturntoOrigin;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(judgeCircle(s));
    }

    public static boolean judgeCircle(String moves){
        int x = 0, y = 0;
        for (char c: moves.toCharArray()) {
            if(c == 'U') y++;
            if(c == 'D') y--;
            if(c == 'L') x--;
            if(c == 'R') x++;
        }
        if(x == 0 && y == 0){
            return true;
        }
        return false;
    }
}
