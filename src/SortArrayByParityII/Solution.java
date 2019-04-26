package SortArrayByParityII;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] A = new int[count];
        for (int i = 0; i < count; i++) {
            A[i] = sc.nextInt();
        }
        int[] res = sortArrayByParityII(A);
        for (int num: res) {
            System.out.print(num + " ");
        }
    }
    /***
     *  accoring the meaning of the problem
     *  sort the array so that whenever A[i] is odd, i is odd; and whenever A[i] is even, i is even
     *  @param A
     *  @return
     */
    public static int[] sortArrayByParityII(int[] A){
        int[] res = new int[A.length];
        for(int i = 0, even_j = -2,odd_j = -1;i < A.length; i++){
            if(A[i] % 2 == 0)
                res[even_j += 2] = A[i];
            else
                res[odd_j += 2] = A[i];
        }
        return res;
    }

    public static int[] sortArrayByParityII2(int[] A){
        int j = 1;
        for (int i = 0; i < A.length; i+=2) {
            if(A[i] % 2 == 1){
                while(A[j] % 2 == 1)
                    j += 2;
                //the above operation will find the A[even_i]%2 == 1 and A[odd_i] % 2==0
                // then we need to swap A[i] and A[j]
                int tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
            }
        }
        return A;
    }
}
