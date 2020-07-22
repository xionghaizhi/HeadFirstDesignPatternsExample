package headfirst.designpatterns.strategy;

/**
 * @author Administrator
 */
public class MuteQuack implements QuackBehavior {
	@Override
	public void quack() {
		System.out.println("<< 安静的小鸭子 >>");
	}
}
