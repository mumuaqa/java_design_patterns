package 设计模式.建造者模式;

public class shop
{
    public static void main(String args[]){
        Phone p =new PhoneBuilder().setRam(2).getPhone();
        System.out.println(p);
    }
}
