package SmallestRangeI;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] A = new int[cnt];
        for (int i = 0; i < cnt ; i++) {
            A[i] = sc.nextInt();
        }
        int K = sc.nextInt();
        System.out.println(smallestRangeI(A, K));
    }

    public static int smallestRangeI(int[] A, int K){
        int A_max = Integer.MIN_VALUE, A_min = Integer.MAX_VALUE;
        for (int num: A) {
            A_max = Math.max(A_max, num);
            A_min = Math.min(A_min, num);
        }
        return Math.max( 0 , A_max - A_min - 2*K);
    }
}
