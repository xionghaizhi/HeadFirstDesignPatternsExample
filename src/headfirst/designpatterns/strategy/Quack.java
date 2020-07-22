package headfirst.designpatterns.strategy;

/**
 * @author Administrator
 */
public class Quack implements QuackBehavior {
	@Override
	public void quack() {
		System.out.println("呱呱呱叫");
	}
}
