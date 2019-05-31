import Behavior.*;

public class ModelDuck extends Duck{

	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
	
	public void Display() {
		System.out.println("Im model duck");
	}
}
