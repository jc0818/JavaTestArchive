import java.util.Scanner;

public class MyCircleEx {
	
	public static String prnCircleInfo(MyCircle oCircle)
	{
		String sPrnMsg;
		
		sPrnMsg = "(" + oCircle.getCircleX() + "," + oCircle.getCircleY() + ")";
		sPrnMsg = sPrnMsg + "좌표의 반지름 " + oCircle.getRadius() + " 인 원";
		
		return sPrnMsg;
	}

	public static void main(String[] args) {
		MyCircle c1,c2;
		boolean bResult;
		String sPrnMsg;
		Scanner sc = new Scanner(System.in);
		
		c1 = getCircleInfo(sc);
		c2 = getCircleInfo(sc);
		sc.close();
		
		bResult = isOverlap(c1, c2);
		if(bResult == true)
		{
			sPrnMsg = prnCircleInfo(c1) + " 과 " + prnCircleInfo(c2) + " 은 겹침.";
		}else
		{
			sPrnMsg = prnCircleInfo(c1) + " 과 " + prnCircleInfo(c2) + " 은 겹치지 않음.";
		}
		System.out.print(sPrnMsg);
		
		
	}
	
	public static MyCircle getCircleInfo(Scanner sc)
	{
		MyCircle oC;
		int x, y, iRadius;
		
		System.out.print("원의 중심점의 X와 y, 그리고 반지름의 길이를 입력 : ");
		x = sc.nextInt();
		y = sc.nextInt();
		iRadius = sc.nextInt();
		
		oC = new MyCircle(x,y,iRadius);
		return oC;
	}
	
	public static boolean isOverlap(MyCircle c1, MyCircle c2)
	{
		boolean bResult = false;
		int X,Y,Sum;
		int dis;
		
		X = c1.getCircleX() - c2.getCircleX();
		Y = c1.getCircleY() - c2.getCircleY();
		Sum = c1.getRadius() + c2.getRadius();
		
		dis = (X * X) + (Y * Y);//2 2
		Sum = Sum * Sum; // 1
		
		if(dis < Sum)
		{
			bResult = true;
		}else
		{
			bResult = false;
		}
		return bResult;
	}

}
