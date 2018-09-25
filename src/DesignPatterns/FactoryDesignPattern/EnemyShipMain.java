package DesignPatterns.FactoryDesignPattern;

import java.util.Scanner;

public class EnemyShipMain {

	public static void main(String s[]) {
		
		Scanner scan = new Scanner(System.in);
		EnemyShip enemyShip =null;
		EnemyShipFactory enemyShipFactory = new EnemyShipFactory();
		System.out.println("Select your enemy type (U/B)");
		
		String type= scan.nextLine();
		
		enemyShip = enemyShipFactory.objectCreate(type);
		
		if(enemyShip!=null)
			enemyShip.msgHero();
		else
			System.out.println("Invalid Entry");
		
	}
}
