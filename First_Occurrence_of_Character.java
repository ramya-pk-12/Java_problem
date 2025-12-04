//Given a string 'S' and a character 'K', find at what position the character 'K' occurs for the first time in 'S'.
//(Assume the index of string starts at 1).If the character is not found in 'S' then print -1

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char k = sc.next().charAt(0);

        int pos = -1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == k) {
                pos = i + 1;
                break;
            }
        }

        System.out.println(pos);
    }
}
