package UdemyExcercises;

import java.util.ArrayList;

public class GroceryList {
	private ArrayList<String> grocerList=new ArrayList<String>();
	
	public void addGroceryItem(String Item)
	{
		grocerList.add(Item);
	}
	
	
	public ArrayList<String> getGrocerList() {
		return grocerList;
	}


	public void PrintGroceryList()
	{
		System.out.println("You have " +grocerList.size()+" Items in your grocery List");
		for(int i=0;i<grocerList.size();i++)
			System.out.println((i+1)+". "+grocerList.get(i));
	}
	/*Adding overloading method ModifyingGroceryItem
	 * */
	public void modifyGroceryItem(String currentItem,String newItem)
	{
		int position=findItem(currentItem);
		if(position>=0)
		{
			modifyGroceryItem(position,newItem);
		}
	}

	private void modifyGroceryItem(int position, String newItem)
	{
		grocerList.set(position, newItem);
		System.out.println("Grocery Item "+ (position)+ " Has been modified .");
	}
	
	public void removeGroceryItem(String item){
		int position=findItem(item);
		if(position>=0)
		{
			removeGroceryItem(position);
		}
	}
	private void removeGroceryItem(int position)
	{
		//String theItem=grocerList.get(position);
		grocerList.remove(position);
	}
	private int findItem(String searchItem)
	{
		//boolean exists = grocerList.contains(searchItem);
	
		//int position=grocerList.indexOf(searchItem);
		//if(position >=0)
		return grocerList.indexOf(searchItem);
	}
	public boolean onFile(String searchItem) {
		int position=findItem(searchItem);
		if(position>=0)
		{
			return true;
		}
		return false;
	}
}

