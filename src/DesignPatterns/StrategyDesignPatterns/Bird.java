package DesignPatterns.StrategyDesignPatterns;

public class Bird extends Animal {

	public Bird(int width, int height, String color, String type) {
		super(width, height, color, type, new AnimalFlyHigh());
		// TODO Auto-generated constructor stub
	}

}
