import ducs.MallarDuck;
import ducs.RedHeadDuck;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        RedHeadDuck redHeadDuck = new RedHeadDuck();
        redHeadDuck.swim();
        redHeadDuck.display();

        MallarDuck mallarDuck = new MallarDuck();
        mallarDuck.swim();
        mallarDuck.display();
    }
}