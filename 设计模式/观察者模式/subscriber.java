import java.io.IOException;


public class subscriber implements Observer {

    public String name;
    private Channel channel = new Channel();
    public subscriber(String name) {
        this.name = name;
    }
    @Override
    public  void update(){
        System.out.println("Hey "+name+",Video Upload "+channel.title);
    }
    @Override
    public void  suscribeChannel(Channel ch) {
        channel = ch;
    }


}
