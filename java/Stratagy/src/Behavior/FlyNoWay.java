package Behavior;
import Interfaces.*;

public class FlyNoWay implements IFlyBehavior{

	@Override
	public void fly() {
		System.out.println("I cant fly");
		
	}
	
}
