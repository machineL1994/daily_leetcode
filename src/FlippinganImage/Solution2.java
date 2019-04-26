//package FlippinganImage;
//
//import java.util.Scanner;
//
///**
// *
// * Input: [[1,1,0],[1,0,1],[0,0,0]]
// * Output: [[1,0,0],[0,1,0],[1,1,1]]
// * Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
// * Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
// * @author Administrator
// *
// */
//public class Solution2 {
//    public static void main(String[] args) {
//        int[][] res = flipAndInvertImage(A);
//        for (int i = 0; i < res.length ; i++) {
//            for (int j = 0; j < res[0].length; j++) {
//                System.out.print(res[i][j]+" ");
//            }
//            System.out.println();
//        }
//
//    }
//
//
//
//
//    public static int[][] flipAndInvertImage(int[][] A) {
//
//        //水平翻转
//        for(int i=0;i<A.length;i++){
//            int k=A[i].length-1;
//            for(int j=0;j<(A[i].length+1)/2;j++,k--){
//                int temp = A[i][k];
//                A[i][k] = A[i][j];
//                A[i][j] = temp;
//            }
//        }
//        //反转0-->1,1-->0
//        for(int i=0;i<A.length;i++){
//            for(int j=0;j<A[i].length;j++){
//                if(A[i][j]==0){
//                    A[i][j] = 1;
//                }else{
//                    A[i][j] = 0;
//                }
//
//            }
//        }
//
//        return A;
//    }
//
//}
