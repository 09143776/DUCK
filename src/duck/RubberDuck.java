package duck;

public class RubberDuck extends Duck{
	public RubberDuck() {
		QuackBehavior = new Squeak();
		FlyBehavior = new FlyWithRocket();
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("RubberDuck�ǻ���Ӿ��Ѽ��");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("��ֻѼ����RubberDuck");
	}

}