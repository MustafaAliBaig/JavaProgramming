package UdemyExcercises;

import java.util.ArrayList;

public class GroceryList {
	private ArrayList<String> grocerList=new ArrayList<String>();
	
	public void addGroceryItem(String Item)
	{
		grocerList.add(Item);
	}
	
	public void PrintGroceryList()
	{
		System.out.println("You have " +grocerList.size()+" Items in your grocery List");
		for(int i=0;i<grocerList.size();i++)
			System.out.println((i+1)+". "+grocerList.get(i));
	}

	public void modifyGroceryItem(int position, String newItem)
	{
		grocerList.set(position, newItem);
		System.out.println("Grocery Item "+ (position+1)+ " Has been modified .");
	}
	public void removeGroceryItem(int position)
	{
		String theItem=grocerList.get(position);
		grocerList.remove(position);
	}
	public String findItem(String searchItem)
	{
		//boolean exists = grocerList.contains(searchItem);
	
		int position=grocerList.indexOf(searchItem);
		if(position >=0)
		{
			return grocerList.get(position);
		}
		return null;
	}
}

