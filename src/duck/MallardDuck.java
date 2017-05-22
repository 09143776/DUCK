package duck;

public class MallardDuck extends Duck{
	public MallardDuck() {
		QuackBehavior = new Quack();
		FlyBehavior = new FlyWithWings();
	}
	   @Override
		public void swim() {
			// TODO Auto-generated method stub
			System.out.println("MallardDuck是会游泳的鸭子");
		}

		@Override
		public void display() {
			// TODO Auto-generated method stub
			System.out.println("这只鸭子是MallardDuck");
		}
	
	

}