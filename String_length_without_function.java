import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int len = 0;

        while (true) {
            try {
             
                str.charAt(len);   
                len++;
            }
            catch (Exception e) {
                break;             
            }
        }

        System.out.println(len);
    }
}