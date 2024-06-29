package StrategyInterfaceClass;

import StrategyInterface.QuackBehavior;


public class QuckWithTools implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("我正在使用虚拟的发声器");
    }
}
