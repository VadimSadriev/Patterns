namespace Watcher.Interfaces
{
    public interface IWeatherObservable
    {
        void AddObserver(IWeatherObserver obs);
        void RemoveObserver(IWeatherObserver obs);
        void NotifyObservers();
    }
}
