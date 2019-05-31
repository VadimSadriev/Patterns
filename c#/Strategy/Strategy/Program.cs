using Strategy.Behaviour;
using Strategy.Interfaces;
using Strategy.Models;
using System;

namespace Strategy
{
    class Program
    {
        /* pattern stratagy defines a family of algorithms,
	    encapsulates each of them and ensures their interchangeability
	    Allows you to modify algorithms regardless of their use on the client side.
	    Finds its use for realization of different variations of behavior */
        static void Main(string[] args)
        {
            var ahri = new Ahri();

            ahri.CastSpell();

            ahri.SetCastSpellBehaviour(new CharmSpellBehaviour());

            ahri.CastSpell();

            ahri.Move();

            ahri.SetMoveBehaviour(new MoveLevitatingBehaviour());

            ahri.Move();

            Console.ReadKey();
        }
    }
}
