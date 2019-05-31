using Strategy.Interfaces;
using System;

namespace Strategy.Behaviour
{
    class MoveLevitatingBehaviour : IMoveBehaviour
    {
        public void Move()
        {
            Console.WriteLine("I'm move by levitating!");
        }
    }
}
