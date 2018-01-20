package strategy.duck;

import strategy.fly.FlyBehavior;
import strategy.quack.QuackBehavior;

public abstract class Duck {

    private String name;
    private QuackBehavior quackBehavior;
    private FlyBehavior flyBehavior;

    public Duck(String name, QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
        this.name = name;
        this.quackBehavior = quackBehavior;
        this.flyBehavior = flyBehavior;
    }

    public void quack() {
        quackBehavior.quack();
    }

    public void fly() {
        flyBehavior.fly();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Duck duck = (Duck) o;

        if (name != null ? !name.equals(duck.name) : duck.name != null) return false;
        if (quackBehavior != null ? !quackBehavior.equals(duck.quackBehavior) : duck.quackBehavior != null)
            return false;
        return flyBehavior != null ? flyBehavior.equals(duck.flyBehavior) : duck.flyBehavior == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (quackBehavior != null ? quackBehavior.hashCode() : 0);
        result = 31 * result + (flyBehavior != null ? flyBehavior.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", quackBehavior=" + quackBehavior +
                ", flyBehavior=" + flyBehavior +
                '}';
    }
}
