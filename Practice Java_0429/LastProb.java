import java.util.Scanner;

public class LastProb {

	public static void main(String[] args) {
		int iComNum;
		int iRamSize;
		String Check;
		Scanner sc = new Scanner(System.in);
		while(true)
		{
		System.out.print("Input Your Computer OS (1: Windows 7, 2: Apple Mac OS, 3: Android) : ");
		iComNum = sc.nextInt();
		
		System.out.print("Input Your Computer Ram Size : ");
		iRamSize = sc.nextInt();
		
		Computer pc = new Computer(iComNum-1,iRamSize);
		pc.print();
		System.out.print("New Instance? or Quit? (Y/N) ");
		Check = sc.next();
		if(Check.equals("N"))
		{
			break;
		}
		}
		
		System.out.println("Good Bye! :) ");
	}

}
