import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();

        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int left = 0;
        int right = n - 1;

        while(left < right) {
            int sum = arr[left] + arr[right];

            if(sum == x) {
                System.out.println("yes");
                return;
            }
            else if(sum < x) {
                left++;
            }
            else {
                right--;
            }
        }

        System.out.println("no");
    }
}
