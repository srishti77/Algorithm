package DesignPatterns.FactoryDesignPattern;

public class EnemyShipFactory {

	public EnemyShip objectCreate(String type) {
		
		if(type.equals("U"))
			return new UFOEnemy("UFO Enemy", 12.34);
		
		else if(type.equals("B"))
			return new BatmanEnemy("Our Batty", 100.01);
		
		else
			return null;
	}
}
