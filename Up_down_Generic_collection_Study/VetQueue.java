import java.util.LinkedList;


public class VetQueue<T extends Animal>{
	private LinkedList<T> queue = new LinkedList<>();
	
	public void addReservation(T animal)
	{
		queue.addLast(animal);
	}
	
	public T deleteReservation()
	{
		if(!isEmpty())
		{
			return queue.removeLast();
		}
		
		return null;
	}
	
	public boolean isEmpty()
	{
		return queue.isEmpty();
	}
	
	
}
