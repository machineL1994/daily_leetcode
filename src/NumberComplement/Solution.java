package NumberComplement;

public class Solution {
    public static void main(String[] args) {

    }

    /**
     * typical bit operation
     * @param num
     * @return
     */
    public static int findComplement(int num){
        return 1;
    }

    public static int findComplement_test(int num){
        int i = 0, j = 0;
        while(i < num){
            i += Math.pow(2, j);
            j++;
        }
        return i-num;
    }
}
