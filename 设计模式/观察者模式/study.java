public class study {
    /**
     * 观察者模式
     * 你是用户、、观察者      你的订阅号是被观测者
     * 当你订阅一个人，对方会发一条消息
     * 你是用户、、观察者      你的订阅号是被观测者
     * 观测者收到观测对象的消息（对象因为发生改变而发出消息）
     *主要是反复调用，一层一层，多重依赖关系
     * a中调用了b，b中调用了c，c中调用了观察者监听器用于发出消息
     * 所以当你使用a时自然最后会调用监听器从而给你发出消息。
     * 总结，就是一层层调用关系，使得最后客户端特别简介，执行一条代码，却调用了特别多代码。
     */
}
