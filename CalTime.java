import java.util.Scanner;
//03-12 java CalTime jc
public class CalTime {

	public static void main(String[] args) {
		Scanner oInDev;
		int iTotalSec = 0;
		
		oInDev = new Scanner(System.in);
		System.out.print("양수를 입력 : ");
		iTotalSec = oInDev.nextInt();
		
		int iSec = iTotalSec % 60;
		int iMin = iTotalSec /  60;
		int iHour = iMin / 60;
		
		iMin %= 60; // iMin = iMin % 60
		
		System.out.println("입력된 정수는 " + iTotalSec);
		System.out.print("시간은 " + iHour + "시간 이고 분 은 " + iMin + " 분 입니다.  초는 " + iSec + " 초 입니다");
		
		oInDev.close();
	}
}
