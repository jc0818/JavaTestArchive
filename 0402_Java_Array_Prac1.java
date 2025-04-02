import java.util.Scanner;

public class Java_Array {

	public static void main(String[] args) {
		final int ARR_SIZE = 10;
		int[] iArray = new int[ARR_SIZE];
		int[] iCont = new int[ARR_SIZE];
		Scanner sc = new Scanner(System.in);
		int i= 0, iInputVaild = 0;
		
		for(i = 0; i < ARR_SIZE; ++i)
		{
			iCont[i] = 0;
		}
		i = 0;
		
		
		while(true)
		{
			if(i >= 10)
			{
				break;
			}
			
			iInputVaild = sc.nextInt();
			iArray[i] = iInputVaild;
			iCont[iInputVaild] = iCont[i] + 1;
			
			if(iInputVaild < 0 || iInputVaild >= 10)
			{
				System.out.print("0~9까지의 정수를 입력 하시오");
				continue;
			}
			
			++i;
			
		}
		
		System.out.print("저장 된 값의 베열은 : ");
		for(i = 0; i < ARR_SIZE; i++)
		{
			System.out.print(iArray[i] + " ");
		}
		System.out.println("");
		System.out.print("중복 입력된 값의 츨력 : ");
		for(i = 0; i < ARR_SIZE; ++i)//0
		{
			for(int j = 0; j < i; ++j) //0 ~ 9
			{
				if(iArray[i] == iArray[j])// [1]
				{						
						System.out.print(iArray[j] + " ");
				}
				
			}
		}
		
		System.out.println("");
		
		
		System.out.print("0~9에서 미입력 값 출력 : ");
		
		for(i = 0; i < ARR_SIZE; ++i)
		{
			if(iCont[i] == 0)
			System.out.print(i + " ");
		}
		
		sc.close();
		
	}

}
