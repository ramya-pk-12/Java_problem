//Given a string S, print 'yes' if it has a vowel in it else print 'no'.
//Sample Input:
//codekata
//Sample Output:
//yes

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int i;

        
        int count=0;
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='i')
            {
                count++;
            }
        }
        if(count>=1)
        {
            System.out.print("yes");
        }
        else
        {
            System.out.print("no");
        }
    }
}