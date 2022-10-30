import java.util.*;
public class fibonacci {

    public static Scanner scn = new Scanner(System.in);

    public static void fibonacci(int n) {
        int a = 0;
        int b = 1;
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            System.out.println(a);
            sum = a + b;
            a = b;
            b = sum;
        }
    }

    public static void main(String[] args) {
        fibonacci(scn.nextInt());
    }
}
