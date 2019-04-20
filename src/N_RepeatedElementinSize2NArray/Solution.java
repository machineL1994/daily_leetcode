package N_RepeatedElementinSize2NArray;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().trim().split(",");
        int[] A = new int[s.length];
        for (int i = 0; i < A.length; i++) {
            A[i] = Integer.parseInt(s[i]);
        }
        System.out.println(repeatedNTimes(A));

    }

    /***
     * 思路为前后两个指针，然后发现不一样则同时向里面移动，直到遍历完
     * 这里需要注意可能会存在相等的现象，这时需要一个变量来表示当前的值重复了，然后将一个值移动，另一个不动
     * 最后的返回值为需求值,这里思考的有一点问题，就是如果全部碰撞了，然后最后的值是没找出来的，有一个简单的思路
     * 也就是由于当前题目中所述的是数组中N+1的数都是不相等的，然后相等的数为N个
     * 所以可以简单地思考为，only have to compare elements with their neighbors that are distance 1, 2, or 3 away
     * @param A
     * @return
     */
    public static int repeatedNTimes(int[] A){
       for(int k = 1;k<=3;k++){
           for(int i=0;i<A.length-k;i++){
               if(A[i] == A[i+k])
                   return A[i];
           }
       }
       throw null;
    }
}
