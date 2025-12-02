//Check Divisibility by 13

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        
        if((N%13)==0)
        {
            System.out.print("yes");
        }
        else
        {
            System.out.print("no");
        }
    }
}