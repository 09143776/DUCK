package duck;

public class RedheadDuck extends Duck{
	   public RedheadDuck() {
		   QuackBehavior = new MuteQuack();
			FlyBehavior = new FlyNoWay();
		   }
	   @Override
		public void swim() {
			// TODO Auto-generated method stub
			System.out.println("RedHeadDuck是会游泳的鸭子");
		}

		@Override
		public void display() {
			// TODO Auto-generated method stub
			System.out.println("这只鸭子是RedHeadDuck");
		}
}