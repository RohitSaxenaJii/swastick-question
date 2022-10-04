import java.util.*;

public class swasthik {

    public static Scanner scn = new Scanner(System.in);

    public static void swasthikPattern(int n) {
        for (int row = 1; row <= n; row++) {

            for (int cst = 1; cst <= n; cst++) {
                if (row == 1) {
                    if (cst <= (n / 2) + 1 || cst == n) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                }

                else if (row <= (n / 2)) {
                    if (cst == (n / 2) + 1 || cst == n) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                }

                else if (row == (n / 2) + 1) {
                    if (cst <= n) {
                        System.out.print("*\t");
                    }
                }

                else if (row < n) {
                    if (cst == 1 || cst == (n / 2) + 1) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                }

                else {
                    if (cst == 1 || cst >= (n / 2) + 1) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                }
            }
            System.out.println("\t");
        }
    }

    public static void main(String[] args) {
        swasthikPattern(scn.nextInt());
    }
}
