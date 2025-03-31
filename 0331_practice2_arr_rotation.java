import java.util.Scanner;
public class Practice_2 {

	public static void main(String[] args) {
		int iInput;
		int iRotation;

		int[] result;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력 하세요 : ");
		
		iInput = sc.nextInt();
		int[] arr = new int[iInput];
		
		result = new int[iInput];
		
		System.out.print("회전 방향을 입력 하세요 (0 : 왼쪽, 1 : 오른쪽): ");
		iRotation = sc.nextInt();
		
		if(iRotation == 0) 
			iRotation = -1;
		
		System.out.print("몇번회전? : ");
		
		iRotation = sc.nextInt() * iRotation;
		
		System.out.println(iRotation);
		
		System.out.print("배열의 원소를 입력하세요: ");
		for(int i = 0; i < iInput; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		//arr 5
		//0 ~ 4 5면 0 
		//index = -2면 0번째가 원소 3번째로 옮겨짐
		//iInput + index
		
		// i가 양수면 %연산
		
		for(int i = 0; i< iInput; i++) {
			int idx = i + iRotation;
			if(idx >= 0)
			{
				result[idx % iInput] = arr[i];
			}else {
				result[idx + iInput] = arr[i];
			}
		}
		
		if(iRotation > 0)
		{
			System.out.print("오른쪽으로 회전한 배열 : ");
		}else
		{
			System.out.print("왼쪽으로 회전한 배열 : ");
		}
			
		for(int i = 0; i < iInput; i++) {
				System.out.print(result[i] + " ");
		}
		
	}

}
