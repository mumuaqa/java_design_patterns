package 设计模式.建造者模式;

public class PhoneBuilder {
    private String os;
    private int ram;
    private int screenSize;
    private String processor;
    private int battery;

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return  this;
    }

    public PhoneBuilder setScreenSize(int screenSize) {
        this.screenSize = screenSize;
        return  this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return  this;
    }

    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return  this;
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return  this;
    }
    public Phone getPhone(){
        return new Phone(os,ram,processor,screenSize,battery);
    }

}
