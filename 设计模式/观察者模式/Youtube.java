

public class Youtube {
    public static void main(String[]args){
        Channel telusko = new Channel();

        subscriber s1 = new subscriber("AKshay");
        subscriber s2 = new subscriber("Sonam");
        subscriber s3 = new subscriber("Harsh");
        subscriber s4 = new subscriber("Kiran");
        subscriber s5 = new subscriber("Pravin");

        telusko.subscribe(s1);
        telusko.subscribe(s2);
        telusko.subscribe(s3);
        telusko.subscribe(s4);
        telusko.subscribe(s5);

        telusko.unSubscribe(s3);

        s1.suscribeChannel(telusko);
        s2.suscribeChannel(telusko);
        s3.suscribeChannel(telusko);
        s4.suscribeChannel(telusko);
        s5.suscribeChannel(telusko);

        telusko.upload("How to learn Programming");//更新内容，发出消息


    }
}
