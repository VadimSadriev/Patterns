using FactoryMethod.Models.Base;
using System;
using System.Collections.Generic;

namespace FactoryMethod
{
    class Program
    {
        /// <summary>
        /// Factory method defines interface for creation objects 
        /// but delegates to subclasse which type of class to create
        /// </summary>
        static void Main(string[] args)
        {
            var god = new AngelCreator();
            var devil = new DemonCreator();

            var creatures = new List<Creature>
            {
                god.CreateCreature("Lucifer"),
                devil.CreateCreature("Lilith")
            };

            foreach (var creature in creatures)
            {
                Console.WriteLine(creature.Name);
            }

            Console.ReadKey();
        }
    }
}
