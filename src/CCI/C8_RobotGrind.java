package CCI;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Scanner;

public class C8_RobotGrind {
	static int row, column, count=0;
	static String path="0,0";
	
	
	public static void main(String s[]) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the row of the grid");
		row= scan.nextInt();
		
		System.out.println("Enter the column of the grid");
		column= scan.nextInt();
		
		getToTarget(0,0);
		//System.out.println(count);
		

	}
	public static void getToTarget(int i, int j) {
		System.out.println("Value-----"+i+" "+j);
		if(i== row && j== column) {
			count++;
			System.out.println("Path "+path);
			
		}
		if(i<row){
			path=path+" - "+(i+1)+","+j;
			getToTarget(i+1, j);
			
		}
		if(j<column) {
			path=path+" - "+i+","+(j+1);
			getToTarget(i, j+1);	
			
		}
		
	}
	

}
