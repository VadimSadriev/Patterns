import Behavior.*;
import Interfaces.*;

public class DuckyDecoy {
IQuackBehavior quackBehavior;

	public DuckyDecoy() {
		quackBehavior = new FakeQuack();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
}
