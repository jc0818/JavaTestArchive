
public class MyTriangle {
	TriPoint p1,p2,p3;
	
	public MyTriangle() {
		this.p1 = new TriPoint(0,0);
		this.p2 = new TriPoint(0,0);
		this.p3 = new TriPoint(0,0);
	}
	
	public MyTriangle(TriPoint p1,TriPoint p2,TriPoint p3)
	{
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}
	
	public double Distance() {
	    double d1 = Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
	    double d2 = Math.sqrt(Math.pow(p2.getX() - p3.getX(), 2) + Math.pow(p2.getY() - p3.getY(), 2));
	    double d3 = Math.sqrt(Math.pow(p3.getX() - p1.getX(), 2) + Math.pow(p3.getY() - p1.getY(), 2));
	    
	    return d1 + d2 + d3; // 둘레 반환
	}
	
	public boolean check() {
	    double d1 = Math.pow(Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2)), 2);
	    double d2 = Math.pow(Math.sqrt(Math.pow(p2.getX() - p3.getX(), 2) + Math.pow(p2.getY() - p3.getY(), 2)), 2);
	    double d3 = Math.pow(Math.sqrt(Math.pow(p3.getX() - p1.getX(), 2) + Math.pow(p3.getY() - p1.getY(), 2)), 2);

	    // 세 변 중 가장 긴 걸 찾아야 해
	    double max = Math.max(d1, Math.max(d2, d3));

	    double sumOfSquares = d1 + d2 + d3 - max; // 나머지 두 변의 제곱 합

	    return Math.abs(sumOfSquares - max) < 0.0001; // 피타고라스 성립하면 직각
	}


}
