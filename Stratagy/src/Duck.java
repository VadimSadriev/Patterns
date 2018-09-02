import Interfaces.*;


public abstract class Duck {
	
protected IFlyBehavior flyBehavior;

protected IQuackBehavior quackBehavior;

//Dynamically set fly behavior
public void setFlyBehavior(IFlyBehavior flyBehavior) {
	this.flyBehavior = flyBehavior;
}

//Dynamically set quack behavior
public void setQuackBehavior(IQuackBehavior quackBehavior) {
	this.quackBehavior = quackBehavior;
}
	
public void performQuack(){
	quackBehavior.quack();
}

public void performFly() {
	flyBehavior.fly();
}

public void swim() {
	
}
}
