
import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		String id[] = new String[5];
		Scanner sc = new Scanner(System.in);
		int c = 0;
		String In = "";
		for(int i = 0; i < 5; ++i)
		{
			c = i+1;
			System.out.print("유저 아이디 입력 " + c +": ");
			id[i] = sc.next();
		}
		System.out.print("로그인: ");
		In = sc.next();
		try {
			validateUserId(id,In);		
		}catch (Exception e) {
			System.out.print("로그인 실패");
		}
		
		sc.close();
	}

	public static String validateUserId(String[] id, String in) throws Exception {
			for(int i = 0; i < 5; ++i)
			{
				if(id[i].equals(in))
				{
					System.out.print("로그인 성공");
					return in;	
				}
			}
		
			throw new Exception();
	}

}
