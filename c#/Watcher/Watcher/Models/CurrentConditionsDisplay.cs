using System;
using Watcher.Interfaces;

namespace Watcher.Models
{
    public class CurrentConditionsDisplay : IWeatherObserver
    {
        private float Temperature { get; set; }
        private float Humidity { get; set; }
        private IWeatherObservable WeatherData { get; set; }

        public CurrentConditionsDisplay(IWeatherObservable weatherData)
        {
            WeatherData = weatherData;
            weatherData.AddObserver(this);
        }

        public void Update(float temp, float humidity, float pressure)
        {
            Temperature = temp;
            Humidity = humidity;

            Console.WriteLine($"Current conditions: {Temperature}F degrees and {Humidity}% humidity");
        }
    }
}
