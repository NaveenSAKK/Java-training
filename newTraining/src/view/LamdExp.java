package view;
interface Add{
    int add(int a,int b);
   // int sum(int a,int b);
//    int add(float a,float b);
//    int add(String a,String b);
}
public class LamdExp {
    public static void main(String[] args) {
        Add sum=(a,b)->{
            return a+b;
        };
        System.out.println(sum.add(5,6));
//        System.out.println(sum.add(5.4f,6.4f));
//        System.out.println(sum.add("naveen","sakka"));
    }
}
