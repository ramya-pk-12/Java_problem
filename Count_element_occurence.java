import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        
        int[] num=new int[N];
        int count=0;
        for(int i=0;i<N;i++)
        {
            num[i]=sc.nextInt();
            
            if(K==num[i])
            {
                count++;
            }
        }
        if(count>=1)
        {
            System.out.print(count);
        }
        else{
            System.out.print("-1");
        }
        
    }
}