// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int value;
        System.out.println("Enter The Pyramid Number of rows");
        Scanner sc = new Scanner(System.in);
        value = sc.nextInt();
        pyramid(value);
    }

    public static void pyramid(int rows)
    {
        int i,j,k;
        for(i=1; i<=rows; i++)
        {
            for(j=i; j<=rows-1;j++)
            {
                System.out.print(" ");
            }
            for(k=1;k<=i*2-1; k++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}