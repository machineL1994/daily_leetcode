package ReverseString;

public class Solution {
    public static void main(String[] args) {

    }

    public static void reverseString(char[] s){
        int left = 0, right = s.length -1;
        while(left<right){//[]左闭区间右闭区间的形式
            char tmp = s[left];
            s[left++] = s[right];
            s[right--] = tmp;
        }
    }
}
