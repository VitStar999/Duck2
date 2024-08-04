import ducs.DecoyDuck;
import ducs.MallarDuck;
import ducs.RedHeadDuck;
import ducs.RubberDuck;


public class Main {
    public static void main(String[] args) {


        MallarDuck mallarDuck = new MallarDuck();
        mallarDuck.display();
        mallarDuck.FlyBehavior();
        mallarDuck.performQuack();


        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.FlyBehavior();
        rubberDuck.performQuack();

    }
}