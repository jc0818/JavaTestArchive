import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class MiniKosk {
//이터레이터 쓰는거 나올수도
	public static void main(String[] args) {
		String selectFunc;
		Scanner sc = new Scanner(System.in);
		
		selectFunc = sc.next();
		
		if(selectFunc.equals("주문시작")) {
			go2Order();
		}else if(selectFunc.equals("정산"))
		{
			go2Buy();
		}
	}

	private static void go2Buy() {
	
		
	}

	private static void go2Order() {
		Menu Hi = new Menu();
		
		
	}
	
	public static void prnMenu(Menu oMenu)
	{
		Set<String> oMenuList;
		
		oMenuList = oMenu.getMenuList();
		
		Iterator<String> oIter = oMenuList.iterator();
		while(oIter.hasNext()) {
			System.out.println();
		}
	}

}
