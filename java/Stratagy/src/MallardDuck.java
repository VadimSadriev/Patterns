import Behavior.*;
public class MallardDuck  extends Duck{

	private String name = "mallard";
	
	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	@Override
	public String toString() {
		
		return String.format("I am %s", name);
	}
}
