import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int n = s.length();
        char[] arr = s.toCharArray();

        if(n % 2 == 1) {  
            
            arr[n/2] = '*';
        } else {  
           
            arr[n/2] = '*';
            arr[(n/2) - 1] = '*';
        }

        System.out.println(new String(arr));
    }
}
