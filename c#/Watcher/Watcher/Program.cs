using System;
using Watcher.Models;

namespace Watcher
{
    class Program
    {
        /*Pattern watcher defines dependency one to many between objects in such
	   a way that when the state of one object changes, all dependent objects
	   are  notificated and updated */
        static void Main(string[] args)
        {
            //var alice = new TweeterUser("Alice");

            //var sophia = new TweeterUser("Sophia");

            //var kira = new TweeterUser("Kira");

            //alice.AddObserver(sophia);

            //alice.AddObserver(kira);

            //alice.Tweet(new Tweet("Strange theme", "strange texxt"));

            //alice.RemoveObserver(kira);

            //alice.Tweet(new Tweet("Tweet kira will not recieve", "hidden text from kira"));

            //kira.Tweet(new Tweet("tweet noone will recieve", "thats bad"));

            //sophia.Subscribe(kira);

            //kira.Tweet(new Tweet("i like games", "games are awesome"));


            WeatherData weatherData = new WeatherData();

            CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);

            weatherData.SetMeasurements(90, 65, 30.4f);

            Console.ReadKey();
        }
    }
}
