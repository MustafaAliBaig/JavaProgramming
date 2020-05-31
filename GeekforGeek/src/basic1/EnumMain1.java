package basic1;

enum Day{
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,thursday,friday,saturday;
}

public class EnumMain1 {
	/*Notes
	 * 1.Enum is used when we know all possible values during compile time.
	 * The main objective of Enum is to define our own data types 
	 * Every enum constant represents an object of type enum*/
/*Sample program to demonstrate working on Enum is switch case
 * 1.Define enum class Day
 * 2.Usually in java we make us of key word "Class" to define an class 
 * 3.But here we make of enum keyword to make our own named constants
 * 4.here in the below example we DAY as enum class and then we wrote 7 days of the week like sunday monday and soon
 * */
	Day day;
	public EnumMain1(Day day)
	{
		this.day=day;
		
	}
	
	public void myDayLike()
	{
	switch (day) {
	case MONDAY:
		System.out.println("Monday is week day so need more concentration");
		break;
	case saturday:
	case SUNDAY:
		System.out.println("Happy WeekEnd");
		break;
	case friday:
		System.out.println("Weekend just Started :-)");
		break;

	default:
		System.out.println("Please select appropriate Day");
		break;
	}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="MONDAY";
		EnumMain1 day1=new EnumMain1(Day.valueOf(str));
		day1.myDayLike();

	}

}
