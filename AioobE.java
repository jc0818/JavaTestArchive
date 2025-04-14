import java.util.Scanner;

public class AioobE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		int check = 0;
		while(true)
		{
			try {
				System.out.print("정수를 입력 : ");
				arr[check] = sc.nextInt();
				check++;
				System.out.print("현재 배열 : ");
				for(int i = 0; i < check; ++i)
				{
					System.out.print(arr[i] + " ");
				}
				System.out.println("");
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.print(e +"발생함 "); 
				break;
			}
		}
		sc.close();
	}

}
