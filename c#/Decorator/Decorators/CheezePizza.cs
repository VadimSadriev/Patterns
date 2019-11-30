using Decorator.Decorators.Base;
using Decorator.Models;

namespace Decorator.Decorators
{
    public class CheesePizza : PizzaDecorator
    {
        public CheesePizza(Pizza pizza)
            : base(pizza.Name + ", with cheeze", pizza)
        { }

        public override int GetCost()
        {
            return _pizza.GetCost() + 5;
        }
    }
}
