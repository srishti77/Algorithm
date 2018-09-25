package DesignPatterns.ObserverDesignPatterns;

import java.text.DecimalFormat;

public class GetStock implements Runnable {

	
	Publisher stockGrabber;
	int startTime;
	String type;
	double price;
	
	GetStock(StockGrabber stockGrabber, int newStarttime, String type, double price){
		
		this.stockGrabber=stockGrabber;
		startTime = newStarttime;
		this.type= type;
		this.price= price;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub

		for(int i=0; i<5; i++) {
			
			try {
				Thread.sleep(2000);
			}
			
			catch(InterruptedException e) {}
			
			double ranNum= (Math.random() * 0.6) - 0.3;
			
			DecimalFormat df= new DecimalFormat("#.##");	
			price= Double.valueOf(df.format(price + ranNum));
			
			if(type == "IBM" ) 
				((StockGrabber)stockGrabber).setIbmPrice(price);
			
			if(type == "Google" ) 
				((StockGrabber)stockGrabber).setGooglePrice(price);

			
			
		}
	}

}
