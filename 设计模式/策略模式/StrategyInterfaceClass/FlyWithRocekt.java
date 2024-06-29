package StrategyInterfaceClass;

import StrategyInterface.FlyBehavior;


public class FlyWithRocekt implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我正在使用火箭飞天");
    }
}
