import java.util.Scanner;

public class MyTriangleEx {

    public static void main(String[] args) {
        // 세 점을 만든다
    	TriPoint p1 = null,p2 = null,p3 = null;
    	Scanner sc = new Scanner(System.in);
    	System.out.print("첫번째 점의 x좌표와 y좌표를 입럭하세요 : ");
    	p1 = getInfo(sc);
    		
    	System.out.print("두번째 점의 x좌표와 y좌표를 입럭하세요 : ");
    	p2 = getInfo(sc);
    		
    	System.out.print("세번째 점의 x좌표와 y좌표를 입럭하세요 : ");
    	p3 = getInfo(sc);
    		
        // 삼각형을 만든다
        MyTriangle triangle = new MyTriangle(p1, p2, p3);

        // 둘레 출력
        double perimeter = triangle.Distance();
        System.out.printf("\n\n삼각형의 둘레는: %.2f\n", perimeter);

        // 직각삼각형 여부 체크
        if (triangle.check()) {
            System.out.println("이 삼각형은 직각삼각형입니다.");
        } else {
            System.out.println("이 삼각형은 직각삼각형이 아닙니다.");
        }
    }
    
    public static TriPoint getInfo(Scanner sc)
    {
    	TriPoint MT;
    	int x,y;
    	x = sc.nextInt();
    	y = sc.nextInt();
    	
    	MT = new TriPoint(x, y);
    	return MT;
    }
}
