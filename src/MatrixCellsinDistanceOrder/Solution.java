package MatrixCellsinDistanceOrder;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int r0 = sc.nextInt();
        int c0 = sc.nextInt();
        allCellsDistOrder(R, C, r0, c0);

    }

    public static int[][] allCellsDistOrder(int R, int C, int r0, int c0){
        Map<Integer, List<Integer>> mymap = new HashMap<>();
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                int dis = Math.abs(i - r0) + Math.abs(j - c0);
                mymap.put(dis, Arrays.asList(i, j));
                System.out.println("123");
            }
        }
//        int[][] res = new int[R*C][2];
//        for(int key = 0; key<=R+C;key++){
//            ;
//        }
        throw null;

    }
}
