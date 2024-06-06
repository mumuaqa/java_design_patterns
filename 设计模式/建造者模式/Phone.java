package 设计模式.建造者模式;

public class Phone {
    private String os;
    private int ram;
    private int screenSize;
    private String processor;
    private int battery;
    public Phone(String os,int ram,String processor,int screenSize,int battery){
            super();
            this.battery=battery;
            this.ram=ram;
            this.os =os;
            this.processor=processor;
            this.screenSize=screenSize;
    }
    @Override

    public String toString(){
        return "Phone[os="+os+",ram="+ram+",processor="+processor+",screenSize="+screenSize
                +"battery="+battery+"]";

    }

}
