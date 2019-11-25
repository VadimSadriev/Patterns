using Watcher.Models;

namespace Watcher
{
    public interface IObserver
    {
        void Update(TweeterUser user);
    }
}
