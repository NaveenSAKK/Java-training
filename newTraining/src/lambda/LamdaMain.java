package lambda;

import model.User;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.BiPredicate;

public class LamdaMain {
    public static void main(String[] args) {
//        Task n=new Task();
//        n.con();
//        Runnable r=new MyTaskThread();
//        Thread th=new Thread(r);
//        th.start();
//        Runnable r1=new Runnable() {
//            @Override
//            public void run() {
//                Task t1=new Task();
//
//                t1.con();
//
//
//            }
//        };
//        Thread th1=new Thread(r1);
//        th1.start();
//
//        Runnable runnable=()->{
//            Task t4=new Task();
//           t4.con();
//
//        };
////       new Thread(runnable).start();
//     new  Thread(()->{
//            Task t4=new Task();
//            t4.con();
//
//        }).start();
//     // method reference
//     new Thread(new Task()::con).start();
        ArrayList<User> arr=new ArrayList<User>();
        arr.add(new User(1,"naveen","n.v@dxc.com",1000));
        arr.add(new User(2,"kumar","kumar@dxc.com",1000));
        arr.add(new User(3,"rAjA","rAjA@dxc.com",1000));
//        System.out.println("list"+arr);
//        Iterator<User> i2=arr.iterator();
//                while(i2.hasNext()){
//                    System.out.println(i2.next());
//                }

//                arr.forEach((list)->{
//                    System.out.print(list+" ");
//                });

//                arr.forEach(System.out::print);
        BiPredicate<Double,Double> f=(x,y)->x==y;
        BiPredicate<Double,Double> f2=(x,y)->x<=y;
        System.out.println(f2.or(f).test(100.0,100.0));

    }
}
