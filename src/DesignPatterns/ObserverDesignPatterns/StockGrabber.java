package DesignPatterns.ObserverDesignPatterns;

import java.util.ArrayList;

public class StockGrabber implements Publisher {

	double ibmPrice;
	double googlePrice;
	double microsoftPrice;
	
	
	ArrayList<Observer> observerList = new ArrayList<Observer>();
	
	StockGrabber(){
		
	}
	
	public double getIbmPrice() {
		return ibmPrice;
	}

	public void setIbmPrice(double ibmPrice) {
		this.ibmPrice = ibmPrice;
		notifyObserver();
	}

	public double getGooglePrice() {
		return googlePrice;
	}

	public void setGooglePrice(double googlePrice) {
		this.googlePrice = googlePrice;
		notifyObserver();
	}

	public double getMicrosoftPrice() {
		return microsoftPrice;
	}

	public void setMicrosoftPrice(double microsoftPrice) {
		this.microsoftPrice = microsoftPrice;
		notifyObserver();
	}

	@Override
	public void register(Observer observer) {
		
		observerList.add(observer);
	}

	@Override
	public void deregister(Observer observer) {
		
		int observerIndex = observerList.indexOf(observer);		
		observerList.remove(observerIndex);
		
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for(Observer observer: observerList)
			observer.update(ibmPrice, googlePrice, microsoftPrice);
	}

}
