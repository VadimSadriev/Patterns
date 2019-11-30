using Decorator.Decorators;
using Decorator.Models;
using System;

namespace Decorator
{
    class Program
    {
        static void Main(string[] args)
        {
            Pizza itallianPizza = new ItalianPizza();

            itallianPizza = new CheesePizza(itallianPizza);

            Console.WriteLine($"Name: {itallianPizza.Name}");
            Console.WriteLine($"Price: {itallianPizza.GetCost()}");

            Console.ReadKey();
        }
    }
}
