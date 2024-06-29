package StrategyInterfaceClass;

import StrategyInterface.QuackBehavior;


public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("不会叫哦");
    }
}
