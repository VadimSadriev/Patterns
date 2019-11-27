using Adapter.Interfaces;
using System;

namespace Adapter.Models
{
    public class Ahri : IMage
    {
        public void CastSpell()
        {
            Console.WriteLine($"{this} casting a spell");
        }

        public override string ToString()
        {
            return "Ahri";
        }
    }
}
