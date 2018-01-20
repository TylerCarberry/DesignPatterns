package strategy.duck;

import strategy.fly.FlyBehavior;
import strategy.fly.FlyWithWings;
import strategy.quack.Quack;
import strategy.quack.QuackBehavior;

public class MallardDuck extends Duck {

    public MallardDuck() {
        super("Mallard", new Quack(), new FlyWithWings());
    }

    public MallardDuck(String name, QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
        super(name, quackBehavior, flyBehavior);
    }

}
