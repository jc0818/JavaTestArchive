import java.util.Scanner;

public class Prob1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sMajor;
		int iNum;
		
		Scanner sc = new Scanner(System.in);
		
		
		
		
			System.out.print("학과 입력 : ");
			sMajor = sc.next();
			System.out.print("학번 입력 : ");
			iNum = sc.nextInt();
			Student S1 = new Student(sMajor,iNum);
			System.out.print("학과 입력 : ");
			sMajor = sc.next();
			System.out.print("학번 입력 : ");
			iNum = sc.nextInt();
			Student S2 = new Student(sMajor,iNum);
		
			System.out.print("============정보==========");
			System.out.println("학과 : "+S1.getMajor());
			System.out.println("힉반 : "+S1.getStuNum());
			
			System.out.println("----------------------");
			
			System.out.println("학과 : "+S2.getMajor());
			System.out.println("힉반 : "+S2.getStuNum());
		
			sc.close();
	}

}
