using Adapter.Interfaces;
using System;

namespace Adapter.Models
{
    public class Ashe : IArcher
    {
        public void LaunchArrow()
        {
            Console.WriteLine($"{this} launches arrow");
        }

        public override string ToString()
        {
            return "Ashe";
        }
    }
}
