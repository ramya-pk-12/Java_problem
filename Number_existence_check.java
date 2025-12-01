import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int size=sc.nextInt();
        int k=sc.nextInt();
        int[] num=new int[size];
        int count=0;
        
        for(int i=0;i<size;i++)
        {
            num[i]=sc.nextInt();
            if(k==num[i])
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