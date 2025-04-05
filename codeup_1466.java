import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int iHight,iWidth;
        Scanner sc = new Scanner(System.in);
        
        iHight = sc.nextInt();
        iWidth = sc.nextInt();
        int iMax = iHight * iWidth;
        int iCnt = 0;
        int[][] iArray = new int[iHight][iWidth];
        iCnt = iMax;
        for(int i = 0; i < iHight; ++i)
        {
        	for(int j = 0; j < iWidth; ++j)
        	{
        		iArray[i][j] = iCnt;
        		iCnt -= iHight;
        	}
        	iCnt = iMax - i-1;
        	
        }//된거 아님? 
        
        //출력 부분
        for(int i = 0; i < iHight; ++i)
        {
        	for(int j = 0; j < iWidth; ++j)
        	{
        		System.out.print(iArray[i][j] + " ");
        	}
        	System.out.println("");
        }
        
    }
}
