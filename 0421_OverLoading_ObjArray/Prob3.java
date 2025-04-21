import java.util.Scanner;

public class Prob3 {
//Student Class Ref.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String name;
		String number;
		int score;
		int iArraySize;
		System.out.print("학생 수 입력 : ");
		iArraySize = sc.nextInt();
		Student[] st = new Student[iArraySize];
		
		for(int i = 0; i < st.length; ++i)
		{
			System.out.print("학생"+(i+1)+" 이름 : ");
			name = sc.next();
			System.out.print("학생"+(i+1)+" 학번 : ");
			number = sc.next();
			System.out.print("학생"+(i+1)+" 성적 : ");
			score = sc.nextInt();
			
			st[i] = new Student(name, number, score);
			
		}
		//print
		System.out.println("=============학생 정보 출력==============");
		for(int i = 0; i < st.length; ++i)
		{
			System.out.println("학생"+(i+1)+": " + st[i].name);
			System.out.println("학생"+(i+1)+": " + st[i].number);
			System.out.println("학생"+(i+1)+": " + st[i].score);
			System.out.println("===========================");
			
			
		}
		
		sc.close();
	}

}
