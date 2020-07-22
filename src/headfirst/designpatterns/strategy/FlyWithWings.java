package headfirst.designpatterns.strategy;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我真的会飞");
    }
}
