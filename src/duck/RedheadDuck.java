package duck;

public class RedheadDuck extends Duck{
	   public RedheadDuck() {
		   QuackBehavior = new MuteQuack();
			FlyBehavior = new FlyNoWay();
		   }
	   @Override
		public void swim() {
			// TODO Auto-generated method stub
			System.out.println("RedHeadDuck�ǻ���Ӿ��Ѽ��");
		}

		@Override
		public void display() {
			// TODO Auto-generated method stub
			System.out.println("��ֻѼ����RedHeadDuck");
		}
}