package DesignPatterns.StrategyDesignPatterns;

public class Animal {
	
	int width;
	int height;
	String color;
	String type;
	FlyHigh flyHigh;
	
	
	public Animal(int width, int height, String color, String type, FlyHigh flyHigh) {
		// TODO Auto-generated constructor stub
		this.width = width;
		this.height= height;
		this.color=color;
		this.type= type; 
		this.flyHigh = flyHigh;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String getFlyingInfo() {
		return flyHigh.flyDetail();
		
	}
	
}
