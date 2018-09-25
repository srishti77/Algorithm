package DesignPatterns.StrategyDesignPatterns;

public class AnimalDetail {
	
	public static void main(String s[]) {
		
		Dog dog= new Dog(10,20,"White", "mammals");
		
		System.out.println("Dog"+dog.getHeight()+"   "+dog.getColor());
		
		Bird bird = new Bird(20,40, "blue", "areial");
		
		System.out.println("Bird "+bird.getHeight()+"   "+bird.getColor()+ " "+bird.getFlyingInfo());
		
	}
}
