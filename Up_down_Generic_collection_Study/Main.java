public class Main {

	public static void main(String[] args) {
		VetQueue<Animal> anique = new VetQueue<Animal>();
		
		anique.addReservation(new Dog("멍망이"));
		anique.addReservation(new Cat("묭이"));
		anique.addReservation(new Bird("꼬꼬"));
		anique.addReservation(new Dog("레전드오브"));
		anique.addReservation(new Cat("킹갓"));
		anique.addReservation(new Bird("제네럴"));
		
		while(true)
		{
			
			if(anique.isEmpty())
			{
				break;
			}
			Animal a = anique.deleteReservation();
			a.treat();
			if(a instanceof Dog)
			{
				((Dog) a).Bark();
			}else if(a instanceof Cat)
			{
				
				((Cat) a).Meow();
			}else if(a instanceof Bird)
			{
				
				((Bird) a).Sing();
			}
				
			
				
		}
		
		return;
		
	}
 
}
