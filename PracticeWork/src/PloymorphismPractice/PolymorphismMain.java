package PloymorphismPractice;

class Movie{
	private String name;

	public Movie(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public String Plot()
	{
		return "No plot in here";
	}
}
class HeraPheri extends Movie{

	public HeraPheri() {
		super("Hera Pheri");
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public String Plot() {
		// TODO Auto-generated method stub
		return "This is Comdey Film";
	}
	
} 

class Interstaller extends Movie{

	public Interstaller() {
		super("Interstaller");
		// TODO Auto-generated constructor stub
	
	}

	@Override
	public String Plot() {
		// TODO Auto-generated method stub
		return "This Movie is related to space time complexity";
	}
	
}

class ErtugurulResurection extends Movie{

	public ErtugurulResurection() {
		super("Ertugrul Resurrection");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String Plot() {
		// TODO Auto-generated method stub
		return "This is a serial regarding Ertugrul who conquered Istanbul";
	}
	
	
}

class Inception extends Movie
{

	public Inception() {
		super("Inception");
		// TODO Auto-generated constructor stub
	}
	public String Plot()
	{
		return "This Movie is related to ingesting Dream in a person mind";
	}
	
	}
class Nothing extends Movie{

	public Nothing() {
		super("Nothing Movie");
		// TODO Auto-generated constructor stub
	}
	
}
public class PolymorphismMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1;i<11;i++)
		{
			Movie movie=randomMovie();
			System.out.println("Movie # "+ i +
								": "+movie.getName()+ "\n" +
								"Plot :"+movie.Plot()+ "\n");
		}
		

	}
	
	public static Movie randomMovie()
	{
		int randomNumber=(int)(Math.random()*5)+1;
		System.out.println("Random number genrated was: " + randomNumber);
		switch (randomNumber) {
		case 1:
			return new HeraPheri();
		case 2:
			return new Interstaller();
		case 3:
			return new ErtugurulResurection();
		case 4:
			return new Inception();
		case 5:
			return new Nothing();
		}
		return null;
	}
	

}
