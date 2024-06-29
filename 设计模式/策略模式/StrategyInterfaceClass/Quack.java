package StrategyInterfaceClass;

import StrategyInterface.QuackBehavior;


public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("实现鸭子的呱呱叫");
    }
}
