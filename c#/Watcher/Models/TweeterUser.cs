using System;
using System.Collections.Generic;
using Watcher.Interfaces;

namespace Watcher.Models
{
    public class TweeterUser : IObservable, IObserver
    {
        public string Name { get; set; }
        public List<IObserver> Subscribers { get; private set; }

        public List<Tweet> Tweets { get; set; }

        public TweeterUser()
        {
            Subscribers = new List<IObserver>();
            Tweets = new List<Tweet>();
        }

        public TweeterUser(string name)
        {
            Name = name;
            Subscribers = new List<IObserver>();
            Tweets = new List<Tweet>();
        }

        public void Subscribe(IObservable obs)
        {
            obs.AddObserver(this);
        }

        public void AddObserver(IObserver obs)
        {
            Subscribers.Add(obs);
        }

        public void NotifyObservers()
        {
            foreach (var sub in Subscribers)
            {
                sub.Update(this);
            }
        }

        public void Tweet(Tweet tweet)
        {
            Tweets.Add(tweet);
            Console.WriteLine($"{Name} just posted new tweet - {tweet.Theme} \n {new string('-', 25)}");
            NotifyObservers();
        }

        public void RemoveObserver(IObserver obs)
        {
            Subscribers.Remove(obs);
        }

        public void Update(TweeterUser user)
        {
            Console.WriteLine($"{this.Name} just recived new tweet from  {user.Name}\n {new string('-', 25)}");
        }
    }
}
