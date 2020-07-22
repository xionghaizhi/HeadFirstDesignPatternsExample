package headfirst.designpatterns.strategy;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        // 绿头鸭
        MallardDuck mallard = new MallardDuck();
        FlyBehavior cantFly = () -> System.out.println("我不会飞");
        QuackBehavior squeak = () -> System.out.println("吱吱吱吱吱");
        // 橡皮鸭
        RubberDuck rubberDuckie = new RubberDuck(cantFly, squeak);
        // 诱饵鸭
        DecoyDuck decoy = new DecoyDuck();
        // 模型鸭
        Duck model = new ModelDuck();

        mallard.performQuack();
        rubberDuckie.performQuack();
        decoy.performQuack();

        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
