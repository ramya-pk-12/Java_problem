import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (isPalindrome(s, i, j)) {
                    System.out.println("Palindrome: \"" + s.substring(i, j+1) +
                                       "\" at positions [" + i + ", " + j + "]");
                    count++;
                }
            }
        }

        System.out.println("Total Palindromes = " + count);
    }

    // Check palindrome in range [l, r]
    static boolean isPalindrome(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}
