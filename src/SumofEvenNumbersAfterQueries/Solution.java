package SumofEvenNumbersAfterQueries;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] A = new int[cnt];
        for (int i = 0; i < cnt ; i++) {
            A[i] = sc.nextInt();
        }
        int q_row = sc.nextInt(), q_col = sc.nextInt();
        int[][] queries = new int[q_row][q_col];
        for (int i = 0; i < q_row; i++) {
            for (int j = 0; j < q_col; j++) {
                queries[i][j] = sc.nextInt();
            }
        }
        int[] res = sumEvenAfterQueries(A, queries);
        for (int i = 0; i < queries.length; i++) {
            System.out.print(res[i]+ " ");
        }
    }

    /***
     * 这里需要注意的是每次查询之后更改一个数的奇偶性，所以可以按照之前的和来做计算
     * sum_new = sum_old - change_old[i] + change_new[i];
     * @param A
     * @param queries
     * @return
     */
    public static int[] sumEvenAfterQueries(int[] A, int[][] queries){
        boolean first_row_flag = true;
        int sum = 0, index = 0;
        int[] res = new int[queries.length];
        for(int[] row : queries){
            if(first_row_flag){
                first_row_flag = false;
                A[row[1]] += row[0];
                for (int e:A) {
                    if(e%2 == 0)
                        sum += e;
                }
                res[index++] = sum;
            }else {
                if(Math.abs(A[row[1]]) % 2 != 0){// if origin is odd
                    if(Math.abs(A[row[1]] + row[0]) % 2 != 0) ;
                    else sum += A[row[1]] + row[0];
                }else{
                    if(Math.abs(A[row[1]] + row[0]) % 2 != 0) sum -= A[row[1]];
                    else sum += row[0];
                }
                A[row[1]] += row[0];
                res[index++] = sum;
            }
        }
        return res;
    }
}
