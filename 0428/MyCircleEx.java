import java.util.Scanner;

public class MyCircleEx {

	public static void main(String[] args) {
		MyCircle C1;
		MyCircle C2;
		int iX=0,iY=0,iRadius=0;
		Scanner sc = new Scanner(System.in);
		
		C1 = getCircleInfo(sc);
		C2 = getCircleInfo(sc);
		
		sc.close();
		
		if(check(C1,C2))
		{
			System.out.println("("+C1.getX() + "," + C1.getY() + ") 좌표의 반지름이 " + C1.getRadius() + "인 원과 \n" + "("+C2.getX() + "," + C2.getY() + ") 좌표의 반지름이 " + C2.getRadius() + "인 원은 겹침." );
		}else
		{
			System.out.println("("+C1.getX() + "," + C1.getY() + ") 좌표의 반지름이 " + C1.getRadius() + "인 원과 \n" + "("+C2.getX() + "," + C2.getY() + ") 좌표의 반지름이 " + C2.getRadius() + "인 원은 겹치지 않음." );
		}
		
		
	}
	
	
	
	public static MyCircle getCircleInfo(Scanner sc)
	{
		int iX,iY,iRadius;
		System.out.print("원점의 x좌표 y좌표 반지름 길이를 입력하세요 : ");
		iX = sc.nextInt();
		iY = sc.nextInt();
		iRadius = sc.nextInt();
		return new MyCircle(iX,iY,iRadius);
	}
	
	public static boolean check(MyCircle C1, MyCircle C2)
	{
		boolean bCheck = false;
		int iSum,iDis,iGetX,iGetY;
		
		iGetX = (C1.getX() - C2.getX());//X좌표끼리 차이
		iGetY = C1.getY() - C2.getY(); // Y좌표끼리 차이
		iSum = C1.getRadius() + C2.getRadius();// 반지름의 합
		iDis = (iGetX * iGetX) + (iGetY * iGetY);//거리구하기 루트까지 씌워야하는데 그게 귀찮으면 반지름을 제곱 하셈.
		
		iSum = iSum * iSum;
		
		if(iDis < iSum)
		{
			return bCheck = true;
		}else
		{
			return bCheck = false;
		}
	}

}
