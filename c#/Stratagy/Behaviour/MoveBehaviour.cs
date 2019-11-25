using Strategy.Interfaces;
using System;

namespace Strategy.Behaviour
{
    public class MoveBehaviour : IMoveBehaviour
    {
        public void Move()
        {
            Console.WriteLine("I'm moving!");
        }
    }
}
