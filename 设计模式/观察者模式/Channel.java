import java.util.ArrayList;
import java.util.List;



public class Channel implements Subject{
    private List<subscriber> subs = new ArrayList<>();
    String title;



    @Override
    public void subscribe(subscriber sub){
        subs.add(sub);
    }
    @Override
    public void unSubscribe(Observer sub){
        subs.remove(sub);
    }
    @Override
    public  void notifySubscribe(){
        for(subscriber sub : subs){
            sub.update();
        }
    }
    @Override
    public  void  upload(String title){
        this.title = title;
        notifySubscribe();
    }
}
