import java.util.Scanner;

public class CmyMain {

	public static void main(String[] args) {
		Scanner oInDev;
		int iArea;
		CmyRectangle oRect1, oRect2;

		oInDev = new Scanner(System.in);
		System.out.println("1st 사각형의 정보를 입력하세요.");
		oRect1 = getRectangle(oInDev);
		System.out.println("2nd 사각형의 정보를 입력하세요.");
		oRect2 = getRectangle(oInDev);

		iArea = getAreaOverlap(oRect1, oRect2);
		System.out.println("두 사각형의 중첩된 영역의 면접은 : " + iArea);
		oInDev.close();

	}

	private static int getAreaOverlap(CmyRectangle oRect1, CmyRectangle oRect2) {
		int iArea = 0;
		int x1, x2, y1, y2;
		CmyRectangle oOverLapRect;

		x1 = oRect2.FirstX();
		y1 = oRect2.FirstY();
		x2 = oRect1.SecondX();
		y2 = oRect1.SecondY();

		oOverLapRect = new CmyRectangle(x1, y1, x2, y2);

		iArea = oOverLapRect.getSquSize();

		return iArea;

	}

	public static CmyRectangle getRectangle(Scanner oInDev) {

		CmyRectangle oRect;
		int x1, y1, x2, y2;

		while (true) {
			x1 = oInDev.nextInt();
			y1 = oInDev.nextInt();

			while (true) {
				x2 = oInDev.nextInt();
				y2 = oInDev.nextInt();

				if ((x1 < x2) && (y1 > y2)) {
					break;
				} else {
					System.out.println("다시 입력 하세요. 정사각형 조건과 맞지 않습니다. ");
				}
			}
			oRect = new CmyRectangle(x1, y1, x2, y2);
			if (oRect.checkSqu() == false) {
				System.out.println("정사각형 아님.");
			} else {
				break;
			}
		}
		return oRect;
	}

}
