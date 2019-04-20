package UniqueEmailAddress;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] emails = sc.nextLine().trim().split(" ");
        System.out.println(numUniqueEmails(emails));
    }

    public static int numUniqueEmails(String[] emails){
        Set<String> myset = new HashSet<>();
        for (String email: emails) {
            String[] s = email.split("@");
            StringBuilder sb = new StringBuilder();
            for (char c : s[0].toCharArray()) {
                if(c == '.')
                    continue;
                if(c == '+')
                    break;
                sb.append(c);
            }
            sb.append("@" + s[1]);
            myset.add(sb.toString());
        }
        return myset.size();
    }
}
