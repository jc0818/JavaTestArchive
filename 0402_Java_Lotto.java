
public class Lotto {

	public static void main(String[] args) {
		final int Lotto_Len = 6;
		int[] iArray = new int[Lotto_Len];
		int[] iNoRe = new int[46];
		int iRandNo = 0;
		int iminIdx,iminNumber,iTmp,iMinLen;
		
		
		for(int i = 0; i < Lotto_Len; ++i)
		{
			iRandNo = (int)(Math.random() * 45) + 1;
			iNoRe[iRandNo] += 1;
			if(iNoRe[iRandNo] == 1 )
			{
				iArray[i] = iRandNo;				
			}else
			{
				System.out.println("중복 발생 \n" + iRandNo);
				i-=1;
				continue;
			}
		}
		
		System.out.print("배열 값 출력 : ");
		for(int i = 0; i < Lotto_Len; ++i)
		{
			System.out.print( iArray[i] + " ");
		}
		
		System.out.println("");
		System.out.print("===========================");
		System.out.println("");
		
		//selection sort
		for(int i = 0 ; i < Lotto_Len; i++)
		{
			iMinLen = i+1;
			iminIdx = 0;
			iminNumber = 101;
			//J의 의미는 어떤 언소를 I번째에 넣을지 결정 / 최솟값 찾기.
			for(int j = iMinLen ; j < Lotto_Len; j++)
			{
				if(iminNumber > iArray[j])
				{
					iminNumber = iArray[j];
					iminIdx = j;
				}
			}
			
			if(iminNumber < iArray[i])
			{
				iTmp = iArray[i];
				iArray[i] = iArray[iminIdx];
				iArray[iminIdx] = iTmp;
			}
		}
		
		System.out.print("정렬 된 배열 값 출력 : ");
		for(int i = 0; i < Lotto_Len; ++i)
		{
			System.out.print( iArray[i] + " ");
		}
		
		
	}
}
