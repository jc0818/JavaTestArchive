
public class Circle {
	public int iRadius;
	public String sName;
	
	
	public Circle() {//클래스의 생성자는 임의로 호출 할 수 없다. 그래서 리턴 타입을 기재 하지 않음. 
		iRadius = 0;
		sName = "";
		
	}
}





public class CircleTest {

	public static void main(String[] args) {
		Circle oCircle;//클래스는 앞에가 대문자
		
		oCircle = new Circle(); //Circle 클래스의 생성자 
		
		oCircle.iRadius = 10;
		oCircle.sName = "ASDW";
		
		System.out.println(oCircle.iRadius + "인 원 " + oCircle.sName);
				
				
		

	}

}




