package duck;

public class FlyNoWay implements FlyBehavior{
	public void fly() {
		System.out.println("这是一只不会飞的鸭子");
	   }
}