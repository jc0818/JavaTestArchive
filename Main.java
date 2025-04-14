import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Rectangles rt;
		Circle cr;
		int radius = 0,a,b;
		System.out.print("반지름을 입력하세요: ");
		
		Scanner sc = new Scanner(System.in);
		radius = sc.nextInt();
		
		cr = new Circle(radius);
		
		System.out.println("원의 넓이: " + cr.getArea());
		rt = new Rectangles();
		System.out.print("밑변과 넓이를 입력하세요: ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		rt.setWidth(a);
		rt.setHeigh(b);
		
		System.out.println("직사각형 넓이 : " + rt.getArea());
		sc.close();
	}

}
