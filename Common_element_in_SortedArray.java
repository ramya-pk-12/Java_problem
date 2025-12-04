import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        for (int i = 0; i < n; i++) A[i] = sc.nextInt();
        for (int i = 0; i < n; i++) B[i] = sc.nextInt();
        int i = 0, j = 0;
        boolean any = false;
        long lastPrinted = Long.MIN_VALUE;
        StringBuilder out = new StringBuilder();
        while (i < n && j < n) {
            if (A[i] == B[j]) {
                if (A[i] != lastPrinted) {
                    if (any) out.append(" ");
                    out.append(A[i]);
                    lastPrinted = A[i];
                    any = true;
                }
                int val = A[i];
                while (i < n && A[i] == val) i++;
                while (j < n && B[j] == val) j++;
            } else if (A[i] < B[j]) {
                i++;
            } else {
                j++;
            }
        }
        if (!any) System.out.println(-1);
        else System.out.println(out.toString());
    }
}