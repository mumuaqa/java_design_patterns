public class CompositeTest {
    public static void main(String[]args){
        Component hd = new Leaf(4000,"HDD");//硬盘
        Component mouse = new Leaf(500,"Mouse");//鼠标
        Component monitor = new Leaf(8000,"Monitor");//摄像头
        Component ram = new Leaf(3000,"RAM");//内存
        Component cpu = new Leaf(9000,"CPU");//CPU

        Composite ph =new Composite("Peri");//外设（包含：鼠标和摄像头）
        Composite cabinet =new Composite("Cabinet");//
        Composite mb =new Composite("MB");//主板（包含：内存和CPU）
        Composite computer =new Composite("Computer");//完整的电脑

        mb.addComponnt(cpu);//主板（包含：内存和CPU）
        mb.addComponnt(ram);//将内存和CPU组合成主板

        ph.addComponnt(mouse);//外设（包含：鼠标和摄像头）
        ph.addComponnt(monitor);//将鼠标和摄像头组合成外设

        cabinet.addComponnt(hd);//电脑内部核心区域（包含硬盘和主板）就是机箱里面装的东西
        cabinet.addComponnt(mb);//将硬盘和主板组合成电脑内部核心区域

        computer.addComponnt(ph);//完整的电脑（包含：内部核心区域和外设）
        computer.addComponnt(cabinet);//将内部核心区域和外设组合成完整的电脑
        computer.showPrice();//想打印谁的价格都可以

    }
}
