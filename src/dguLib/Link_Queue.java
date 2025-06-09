package dguLib;

import java.util.LinkedList;

public class Link_Queue<T> {
private LinkedList<T> queue;
	
	public Link_Queue()
	{
		queue = new LinkedList<T>();
	}

	public void enQueue(T oItem)
	{
		queue.add(oItem);
	}
	
	public T deQueue()
	{
		T oItem;
		
		
		try {
			oItem = queue.remove();
		
		}catch (Exception e) {
			return null;
		}
		
		return oItem;
		
	}
	

		
		
}

