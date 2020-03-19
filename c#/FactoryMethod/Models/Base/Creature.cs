namespace FactoryMethod.Models.Base
{
    public abstract class Creature
    {
        public Creature()
        {
        }

        public Creature(string name)
        {
            Name = name;
        }

        public string Name { get; }
    }
}
