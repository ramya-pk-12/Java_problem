//Given length L and breadth B of a farm, print the area of the farm upto 5 decimal decimals.
//Sample Input:
//1.626 2.31
//Sample Output:
//3.75606

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       float n1=sc.nextFloat();
       float n2=sc.nextFloat();
       
       float result=n1*n2;
       
       System.out.printf("%.5f",result);
    }
}