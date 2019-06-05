using System;
using System.Collections.Generic;
using System.Text;
using Watcher.Interfaces;

namespace Watcher.Models
{
    public class WeatherData : IWeatherObservable
    {
        private float Temperature { get; set; }
        private float Humidity { get; set; }
        private float Pressure { get; set; }

        private List<IWeatherObserver> Observers { get; set; }

        public WeatherData()
        {
            Observers = new List<IWeatherObserver>();
        }

        public void AddObserver(IWeatherObserver obs)
        {
            Observers.Add(obs);
        }

        public void NotifyObservers()
        {
            foreach (var wo in Observers)
            {
                wo.Update(Temperature, Humidity, Pressure);
            }
        }

        public void RemoveObserver(IWeatherObserver obs)
        {
            Observers.Remove(obs);
        }

        public void SetMeasurements(float temperature, float humidity, float pressure)
        {
            Temperature = temperature;
            Humidity = humidity;
            Pressure = pressure;
            NotifyObservers();
        }
    }
}
