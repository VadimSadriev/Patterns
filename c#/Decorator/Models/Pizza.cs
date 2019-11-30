namespace Decorator.Models
{
    public abstract class Pizza
    {
        public string Name { get; protected set; }


        public Pizza(string name)
        {
            Name = name;
        }
        public abstract int GetCost();
    }
}
