package duck;

public class RubberDuck extends Duck{
	public RubberDuck() {
		QuackBehavior = new Squeak();
		FlyBehavior = new FlyWithRocket();
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("RubberDuck是会游泳的鸭子");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("这只鸭子是RubberDuck");
	}

}