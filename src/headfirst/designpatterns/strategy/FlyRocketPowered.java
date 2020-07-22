package headfirst.designpatterns.strategy;

/**
 * @author Administrator
 */
public class FlyRocketPowered implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println("我正在用火箭飞行");
	}
}
