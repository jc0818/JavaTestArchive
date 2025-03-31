import java.util.Scanner;

public class Practice_4 {
//selection sort
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arrSize;
		int[] myArr;
		int minIdx;
		int minNumber;
		int tmp = 0;
		
		System.out.print("배열의 크기를 입력 하세요 : ");
		
		arrSize = sc.nextInt();
		myArr = new int[arrSize];
		
		
		System.out.print("배열의 원소를 입력하세요: ");
		for(int i = 0; i < arrSize; i++)
		{
			myArr[i] = sc.nextInt();
		}
		
		System.out.print("기존 입력한 배열 : ");
		for(int i = 0 ; i < arrSize; i++)
		{
			System.out.print(myArr[i] + " ");
		}
		System.out.println("");
		//계산시작
		//i의 이미는 정렬이 될 자리를 결정
		for(int i = 0 ; i < arrSize; i++)
		{
			minIdx = 0;
			minNumber = 101;
			//j의 의미는 어떤 언소를 i번째에 넣을지 결정 / 최솟값 찾기.
			for(int j = i+1 ; j < arrSize; j++)
			{
				if(minNumber > myArr[j])
				{
					minNumber = myArr[j];
					minIdx = j;
				}
			}
			
			if(minNumber < myArr[i])
			{
				tmp = myArr[i];
				myArr[i] = myArr[minIdx];
				myArr[minIdx] = tmp;
			}
		}
		System.out.print("배열 후 정렬 : ");
		for(int i = 0 ; i < arrSize; i++)
		{
			System.out.print(myArr[i] + " ");
		}
		
		
		sc.close();
	}

}
