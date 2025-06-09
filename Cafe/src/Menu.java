import java.util.HashMap;

import java.util.Set;

public class Menu {
	private HashMap<String, Integer> myMenu;

	
	public Menu()
	{
		myMenu.put("에스프레소", 1500);
		myMenu.put("아메리카노", 2000);
		myMenu.put("카페라떼", 2500);
		myMenu.put("아이스티", 3000);
	}
	
	
	public Object addNewMenu(String menuName, int menuPrice)
	{
		if(!myMenu.containsKey(menuName))
		{
			return myMenu.put(menuName, menuPrice);
		}else 
			return null;
		
		
	}
	
	public void delMenu(String menuName)
	{
		if(myMenu.containsKey(menuName))
		{
			myMenu.remove(menuName);
		}
	}
	
	public Integer setMenuPrie(String menuName,int reset)
	{
		return myMenu.replace(menuName, reset);
	}
	
	public int getMenuPrice(String menuName) {
		return myMenu.get(menuName);
	}
	
	public Set<String> getMenuList()
	{
		return myMenu.keySet();
	}
}
