package PeakIndexinaMountainArray;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] A = new int[len];
        for (int i = 0; i < len; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println(peakIndexInMountainArray(A));
    }

    public static int peakIndexInMountainArray(int[] A){
        int left = 0, right = A.length-1;
        while(left < right){//[]左闭右闭区间
            int index = left + ((right - left)>>1);
            if(A[index]>A[index+1] && A[index]>A[index-1])
                return index;
            if(A[index]<A[index+1] && A[index]>A[index-1])
                left = index;
            if(A[index]>A[index+1] && A[index]<A[index-1])
                right = index;
        }
        throw null;
    }
}
