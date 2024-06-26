public class study {
    /**
     * 组合模式
     * 总的来说，你想要做一个复杂的东西，例如组装一个电脑，想要知道一个区域是由那几部分组成的，和对应价格
     * 但是太过复杂，需要写特别多的类，继承关系复杂
     * 所以用到了组合设计模式
     * 组合设计模式像一个树状图，类似于数据结构中的树。可以清晰的表现所属关系
     * 不需要创建过多的类，只需要创建不同对象，并且用组合体和叶子表示他们就可以。
     * 并且组合模式定义了组件（各最小部分）的接口，后面所有的组合体和叶子（单个体）对象全部继承，
     * 当需要叶子和组合体实现什么功能只需更改接口和实现方法即可，特别方便。
     * 例如组装电脑，电脑由内设（机箱内组件）和外设组成
     * 内设可分为主板和硬盘         外设有 鼠标 摄像头
     * 主板可分为 CPU 和内存
     * 由此这就是一个树状结构，分为组合体和叶子，你可以分别创建组合体对象和叶子对象，加入您想实现的方法
     */
}
