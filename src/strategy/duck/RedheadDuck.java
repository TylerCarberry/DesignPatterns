package strategy.duck;

import strategy.fly.FlyBehavior;
import strategy.fly.FlyNoWay;
import strategy.quack.QuackBehavior;
import strategy.quack.Squeak;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        super("Redhead", new Squeak(), new FlyNoWay());
    }

    public RedheadDuck(String name, QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
        super(name, quackBehavior, flyBehavior);
    }
}
