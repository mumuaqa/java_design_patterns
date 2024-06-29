package FlyDog;

import AbstractClass.Duck;
import StrategyInterfaceClass.FlyWithRocekt;
import StrategyInterfaceClass.FlyWithWings;

public class DogFly extends Duck {
    @Override
    public void display() {
        System.out.println("我是一只会飞的狗狗");
    }


    public DogFly() {
        flyBehavior =new FlyWithWings();
    }




}
