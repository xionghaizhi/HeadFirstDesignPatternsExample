package headfirst.designpatterns.strategy;

/**
 * @author Administrator
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我还没学会飞行");
    }
}
