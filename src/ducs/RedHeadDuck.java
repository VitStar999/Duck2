package ducs;

import ducs.abstrac.Duck;
import ducs.abstrac.Flyable;
import ducs.abstrac.Quackable;

public class RedHeadDuck extends Duck implements Flyable, Quackable {

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

