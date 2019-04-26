package HammingDistance;

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(hammingDistance_test2(x, y));
    }
//    public static void test(){
//        String a1;
//        String a2;
//        for (int i = Math.max(a1.length(), a2.length())-1; i >=0 ; i--) {
//            if(a1[i] == null){
//                if(a2[i] == 0){
//                    //doing
//                }
//            }else{
//                if(a1[i] == a2[i]){
//                    //doing
//                }
//            }
//        }
//    }

    public static int hammingDistance_test(int x, int y){
        int res = x ^ y;
        int count = 0;
        while(res>0){
            if((res & 1) == 1){
                count++;
            }
            res = res>>1;
        }
        return count;
    }

    public static int hammingDistance_test2(int x, int y){
        int result = 0 ;
        String x_bin_str = Integer.toBinaryString(x);
        String y_bin_str = Integer.toBinaryString(y);
        boolean flag = x_bin_str.length() >= y_bin_str.length()? true : false;
        if(!flag){//进行下面我们需要满足x_bin_str的长度大于y_bin_str
            String tmp = x_bin_str;
            x_bin_str = y_bin_str;
            y_bin_str = tmp;
        }
        for(int i = x_bin_str.length()-1, j = y_bin_str.length()-1; i >= 0 || j>=0 ; i--, j--){
            if(j < 0){
                if(x_bin_str.charAt(i) != '0'){
                    result++;
                }
            }else{
                if(x_bin_str.charAt(i) != y_bin_str.charAt(j)){
                    result++;
                }
            }
        }
        return result;
    }
}

