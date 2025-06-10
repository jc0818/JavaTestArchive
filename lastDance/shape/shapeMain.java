package shape;

import java.util.Scanner;

public class shapeMain {

	public static void main(String[] args) {
		
		int check;
		double r,w,h;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("도형 선택 : (1, 원 2, 사각형) : ");
		check = sc.nextInt();
		if(check == 1)
		{
			System.out.println("반지름 입력 : ");
			r = sc.nextDouble();
			Shape shape = new Circle(r);
			System.out.println("Circle - Area: " + shape.getArea() + ", Perimeter: " + shape.getPerimeter());
		}else if(check == 2)
		{
			System.out.println("가로 입력 : ");
			w = sc.nextDouble();
			System.out.println("세로 입력 : ");
			h = sc.nextDouble();
			
			Shape shape = new Rectangle(w,h);
			System.out.println("Rectangle  - Area: " + shape.getArea() + ", Perimeter: " + shape.getPerimeter());
		} 
		
		
		

	}

}
