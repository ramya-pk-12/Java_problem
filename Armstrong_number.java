import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int n = String.valueOf(num).length();
        
        int sum = 0;
        while (temp > 0) {
            int d = temp % 10;
            sum += Math.pow(d, n);
            temp /= 10;
        }
        
        if (sum == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
    }
}
