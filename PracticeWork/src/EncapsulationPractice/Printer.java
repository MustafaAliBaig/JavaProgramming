package EncapsulationPractice;

public class Printer {
	private int tonerlevel;
	private int pagesPrinted;
	private boolean duplex;
	public Printer(int tonerlevel, boolean duplex) {
		if(tonerlevel> -1&& tonerlevel<=100) {
		this.tonerlevel = tonerlevel;}
		else {
			this.tonerlevel=-1;
		}
		this.duplex = duplex;
		this.pagesPrinted=0;
	}
	
	public int addToner(int tonerAmount)
	{
		if(tonerAmount>0 && tonerAmount <=100)
		{
			if(this.tonerlevel+tonerAmount>=100) {
				System.out.println(" Toner level exceeded "+gettonerLevel());
				return -1;
				}		
				this.tonerlevel+=tonerAmount;
				return tonerlevel;		
		}
		else 
		{
			System.out.println("Error in Toner please check toner level and toner Amount "+gettonerLevel());
			return -1;
		}
	}
	
	public int gettonerLevel()
	{
		return this.tonerlevel;
	}
	
	public int printPages(int pages)
	
	{
		int pagesToPrint=pages;
		if(this.duplex)
		{
			pagesToPrint=(pages/2)+(pages%2);
			System.out.println("We are printing in Duplex Mode");
		}
		this.pagesPrinted+=pagesToPrint;
		return pagesToPrint;
	}

	public int getPagesPrinted() {
		return pagesPrinted;
	}
	

}
