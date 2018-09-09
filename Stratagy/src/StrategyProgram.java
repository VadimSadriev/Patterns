import Behavior.FlyRocketPowered;

public class StrategyProgram {

	/*pattern stratagy defines a family of algorithms,
	encapsulates each of them and ensures their interchangeability
	Allows you to modify algorithms regardless of their use on the client side.
	Finds its use for realization of different variations of behavior*/
	public static void main(String[] args) {
		
		Duck mallard = new MallardDuck();
		
		mallard.performQuack();
		mallard.performFly();

		System.out.println(mallard.toString());
		Duck model = new ModelDuck();
		
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
		
		DuckyDecoy duckyDecoy = new DuckyDecoy();
		
		duckyDecoy.performQuack();
	}

}
