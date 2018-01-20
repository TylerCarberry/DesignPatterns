package strategy;

import strategy.duck.Duck;
import strategy.duck.MallardDuck;
import strategy.duck.RedheadDuck;
import strategy.fly.FlyNoWay;
import strategy.quack.MuteQuack;

public class StrategyMain {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.quack();
        mallardDuck.fly();

        mallardDuck.setFlyBehavior(new FlyNoWay());
        mallardDuck.fly();


        Duck redheadDuck = new RedheadDuck();
        redheadDuck.quack();
        redheadDuck.fly();

        redheadDuck.setQuackBehavior(new MuteQuack());
        redheadDuck.quack();

    }

}
