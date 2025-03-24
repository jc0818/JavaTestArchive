import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int iIn = 0;
		Scanner sc = new Scanner(System.in);
		
		iIn = sc.nextInt();
		
		for(int i = 1; i <= iIn; ++i)
		{
			for(int k = 1; k <= iIn - i; ++k)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= i; ++j)
			{
				
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
