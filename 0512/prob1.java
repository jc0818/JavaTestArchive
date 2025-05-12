
public class prob1 {

	public static void main(String[] args) {		
		Point p = new Point(1,2);
		System.out.println(p.showPoint());

		ColorPoint cp = new ColorPoint("red",3,4);
		
		System.out.println(cp.showColorPoint());
		System.out.println(p.showPoint());
		
	}

}
