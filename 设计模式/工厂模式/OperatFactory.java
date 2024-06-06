package 设计模式.工厂模式;

public class OperatFactory {
    public OS getInstance(String str){
        if(str.equals("ios"))
            return new IOs();
        else if (str.equals("android"))
            return new Android();
        else
            return new Windows();

    }
}
