package DesignPatterns.ObserverDesignPatterns;

public interface Publisher {

	void register(Observer observer);
	void deregister(Observer observer);
	
	void notifyObserver();
}
