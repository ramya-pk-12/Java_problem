import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = Math.abs(obj.nextInt());

        int digit;
        boolean flag = false;
        String result = "";

        if (n == 0) {              
            System.out.print("-1");
            return;
        }

        while (n > 0) {
            digit = n % 10;
            if (digit % 2 != 0) {
                result = digit + " " + result;
                flag = true;
            }
            n /= 10;
        }

        if (flag)
            System.out.print(result.trim());
        else
            System.out.print("-1");
    }
}
