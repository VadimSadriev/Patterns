package Behavior;
import Interfaces.*;

public class FlyWithWings implements IFlyBehavior{
	
	@Override
	public void fly() {
		System.out.println("Im flying");
		
	}
}
