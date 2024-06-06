package 设计模式.工厂模式;

public class FactoryMain {
    public static void main(String[] args) {
        String str = "aaa";
        OperatFactory osf = new OperatFactory();
        OS pro = osf.getInstance(str);
        pro.spec();
    }
}
