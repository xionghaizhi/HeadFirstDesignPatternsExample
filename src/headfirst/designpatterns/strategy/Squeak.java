package headfirst.designpatterns.strategy;

/**
 * @author Administrator
 */
public class Squeak implements QuackBehavior {
	@Override
	public void quack() {
		System.out.println("吱吱吱吱");
	}
}
