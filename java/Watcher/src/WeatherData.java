import java.util.ArrayList;

import Interfaces.*;

public class WeatherData implements ISubject{

	private ArrayList<IObserver> observers;
	
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList<IObserver>();
	}
	
	@Override
	public void registerObserver(IObserver observer) {
		if (observer != null) {
			observers.add(observer);
		}
		
	}

	@Override
	public void removeObserver(IObserver observer) {
		
		if (observers.contains(observer)) {
			observers.remove(observer);
		}		
	}

	@Override
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			//IObserver observer = (IObserver)observers.get(i);
			//observer.update(temperature, pressure, pressure);
			observers.get(i).update(temperature, humidity, pressure);
		}
		
	}
	
	public void measurementsChanged() {
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

}
