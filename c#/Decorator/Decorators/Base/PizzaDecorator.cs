using Decorator.Models;

namespace Decorator.Decorators.Base
{
    public abstract class PizzaDecorator : Pizza
    {
        protected Pizza _pizza;

        public PizzaDecorator(string name, Pizza pizza) : base(name)
        {
            _pizza = pizza;
        }
    }
}
