package MovieProgram;

import java.util.Scanner;

public class MovieMain {

	public static void main(String[] args) {
		
		int check = 0;
		Scanner sc = new Scanner(System.in);
		ReservationManager RM = new ReservationManager();
		while(true)
		{
			prnInfo();
			check = sc.nextInt();
			if(check == 5)
			{
				System.out.println("종료");
				break;
			}
			
			if(check == 1)
			{
				String name;
				System.out.println("고객 이름 : ");
				name = sc.next();
				RM.addCustmor(name);
			}else if(check == 2)
			{
				int time;
				String title,gern,CustmorName;
				
				CustmorName = sc.next();
				title = sc.next();
				time = sc.nextInt();
				gern = sc.next();
				
				
				RM.listMovieAdd(CustmorName, title, time, gern);
			}else if(check == 3)
			{
				System.out.println(RM.printAllreservations());
			}else
			{
				String name;
				System.out.println("고객 이름 : ");
				name = sc.next();
				String gern;
				
				gern = sc.next();
				System.out.println(RM.printMoviesByGenre(name,gern));
			}
		}
	}
	
	private static void prnInfo() {
		System.out.println("영화 예약 프로그램");
		System.out.println("1. 고객추가");
		System.out.println("2. 영화예약");
		System.out.println("3. 전체 예약 출력");
		System.out.println("4. 특정 장르 보기");
		System.out.println("5. 종료");
		System.out.println("\n메뉴 입력 >> ");
	}

}
