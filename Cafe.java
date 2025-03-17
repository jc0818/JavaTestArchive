import java.util.Scanner;

public class Cafe {

	public static void main(String[] args) {
		int iCheckNum = 0;
		Scanner sc = new Scanner(System.in);
		//WHile 문은 몇번 반복할지 모르고 특정 조건을 달성 할떄 씀
		//for문은 몇번 반복할지 알때 사용 
		
		while(true)
		{
			System.out.println("나의 작은 카페 메뉴");
			System.out.println("=====================");
			System.out.println("1. 에스프레소    1500원");
			System.out.println("2. 아메리카노    2000원");
			System.out.println("3. 카페라떼     2500원");
			System.out.println("4. 아이스티     3000원");
			System.out.println("=====================");
			System.out.print("메뉴를 선택 (0: 정산) :  ");
			
			iCheckNum = sc.nextInt();
			if(iCheckNum == 0)
			{
				System.out.println("정산 합니다.");
				break;
			}
			switch (iCheckNum) {
			case 1:{
				System.out.println("에스프레소 1잔 판매 1500원 매출증가");
				break;
			}
			case 2:{
				System.out.println("아메리카노 1잔 판매 2000원 매출증가");
				break;
			}
			case 3:{
				System.out.println("카페라떼 1잔 판매 2500원 매출증가");
				break;
			}
			case 4:{
				System.out.println("아이스티 1잔 판매 3000원 매출증가");
				break;
			}
			default:
				System.out.println("그런거 안판다");
				break;
			}
		}
				
		sc.close();
		return;
	}
}
