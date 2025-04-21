import java.util.Scanner;

public class Prob1 {
	//overloading
	public static int getArea(int iRealSq)
	{
		return iRealSq * iRealSq;
	}

	public static int getArea(int iJikSq_Width,int iJikSq_Hight)
	{
		return iJikSq_Width * iJikSq_Hight;
	}

	public static double getArea(double dCircle)
	{
		return dCircle * dCircle * 3.141592;
	}

	public static double getArea(double dTriW, double dTriH)
	{
		return (dTriW * dTriH) * 0.5;
				
	}
	
//정사각형, 직사각형, 원의 넓이, 삼각형의 넓이 구현 사용 필수 : 오버라이딩.
	public static void main(String[] args) {
		int iRealSq = 0;
		int iJikSq_Width = 0, iJikSq_Hight = 0;
		double dCircle = 0.0;
		double dTriW = 0.0 , dTriH = 0.0;
		
		int num = 0;
		double num_double = 0.0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정사각형의 한 변의 길이를 입력: ");
		iRealSq = sc.nextInt();
		num = getArea(iRealSq);
		System.out.println("정사각형 넓이 : " + num);
		
		System.out.print("직사각형 가로,세로의 길이를 입력: ");
		iJikSq_Width = sc.nextInt();
		iJikSq_Hight = sc.nextInt();
		num = getArea(iJikSq_Width,iJikSq_Hight);
		System.out.println("정사각형 넓이 : " + num);
		
		System.out.print("원의 반지름 입력: ");
		dCircle = sc.nextDouble();
		num_double = getArea(dCircle);
		System.out.println("원의 넓이 : " + num_double);
		
		System.out.print("삼각형의 밑변과 높이의 길이를 입력: ");
		dTriW = sc.nextDouble();
		dTriH = sc.nextDouble();
		num_double = getArea(dTriW,dTriH);
		System.out.println("삼각형 넓이 : " + num_double);
		
		sc.close();
	}

}
