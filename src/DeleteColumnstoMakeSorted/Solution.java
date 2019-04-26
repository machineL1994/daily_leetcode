package DeleteColumnstoMakeSorted;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] A = sc.nextLine().trim().split(" ");
        System.out.println(minDeletionSize(A));
    }

    public static int minDeletionSize(String[] A){
        int count = 0;
        for (int i = 0; i < A[0].length(); i++) {
            for (int j = 0; j < A.length-1; j++) {
                if(A[j].charAt(i)>A[j+1].charAt(i)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
