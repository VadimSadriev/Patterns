using FactoryMethod.Models.Base;

namespace FactoryMethod
{
    public abstract class Creator
    {
        public abstract Creature CreateCreature(string name);
    }
}
