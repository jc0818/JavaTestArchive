import java.util.Scanner;
//김도연 꼴에 경력 1년차라고 함수 훈수 두는데 지리긴 하노. 
public class Main {
	static int iFirst;
	static int iCnt;
	static int iMul;

	public static void main(String[] args) {

		for (int k = 0; k < 3; ++k) {
			iMul = k * 3;
			for (int j = 0; j < 9; ++j) {
				iCnt = j + 1;
				for (int i = 0; i < 3; ++i) {
					iFirst = iMul + i + 1;
					print99(iFirst, iCnt);
				}
				System.out.println("");
			}
			System.out.println("======================================");
		}
	}

	public static void print99(int iFirst, int iCnt) {// ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ
		int iRes;
		iRes = iFirst * iCnt;
		if (iRes < 10) {
			System.out.print(iFirst + " X " + iCnt + " =  " + iRes + " | ");
		} else {
			System.out.print(iFirst + " X " + iCnt + " = " + iRes + " | ");
		}
	}

}
