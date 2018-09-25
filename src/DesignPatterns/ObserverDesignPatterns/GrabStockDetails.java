package DesignPatterns.ObserverDesignPatterns;

public class GrabStockDetails {
	
	public static void main(String s[]) {
		
		StockGrabber stockGrabber= new StockGrabber();
		
		StockObserver stockObserver = new StockObserver(stockGrabber);
		
		stockGrabber.setGooglePrice(197.88);
		stockGrabber.setIbmPrice(180.90);//Price(googlePrice);
		stockGrabber.setMicrosoftPrice(187.56);
		
		StockObserver stockObserver1 = new StockObserver(stockGrabber);
		
		stockGrabber.setGooglePrice(187.88);
		stockGrabber.setIbmPrice(170.90);//Price(googlePrice);
		stockGrabber.setMicrosoftPrice(177.56);
		System.out.println("Go for IBM-------------------");
		Runnable getIBM = new GetStock(stockGrabber, 2, "IBM", 201.12);
		System.out.println("Go for google");
		Runnable getGoogle = new GetStock(stockGrabber, 2, "Google", 654.12);
		
		(new Thread(getGoogle)).start();
		(new Thread(getIBM)).start();
		
	}
}
