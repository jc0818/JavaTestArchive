// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      int i,j,rows;
        System.out.println("Enter the Heart Number of rows");
        Scanner sc = new Scanner(System.in);
        rows = sc.nextInt();
        Heart(rows);}
    public  static  void Heart(int rows)
    {
        int i,j;
        for (i = rows/2; i <= rows; i+=2) {
            for(j=1; j< rows-i; j+=2) {
                System.out.print(" ");
            }
            for(j=1; j<=i; j++) {
                System.out.print("*");
            }
            for(j=1; j<= rows-i; j++) {
                System.out.print(" ");
            }
            for(j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for(i= rows; i>=1; i--) {
            for(j=i; j< rows; j++) {
                System.out.print(" ");
            }
            for(j=1; j<= (i*2)-1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        return;
    }
}