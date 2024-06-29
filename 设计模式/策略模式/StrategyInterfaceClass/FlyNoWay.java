package StrategyInterfaceClass;

import StrategyInterface.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我不会飞哦");
        //业务逻辑
    }
}
