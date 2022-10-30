import java.util.*;

public class hollowDiamond {

    public static Scanner scn = new Scanner(System.in);

    public static void diamond(int n) {
        int nsp = n / 2;
        int nst = 1;
        int nspp = -1;
        // int nstt = n-n;
        for (int row = 1; row <= n; row++) {
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");
            }

            for (int cst = 1; cst <= nst; cst++) {
                System.out.print("*\t");
            }

            for (int csp = 1; csp <= nspp; csp++) {
                System.out.print("\t");
            }

            for (int cst = 1; cst <= nst; cst++) {
                if (row > 1 && row < n) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }

            if (row <= n / 2) {
                nspp += 2;
                nsp--;
            } else {
                nspp -= 2;
                nsp++;
            }
            System.out.println("\t");
        }
    }

    public static void main(String[] args) {
        diamond(scn.nextInt());
    }
}
