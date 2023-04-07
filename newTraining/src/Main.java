import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
  abstract   class innerClass{
       abstract void innerMethod();

      void innerMethod2() {

          System.out.println(" inner Method");

      }
    }
    class  inner extends innerClass{

        @Override
        void innerMethod() {

                System.out.println(" inner Method");

        }
    }
   abstract static  class innerClassStatic{
        abstract  void innerMethod();
       void innerMethod2() {
           System.out.println("abstract class");
       }
    }
    static class innerClassStatic1 extends  innerClassStatic{

        @Override
        void innerMethod() {
            System.out.println("abstract class");
        }
    }
    void innerMethod(){
        abstract  class innerClass{
            abstract  void innerMethod();
            void innerMethod2() {
                System.out.println("abstract class");
            }
        }
        class  in2 extends  innerClass{

            @Override
            void innerMethod() {
                System.out.println("abstract class");
            }
        }
        in2 in=new in2();
        in.innerMethod();
        in.innerMethod2();
    }
    public static void main(String[] args) throws IOException {
            Main m=new Main();
            m.innerMethod();
            Main.inner n2=m.new inner();
            n2.innerMethod();
            n2.innerMethod2();
            Main.innerClassStatic1 n3=new Main.innerClassStatic1();
            n3.innerMethod();
              n3.innerMethod2();


//        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
//        int a1=0;
//        int a=Integer.parseInt(reader.readLine());
//        try {
//            System.out.println("Hello world!" +" " +a/a1);
//        }catch (Exception e){
//            System.out.println(e);
//        }finally {
//            System.out.println("fff");
//        }

//        Scanner sc =new Scanner(System.in);
//        String sy=sc.nextLine();
//        System.out.println("Hello world!" +" " +sy);
    }
}