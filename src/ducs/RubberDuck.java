package ducs;

import ducs.abstrac.Duck;
import ducs.abstrac.Quackable;

public class RubberDuck extends Duck implements Quackable {

    @Override
   public void display() {
        System.out.println(" Rubber Duck");
    }



    @Override
    public void quack() {

    }
}
