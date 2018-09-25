package DesignPatterns.FactoryDesignPattern;

public class EnemyShip {
	
	String name;
	double amtDamage;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmtDamage() {
		return amtDamage;
	}
	public void setAmtDamage(double amtDamage) {
		this.amtDamage = amtDamage;
	}

	
	public void msgHero() {
		System.out.println(getName()+" Is a hero");
	}
}
