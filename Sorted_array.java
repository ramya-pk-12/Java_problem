import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        if (isSorted(arr)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    public static boolean isSorted(int[] arr) {
        boolean asc = true;
        boolean desc = true;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i-1]) {
                asc = false;
            }
            if (arr[i] > arr[i-1]) {
                desc = false;
            }
        }

        return asc || desc;
    }
}
