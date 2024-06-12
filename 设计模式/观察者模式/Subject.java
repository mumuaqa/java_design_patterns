

public interface Subject {
    void subscribe(subscriber sub);
    void unSubscribe(Observer sub);
    public  void notifySubscribe();
    public  void  upload(String title);
}
