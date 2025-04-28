import java.util.Scanner;

public class ArrayOverLap {

	public static void main(String[] args) {
		int[] iArrayZ = new int[10];
		int[] iCheckArrayZ = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("0~9 사이 숫자로 10개를 입력 하시오");
		for(int i = 0; i < iArrayZ.length; ++i)
		{
			System.out.print(i+1 +"의 원소 : ");
			iArrayZ[i] = sc.nextInt();
			if(iArrayZ[i] < 0 || iArrayZ[i] >= 10)
			{
				System.out.println("0~9 사이 숫자로 입력하라니깐 다시 하셈.");
				i--;
			}
		}
		
		
		
		
		sc.close();
	
		System.out.println("저장된 배열 출력");
		for(int i = 0; i < iArrayZ.length; ++i)
		{
			iCheckArrayZ[iArrayZ[i]]++; //빈도
			System.out.print("["+iArrayZ[i]+"] ");
		} 
		
		System.out.println("\n빈도 배열 출력");
		for(int i = 0; i < iArrayZ.length; ++i)
		{
			System.out.print("["+iCheckArrayZ[i]+"] ");
		}
		
		System.out.println("\n중복 배열 출력");
		for(int i = 0; i < iArrayZ.length; ++i)
		{
			if(iCheckArrayZ[i] >= 2)
			{
				System.out.print("["+ i +"] ");				
			}
		}
		
		System.out.println("\n0~9가 한번도 입력이 안된 배열 출력");
		for(int i = 0; i < iArrayZ.length; ++i)
		{
			if(iCheckArrayZ[i] == 0)
			{
				System.out.print("["+ i +"] ");				
			}
		}
		
		

	}

}
