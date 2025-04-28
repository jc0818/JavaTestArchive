import java.util.Scanner;

public class Prob1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int iStuSize = 0;
		int iStuNum;
		String sName;
		Member[] mb;
		System.out.print("동아리원 수를 입력하시오 : ");
		iStuSize = sc.nextInt();
		
		mb = new Member[iStuSize];
		
		System.out.println("-------Input Member Information---------------");
		for(int i = 0; i < mb.length; ++i)
		{
			System.out.print("Student ID : ");
			iStuNum = sc.nextInt();
			System.out.print("Student Name : ");
			sName = sc.next();
			mb[i] = new Member(sName,iStuNum);
		}
		System.out.println("-------Member Information---------------");
		for(int i = 0; i < mb.length; ++i)
		{
			//System.out.println("Student ID : " + mb[i].getStuNum());
			//System.out.println("Name : " + mb[i].getName());
			System.out.println(mb[i].toString());
		}
		sc.close();
	
	}

}
