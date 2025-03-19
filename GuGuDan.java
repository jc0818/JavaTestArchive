
public class GuGuDan {

	public static void main(String[] args) {
		int iFirstDan;
		int iRes;
		int iCnt;
		int iMul;
		
		for(int k = 0; k < 3; ++k)
		{
			iMul = k * 3;
			for(int j = 0; j<9; ++j)
			{
				iCnt = j + 1;
				for(int i = 0; i<3; ++i)
				{
					iFirstDan = iMul + i + 1;
					iRes = iFirstDan * iCnt;
					if(iRes < 10)
					{
						System.out.print( iFirstDan + " X " + iCnt + " =  " + iRes +"  ");	
					}else {
						System.out.print( iFirstDan + " X " + iCnt + " = " + iRes +"  ");					
					}
					
				}
				System.out.println("");
			}
			System.out.println("=========================================");
		}
	}
}
