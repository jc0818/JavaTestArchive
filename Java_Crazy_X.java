import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n = 0;
        System.out.println("Please enter the size of X above printing a nice X.");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        //Start Crazy X
        int a = 0, b = n - 1;
        int c = 3 * n - 3, d = 4 * n - 4;

        for (int i = 1; i < 2 * n; ++i) {
            if (i == 1 || i == (2 * n) - 1) {
                for (int j = a; j <= b; j++) {
                    System.out.printf("*");
                }
                for (int j = b + 1; j < c; j++) {
                    System.out.printf(" ");
                }
                for (int j = c; j <= d; j++) {
                    System.out.printf("*");
                }
            } else {
                for (int j = 0; j < a; j++) {
                    System.out.printf(" ");

                }
                System.out.printf("*"); // a

                for (int j = a + 1; j < b; j++) {
                    System.out.printf(" ");

                }
                System.out.printf("*"); // b
                for (int j = b + 1; j < c; j++) {
                    System.out.printf(" ");
                }

                if (b != c) {
                    System.out.printf("*"); // c
                }
                for (int j = c + 1; j < d; j++) {
                    System.out.printf(" ");

                }
                System.out.printf("*");
            }
            System.out.println("");
            if (i < n) {
                a++;
                b++;
                c--;
                d--;
            } else {
                a--;
                b--;
                c++;
                d++;
            }
        }
    }
}