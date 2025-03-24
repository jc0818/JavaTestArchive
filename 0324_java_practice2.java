import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int iRandom = (int)(Math.random()*100)+1;
		int iCount = 0;
		int iInput = 0;
		System.out.println(iRandom);//Check
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			iCount++;
			System.out.print("수를 맞춰보세요 :  ");
			iInput = sc.nextInt();
			if(iInput == iRandom)
			{
				System.out.println(iCount + "번 시도 만에 찾았습니다.");
				break;
			}
			if(iInput > iRandom)
			{
				System.out.println("작은 수를 입력하세요.");
				
			}else if(iInput < iRandom)
			{
				System.out.println("큰 수를 입력하세요.");
				
			}
		}
		
		return;
	}
}
