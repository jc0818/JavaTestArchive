import java.util.Scanner;

public class Java_Array {
	public static void prnArray(int[] iArray) {
		System.out.print("저장 된 값의 베열은 : ");
		for (int i = 0; i < iArray.length; i++) {
			System.out.print(iArray[i] + " ");
		}
		System.out.println("");
	}

	public static void checkArray(int[] iArray, int ival) {

		if (ival != 0) {
			System.out.print("중복 입력된 값의 츨력 : ");
			for (int i = 0; i < iArray.length; ++i)// 0
			{
				for (int j = 0; j < i; ++j) // 0 ~ 9
				{
					if (iArray[i] == iArray[j])// [1]
					{
						System.out.print(iArray[j] + " ");
					}

				}
			}
			System.out.println("");
		}else
		{
			System.out.print("0~9에서 미입력 값 출력 : ");

			for (int i = 0; i < iArray.length; ++i) {
				if (iArray[i] == ival)
					System.out.print(i + " ");
			}

		}
	}

	public static void getArray(int[] iArray,int[] iCont)
	{
		int cnt=0,iInputVaild;
		Scanner sc = new Scanner(System.in);
		while (true) {
			if (cnt >= 10) {
				break;
			}
			//Try Catch Execption 기능 추가 
			iInputVaild = sc.nextInt();
			iArray[cnt] = iInputVaild;
			iCont[iInputVaild] = iCont[cnt] + 1;

			if (iInputVaild < 0 || iInputVaild >= 10) {
				System.out.print("0~9까지의 정수를 입력 하시오");
				continue;
			}

			++cnt;

		}
	}
	
	//함수로 잘 쪼개서 프로그래밍은 필수 
	public static void main(String[] args) {
		final int ARR_SIZE = 10;
		int[] iArray = new int[ARR_SIZE];
		int[] iCont = new int[ARR_SIZE];
		
		int cnt = 0, iInputVaild = 0;

		for (int i = 0; i < ARR_SIZE; ++i) {
			iCont[i] = 0;
		}

		getArray(iArray, iCont);

		prnArray(iArray);

		checkArray(iArray, 2);
		checkArray(iCont, 0);

	}

}
