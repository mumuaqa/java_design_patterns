package DuckClass;

import AbstractClass.Duck;
import StrategyInterfaceClass.FlyNoWay;
import StrategyInterfaceClass.MuteQuack;


class ModeDuck  extends Duck{

    ModeDuck() {

        flyBehavior =new FlyNoWay();
        quackBehavior=new MuteQuack();

    }

    @Override
    public void display() {
        System.out.println("我是模型鸭子");
    }



}


