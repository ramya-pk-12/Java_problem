import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        if(n <= 1){
            System.out.println("no");
            return;
        }

        for(int i = 2; i <= n/2; i++){
            if(n % i == 0){
                count = 1;   
                break;
            }
        }

        if(count == 1)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
