package SquaresofaSortedArray;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs = sc.nextLine().trim().split(" ");
        int[] A = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            A[i] = Integer.parseInt(strs[i]);
        }
        for (int num:sortedSquares(A)) {
            System.out.println(num);
        }
    }

    public static int[] sortedSquares(int[] A){
        int left = 0, right = A.length - 1, index = A.length-1;
        int[] res = new int[right+1];
        while(left < right){//[]左闭右闭的形式
            res[index--] = A[left] * A[left] > A[right] * A[right]? A[left] * A[left++]:A[right] * A[right--];
        }
        return res;
    }
}
