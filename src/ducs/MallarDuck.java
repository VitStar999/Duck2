package ducs;

import ducs.ducksbehavior.flyable.FlyWithWings;
import ducs.ducksbehavior.quackable.Duck;
import ducs.ducksbehavior.flyable.FlyBehavior;
import ducs.ducksbehavior.quackable.Quack;
import ducs.ducksbehavior.quackable.QuackBehavior;

public class MallarDuck extends Duck implements FlyBehavior, QuackBehavior {


    public MallarDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    @Override
    public void display() {
        System.out.println(" Display Mallardack");
    }

    @Override
    public void quack() {

    }


    @Override
    public void fly() {

    }
}
