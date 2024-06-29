package DuckClass;

import AbstractClass.Duck;
import FlyDog.DogFly;
import StrategyInterfaceClass.FlyWithRocekt;
import StrategyInterfaceClass.QuckWithTools;


public class miniDuckSimulator {


    public static void main(String[] args) {
        Duck modeDuck= new ModeDuck();
        modeDuck.display();
//        modeDuck.swim();
        modeDuck.performFly();
        modeDuck.performQuack();


        modeDuck.setFlyBehavior(new FlyWithRocekt());
        modeDuck.performFly();

        modeDuck.setQuackBehavior(new QuckWithTools());
        modeDuck.performQuack();
    }
}
