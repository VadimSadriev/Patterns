package Behavior;
import Interfaces.*;
public class FlyRocketPowered implements IFlyBehavior{
	
	@Override
	public void fly() {
		System.out.println("Im flying with a rocket");
	}
}
