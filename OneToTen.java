
public class OneToTen {

	public static void main(String[] args) {
		//For문 안쓴거
		int iCheck = 0;
		int iForNum = 0;
		int iPHDForNum = 0;
		int iNum = 0;
		int iLastNum = 10;
		int iTen = 10;
		
		//등차수열
		iNum = iLastNum * (iLastNum + 1) / 2;
		System.out.println(iNum);
		
		//For문 쓴거***********************
		
		for(int i = 0; i<=10; i++)
		{
			iForNum += i;
		}
		System.out.println(iForNum);
		
		//교수님 for문 ****************************
		
		for(int j = 0; j<iTen; ++j)
		{
			//폴문에 등호 = 가 들어가면 복잡해진다. 
			//밑에처럼 하면 폴문은 그냥 몇번 반복한다. 라고 뜻이 간단해짐
			//그리고 밑에 코드는 결국 iTen의 숫자까지 +1 씩 더해져서 결국 반복한 값이 같다.
			iCheck = j + 1;
			iPHDForNum = iPHDForNum + iCheck;
		}
		System.out.println(iPHDForNum);
		
	}
}
