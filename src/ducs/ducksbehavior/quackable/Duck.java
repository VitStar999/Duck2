package ducs.ducksbehavior.quackable;

import ducs.ducksbehavior.flyable.FlyBehavior;

public abstract class Duck {

    protected FlyBehavior flyBehavior;

    protected QuackBehavior quackBehavior;


    public void performQuack() {
        quackBehavior.quack();
    }

    public void FlyBehavior() {
        flyBehavior.fly();
    }

    public void swim() {
        System.out.println("swim");
    }


    protected abstract void display();
}
