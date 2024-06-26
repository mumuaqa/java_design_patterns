package AbstractClass;

import StrategyInterface.FlyBehavior;
import StrategyInterface.QuackBehavior;


public abstract class Duck {



    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }



    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

      protected FlyBehavior flyBehavior;  //在不加protected的情况下，默认是private，子类无法使用
     protected   QuackBehavior quackBehavior;


    public void swim() {

        System.out.println("不管是什么鸭子，总会是游泳的");

    }

    public abstract void display();


    public void performQuack() {
        quackBehavior.quack();
    }


    public  void performFly(){
        flyBehavior.fly();
    }

}








