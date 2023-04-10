package view;
class  threadExp extends   Thread{



    public void run() {
        System.out.println("Theard started");
        runner();

    }
    void  runner(){
try {
    for(int i=0;i<10;i++){
        System.out.println(i);
        Thread.sleep(100000);

    }
}catch (Exception e){
    System.out.println(e);
}
}

}
class  threadExp1 implements    Runnable{


    @Override
    public void run() {
        System.out.println("Theard started");
        try {
            for(int i=0;i<10;i++){
                System.out.println(i);
                Thread.sleep(100);

            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
    void  runner(){

    }

}
public class main3 {
    public static void main(String... arg){
//        threadExp th =new threadExp();
//        th.start();
        threadExp1 th =new threadExp1();
        Thread sc=new Thread(th);
        sc.start();

    }
}
