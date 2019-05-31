using Strategy.Interfaces;
using System;

namespace Strategy.Behaviour
{
    public class FireBallSpellBehaviour : ISpellCastingBehaviour
    {
        public void CastSpell()
        {
            Console.WriteLine("I'm casting a fireball spell!");
        }
    }
}
