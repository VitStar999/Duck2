package ducs;

import ducs.abstrac.Duck;
import ducs.abstrac.Flyable;
import ducs.abstrac.Quackable;

public class MallarDuck extends Duck implements Flyable, Quackable {

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
