package FibonacciNumber;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(fib(N));
    }

    public static int fib(int N){
        if(N < 2) return N;
        int f0 = 0, f1 = 1, f2 = 1;
        for(int i = 2; i <= N; i++){
            f2 = f1 + f0;
            f0 = f1;
            f1 = f2;
        }
        return f2;
    }
}
