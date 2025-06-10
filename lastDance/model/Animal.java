package model;

public class Animal {
	private String Name;
	private String Type;
	private String Point;
	
	public Animal(String Name,String Type,String Point)
	{
		this.Name = Name;
		this.Type = Type;
		this.Point = Point;
		
	}
	
	public String getName() {
		return Name;
	}
	
	public String getType() {
		return Type;
	}
	
	public String getPoint() {
		return Point;
	}
	
	@Override
	public String toString() {
		return Name + "|" + Type + "|" + Point;
	}
}
