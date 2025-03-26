import java.util.Scanner;

public class Cafe {

	public static void main(String[] args) {
		int iCheckNum = 0;
		int iMenuCnt;
		int iMenuIdx;
		Scanner sc = new Scanner(System.in);
		// WHile 문은 몇번 반복할지 모르고 특정 조건을 달성 할떄 씀
		// For문은 몇번 반복할지 알때 사용
		int iTotalMoney;
		int iPriceZ[] = { 1500, 2000, 2500, 3000, 3500};// 교수님 왈: 변수 뒤에 Z 들어가는건 배열이라고 생각하심.
		String sMenuNameZ[] = { "에스프레소", "아메리카노", "카페라떼", "아이스티", "밀크티" };
		iTotalMoney = 0;

		while (true) {
			System.out.println("나의 작은 카페 메뉴");
			System.out.println("=====================");

			for (int i = 0; i < sMenuNameZ.length; ++i) { // 메뉴판출력
				iMenuCnt = i + 1;
				System.out.println(iMenuCnt + ". " + sMenuNameZ[i] + "   " + iPriceZ[i] + " 원");
			}

			System.out.println("=====================");
			System.out.print("메뉴를 선택 (0: 정산) :  ");

			iCheckNum = sc.nextInt();
			
			if (iCheckNum == 0) {//사용자 인풋값
				System.out.println("오늘의 총 매출은 : " + iTotalMoney);
				break;
			} else if (iCheckNum >= 1 && iCheckNum <= sMenuNameZ.length) {
				iMenuIdx = iCheckNum - 1;
				iTotalMoney = iTotalMoney + iPriceZ[iMenuIdx];
				System.out.println(sMenuNameZ[iMenuIdx] + " 1잔 판매 " + iPriceZ[iMenuIdx] + "원 매출 증가");
			} else {
				System.out.println("그런거 안판다");
				break;
			}

		}

		sc.close();
		return;
	}
}
