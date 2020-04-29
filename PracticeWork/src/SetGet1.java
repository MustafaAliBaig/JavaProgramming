
public class SetGet1 {
private int Number;
private int Marks;
private String name1;


public void setName1(String name1) {
	
	String testSet=name1.toLowerCase();
	{
		if(testSet.equals("mustafa")||testSet.equals("noor"))
			this.name1 = name1;
	
	else 
		this.name1=" unknown";
	
}
}
public String getName1() {
	return this.name1;
}

public void setMarks(int Marks)
{
	if(Marks==10 || Marks==20)
		
this.Marks=Marks;
	else 
		this.Marks=Marks;
	}
public int getMarks()
{
	return this.Marks;
			
}

}
