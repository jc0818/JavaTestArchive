import java.util.Scanner;

public class Prob2 {

	public static void main(String[] args) {
		double radius,Height;
		Scanner sc = new Scanner(System.in);
		System.out.printf("반지름 입력: ");
		radius = sc.nextDouble();
		
		
		System.out.printf("높이입력: ");
		Height = sc.nextDouble();
		Cylinder Cy = new Cylinder(new Circle(radius), Height);
		
		System.out.printf("원기둥의 부피는 : %.2f입니다",Cy.calcCylinder());
		
		
		

	}

}
