import ducs.DecoyDuck;
import ducs.MallarDuck;
import ducs.RedHeadDuck;


public class Main {
    public static void main(String[] args) {


        RedHeadDuck redHeadDuck = new RedHeadDuck();
        redHeadDuck.swim();
        redHeadDuck.display();

        MallarDuck mallarDuck = new MallarDuck();
        mallarDuck.swim();
        mallarDuck.display();
        mallarDuck.fly();
        mallarDuck.quack();

        DecoyDuck decoyDuck = new DecoyDuck();
        decoyDuck.display();
        decoyDuck.swim();

    }
}