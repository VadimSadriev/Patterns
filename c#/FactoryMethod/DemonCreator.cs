using FactoryMethod.Models;
using FactoryMethod.Models.Base;

namespace FactoryMethod
{
    public class DemonCreator : Creator
    {
        public override Creature CreateCreature(string name) => new Demon(name);
    }
}
