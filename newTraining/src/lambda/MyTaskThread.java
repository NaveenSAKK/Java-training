package lambda;

public class MyTaskThread implements Runnable{
    @Override
    public void run() {
        Task t=new Task();
        t.con();
    }
}
