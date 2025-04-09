import java.util.Scanner;

public class Cafe {
	public static void prnCafeMenu(String sMenuNameZ[],int iPriceZ[])
	{
		int iMenuCnt;
		
		System.out.println("나의 작은 카페 메뉴");
		System.out.println("=====================");

		for (int i = 0; i < sMenuNameZ.length; ++i) { // 메뉴판출력
			iMenuCnt = i + 1;
			System.out.println(iMenuCnt + ". " + sMenuNameZ[i] + "   " + iPriceZ[i] + " 원");
		}

		System.out.println("=====================");
	}
	
	public static int getMenuNo(int iMenuCnt,int iTotal)
	{
		Scanner sc = new Scanner(System.in);
		int iMenuNo;
		
		while(true) {
			
			System.out.print("메뉴를 선택 (0: 정산) :  ");	
			iMenuNo = sc.nextInt();
			if(iMenuNo > 0 && iMenuNo < iMenuCnt+1)
			{
				break;
			}else if(iMenuNo == 0)
			{
				System.out.println("오늘의 총 매출은 : " + iTotal);
				return 0;
			}else {
				System.out.println("그런거 안판다");
			}
		}
		//sc.close();
		return iMenuNo;
	}
	
	public static int menuPlus(int iCheckNum,int iTotalMoney,String sMenuNameZ[],int iPriceZ[])
	{
		int iMenuIdx;
		
			iMenuIdx = iCheckNum - 1;
			 iTotalMoney = iTotalMoney + iPriceZ[iMenuIdx];
			System.out.println(sMenuNameZ[iMenuIdx] + " 1잔 판매 " + iPriceZ[iMenuIdx] + "원 매출 증가");
			System.out.println(iTotalMoney);
			return iTotalMoney;
		
		

	}
	
	
	

	public static void main(String[] args) {
		int iCheckNum = 0;
		int iMenuCnt;
		int iMenuIdx;
		int iTotalMoney = 0;
		int iPriceZ[] = { 1500, 2000, 2500, 3000, 3500};// 교수님 왈: 변수 뒤에 Z 들어가는건 배열이라고 생각하심.
		String sMenuNameZ[] = { "에스프레소", "아메리카노", "카페라떼", "아이스티", "밀크티" };
		

		while (true) {
			prnCafeMenu(sMenuNameZ, iPriceZ);
			iCheckNum = getMenuNo(sMenuNameZ.length,iTotalMoney);
			if (iCheckNum == 0){
				break;
			}
			iTotalMoney = menuPlus(iCheckNum, iTotalMoney, sMenuNameZ, iPriceZ);
		}
	}
}
