package dguApp;

import dguLib.Link_Queue;
public class QueueMain {

	public static void main(String[] args) {// 메인에서는 T가 사용이 안된다.
		
		
		String sTemp = "";		
		Link_Queue<String> oMyqueue; // T 말고 구체화 시켜서 해야함. Ex : String
		
		oMyqueue = new Link_Queue<String>();
		
		oMyqueue.enQueue("Dongguk");
		oMyqueue.enQueue("Computer");
		
		
		for(int i = 0; i < 5; ++i)
		{
			sTemp = oMyqueue.deQueue();
			
			System.out.println(sTemp);
		}
		
	

	}

	
	
}
