package shapes;

public class Octagon {
	private final int sides = 8;
	private String fillColor;
	private String lineColor;
	
	public Octagon() {}
	
	public void draw() {
		System.out.println("I am drawing an octagon");
		System.out.printf("I have %d sides", sides);
	}
		
	public int getSides() {
		return sides;
	}

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
}
