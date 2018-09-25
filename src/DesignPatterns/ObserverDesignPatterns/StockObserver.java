package DesignPatterns.ObserverDesignPatterns;

public class StockObserver implements Observer {

	private double ibmPrice;
	private double googlePrice;
	private double microsoftPrice;
	
	private static int observerIdTracker=0;
	private int observerId;
	
	private StockGrabber stockGrabber;
	
	public StockObserver(StockGrabber stockGrabber) {
		this.stockGrabber = stockGrabber;
		this.observerId= observerIdTracker++;
		stockGrabber.register(this);
	}
	
	@Override
	public void update(double ibmPrice, double googlePrice, double microsoftPrice) {
		
		this.ibmPrice= ibmPrice;
		this.googlePrice= googlePrice;
		this.microsoftPrice= microsoftPrice;
		
		printPrice();
	}

	private void printPrice() {
		// TODO Auto-generated method stub
		System.out.println(observerId + " IBM Price"+ ibmPrice + "\n Google Price" + googlePrice + "\n Microsoft Price" + microsoftPrice);

	}

}
