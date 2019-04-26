package DIStringMatch;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] res = diStringMatch(str);
        for (int i = 0; i < str.length()+1; i++) {
            System.out.print(res[i] + " ");
        }
    }

    /***
     * a simple algorithm:
     * keep track of the smallest and largest element we haven't placed.
     * If we seen an 'I', place the small element, otherwise place the large element
     *
     * @param str
     * @return
     */
    public static int[] diStringMatch(String str){
        int N = str.length();
        int left = 0, right = N;
        int[] res = new int[N+1];
        for (int i = 0; i < N; i++) {
            if(str.charAt(i) == 'I')
                res[i] = left++;
            else
                res[i] = right--;
        }
        res[N] = left;
        return res;
    }
}
