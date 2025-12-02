import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min = sc.nextInt();
        for (int i = 1; i < 10; i++) {
            int num = sc.nextInt();
            if (num < min) {
                min = num;
            }
        }
        System.out.println(min);
    }
}
