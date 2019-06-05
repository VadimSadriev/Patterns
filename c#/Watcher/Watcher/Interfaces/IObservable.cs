using System;
using System.Collections.Generic;
using System.Text;

namespace Watcher.Interfaces
{
    public interface IObservable
    {
        void AddObserver(IObserver obs);
        void RemoveObserver(IObserver obs);
        void NotifyObservers();
    }
}
