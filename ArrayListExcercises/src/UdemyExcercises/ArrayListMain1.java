package UdemyExcercises;

import java.util.Scanner;

public class ArrayListMain1 {
	private static Scanner scanner=new Scanner(System.in);
	private static GroceryList groceryLsit=new GroceryList();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean quit=false;
		int choice=0;
		printInstructions();
		while(!quit)
		{
			System.out.println("Enter your choice: ");
			choice=scanner.nextInt();
			scanner.nextLine();
			
			switch(choice) {
			case 0:
				printInstructions();
				break;
			case 1:
				groceryLsit.PrintGroceryList();
				break;
			case 2:
				addItem();
				break;
			case 3:
				modifyItem();
				break;
			case 4:
				removeItem();
				break;
			case 5:
				searchForItem();
				break;
			case 6:
				quit=true;
				System.out.println("Quiting this application");
				break;
				
			}
		}

	}
	public static void printInstructions()
	 {
		System.out.println("\n Press ");
		System.out.println("\t 0- To Print choice options.");
		System.out.println("\t 1-To print List of grocery Items.");
		System.out.println("\t 2-To add as item to the list ");
		System.out.println("\t 3-To modify an item in the list");
		System.out.println("\t 4-To remove an item from the list");
		System.out.println("\t 5-To search for an item in the list");
		System.out.println("\t 6-To quit the application.");
	 }
	
	public static void addItem()
	{
		System.out.println("Please enter the grocery item: ");
		groceryLsit.addGroceryItem(scanner.nextLine());
	}
public static void modifyItem()
{
	System.out.println("Enter Item Number: ");
	int itemNo=scanner.nextInt();
	scanner.nextLine();
	System.out.println("Enter replacement Item: ");
	String newItem=scanner.nextLine();
	groceryLsit.modifyGroceryItem(itemNo-1, newItem);
	}

public static void removeItem()
{
	System.out.println("Enter Item Number: ");
	int itemNo=scanner.nextInt();
	scanner.nextLine();
	groceryLsit.removeGroceryItem(itemNo-1);
	System.out.println("Your Item "+itemNo+" has been removed successfully ");
	}

public static void searchForItem()
{
	System.out.println("Item to search for: ");
	String searchItem=scanner.nextLine();
	if(groceryLsit.findItem(searchItem)!=null)
	{
		System.out.println("Found "+ searchItem + " In our grocery List");
		
	}
	else
	{
		System.out.println(searchItem+"Is not in the shopping list ");
	}
	}
}
