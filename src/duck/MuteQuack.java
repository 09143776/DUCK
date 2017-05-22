package duck;

public class MuteQuack implements QuackBehavior{
	public void quack() {
		System.out.println("这是一只不会叫的鸭子");
	   }
}