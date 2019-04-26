package SelfDividingNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt();
        int right = sc.nextInt();
        List<Integer> myres = selfDividingNumbers(left, right);
        for (int num : myres) {
            System.out.print(num + " ");
        }

    }
    public static List<Integer> selfDividingNumbers(int left, int right){
        List<Integer> res = new ArrayList<>();
        while(left<=right){
            if(isValid(left))
                res.add(left);
            left++;
        }
        return res;
    }

    public static boolean isValid(int num){
        int num_count = num;
        while(num > 0){
            int n = num % 10;
            if(n == 0) return false;
            if(num_count % n != 0){
                return false;
            }
            num = num / 10;
        }
        return true;
    }
}
