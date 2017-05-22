package test;
import org.junit.Test;

import duck.*;


public class testduck {
	@Test
	public void RedheadDuck() {
	      Duck RedheadDuck = new RedheadDuck();
	      System.out.println("RedheadDuck---");
	      RedheadDuck.display();
	      RedheadDuck.swim();
	      RedheadDuck.performFly();	
	      RedheadDuck.performQuack();
	      	      
	   }

	@Test
	public void RubberDuck() {
	      Duck RubberDuck = new RubberDuck();
	      System.out.println("RubberDuck---");
	      RubberDuck.display();
	      RubberDuck.swim();
	      RubberDuck.performFly();
	      RubberDuck.performQuack();
	      
	   }
	@Test
	public void MallardDuck() {
	      Duck MallardDuck = new MallardDuck();
	      System.out.println("MallardDuck---");
	      MallardDuck.display();
	      MallardDuck.swim();
	      MallardDuck.performFly();
	      MallardDuck.performQuack();
	      
	      
	   }
	
	
	
	
}
