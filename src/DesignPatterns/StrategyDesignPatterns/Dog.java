package DesignPatterns.StrategyDesignPatterns;

public class Dog extends Animal{

	Dog(int width, int height, String color, String type){
		super(width, height, color, type, new AnimalCannotFlyHigh());
		
	}
}
