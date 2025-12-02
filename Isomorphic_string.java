import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        if (s1.length() != s2.length()) {
            System.out.println("no");
            sc.close();
            return;
        }

      
        boolean isIsomorphic = true;
        for (int i = 0; i < s1.length(); i++) {
            for (int j = i + 1; j < s1.length(); j++) {

              
                if (s1.charAt(i) == s1.charAt(j) && s2.charAt(i) != s2.charAt(j)) {
                    isIsomorphic = false;
                    break;
                }

              
                if (s1.charAt(i) != s1.charAt(j) && s2.charAt(i) == s2.charAt(j)) {
                    isIsomorphic = false;
                    break;
                }
            }
            if (!isIsomorphic)
                break;
        }

     
        if (isIsomorphic)
            System.out.println("yes");
        else
            System.out.println("no");

        sc.close();
    }
}
