package CompositionExample1;

public class Monitor {
	private String model;
	private String manufacturer;
	private int size;
	private Resolution nativeResolution;
	
	public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.size = size;
		this.nativeResolution = nativeResolution;
	}
	
	public void drawPixelAt(int x, int y, String color)
	{
		System.out.println("Drawing Pixel at "+x +" ,"+ y+" in Color" +color);
	}

	public String getModel() {
		return model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public int getSize() {
		return size;
	}

	public Resolution getNativeResolution() {
		return nativeResolution;
	}
	
	

}
