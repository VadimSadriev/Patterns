using Strategy.Interfaces;
using System;

namespace Strategy.Behaviour
{
    class CharmSpellBehaviour : ISpellCastingBehaviour
    {
        public void CastSpell()
        {
            Console.WriteLine("I'm casting a charm spell");
        }
    }
}
