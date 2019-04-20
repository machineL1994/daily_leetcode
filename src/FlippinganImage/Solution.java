package FlippinganImage;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        sc.nextLine();
        int[][] A = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col ; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        int[][] res = flipAndInvertImage(A);
        for (int i = 0; i < res.length ; i++) {
            for (int j = 0; j <res[0].length ; j++) {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] flipAndInvertImage(int[][] A){
        for(int[] row : A){
            for(int i=0;i<(row.length+1)/2;i++){
                int tmp = row[i] ^ 1;
                row[i] = row[row.length-1-i] ^ 1;
                row[row.length-1-i] = tmp;
            }
        }
        return A;
    }
}
