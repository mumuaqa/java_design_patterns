public class study {
    /**
     * 原型设计模式
     * 你有一家店，想要开另一家连锁店，其中好多东西都是一样的
     * 你不想重复设置，但是又不能直接拿来用，他们有一些不同之处
     * 你就需要原型设计模式，clon克隆你的原数据
     * 向一个数据库请求对象和数据特别耗时间，但是又必须多次获取重复的信息数据
     * 这时你可以只获取一次，然后用clon来代替另一次相同的请求
     *
     * 1.实现clon接口，
     * 复写clon方法
     *  @Override
     *      public BookShop clone()throws CloneNotSupportedException{
     *         return (BookShop) super.clone();
     *     }
     *      调用 BookShop bs1 = (BookShop) bs.clone();
     *      返回的是一模一样的目标
     *
     */

}
