package SortArrayByParity;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().trim().split(" ");
        int[] A = new int[s.length];
        for (int i = 0; i < A.length; i++) {
            A[i] = Integer.parseInt(s[i]);
        }
        for (int i = 0; i < A.length; i++) {
            System.out.println(sortArrayByParity(A)[i]);
        }

    }


    public static int[] sortArrayByParity(int[] A) {
        int[] res = new int[A.length];
        for (int i = 0, j = 0, k = res.length - 1; i < A.length; i++) {
            if(A[i] % 2 == 0){
                res[j++] = A[i];
            }else
                res[k--] = A[i];
        }
        return res;
    }
}
