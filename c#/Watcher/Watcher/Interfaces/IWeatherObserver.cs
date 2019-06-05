namespace Watcher.Interfaces
{
    public interface IWeatherObserver
    {
        void Update(float temp, float humidity, float pressure);
    }
}
