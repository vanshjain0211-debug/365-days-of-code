import java.util.*;

class Solution {
    public String toggleCase(String s) {
        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ans += Character.toUpperCase(ch);
            } else if (ch >= 'A' && ch <= 'Z') {
                ans += Character.toLowerCase(ch);
            } else {
                ans += ch;
            }
        }

        return ans;
    }
}

public class togglecase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        Solution obj = new Solution();

        while (T-- > 0) {
            String s = sc.next();
            System.out.println(obj.toggleCase(s));
        }

        sc.close();
    }
}