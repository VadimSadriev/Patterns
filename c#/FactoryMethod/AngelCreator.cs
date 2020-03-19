using FactoryMethod.Models;
using FactoryMethod.Models.Base;

namespace FactoryMethod
{
    public class AngelCreator : Creator
    {
        public override Creature CreateCreature(string name) => new Angel(name);
    }
}
