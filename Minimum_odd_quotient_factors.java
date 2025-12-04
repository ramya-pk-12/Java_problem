import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
       
        for(int fact=1;fact<=num;fact++)
        {
            if(num%fact==0&&(num/fact)%2!=0)
            {
                System.out.print(fact);
                break;
            }
        }
    }
}