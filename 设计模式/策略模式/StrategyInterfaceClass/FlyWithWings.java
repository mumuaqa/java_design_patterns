package StrategyInterfaceClass;

import StrategyInterface.FlyBehavior;


public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println(" 我正在使用翅膀高飞");
    }
}
