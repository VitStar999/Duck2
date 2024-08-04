package ducs;

import ducs.ducksbehavior.quackable.Duck;
import ducs.ducksbehavior.flyable.FlyBehavior;
import ducs.ducksbehavior.quackable.QuackBehavior;

public class RedHeadDuck extends Duck implements FlyBehavior, QuackBehavior {

    @Override
    public void display() {
        System.out.println("Display Red Head");
    }

    @Override
    public void fly() {

    }


    @Override
    public void quack() {

    }
}

