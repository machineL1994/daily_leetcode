package UniqueMorseCodeWords;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().trim().split(" ");
        System.out.println(uniqueMorseRepresentations(words));
    }

    public static int uniqueMorseRepresentations(String[] words){
        String[] maps = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> myset = new HashSet<>();
        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for ( char c : word.toCharArray()) {
                sb.append(maps[c - 'a']);
            }
            myset.add(sb.toString());
        }
        return myset.size();
    }
}
