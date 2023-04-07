package view;

import controller.EmpCon;
import controller.EmpController;
import exception.UserExp;
import model.Employee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class main2 {
   static int a=0;
    int b=10;
    static {
        System.out.println("sts");
        a=10;
    }
//    static{
////
//        try {
//            login();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
    public static void main(String[] args)  {

        int[] arr=new int[5];
        main2 main=new main2();
        main.add();
//        System.out.println(main.b);
//        System.out.println(a);

    }
      void login() throws IOException {
        String uName = "", pass = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the user Name");
        uName = reader.readLine();
        System.out.println("Enter the password");
        pass = reader.readLine();
        try {
            if (uName.equals("nnv") && pass.equals("paa")) {
                System.out.println("User login Successfully");
                add();
            } else {
                throw new UserExp();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

         void add() {
            int i;
            String choice = null;
            Scanner sc = new Scanner(System.in);
            EmpController controllor = new EmpCon();

            System.out.println("Welcome ");

            for (int j = 0; j != 1; ) {
                System.out.print("Enter the choice\n1.add\n2.display\n3.seial\n4.deserial\n5.sort name\n6.sort id\n7.exit\n");
                i = sc.nextInt();
                switch (i) {
                    case 1:
//				Scanner scan=new Scanner(System.in);

                        System.out.print("Enter Student id\n");
                        int id = sc.nextInt();
                        System.out.print("Enter Student name\n");
                        String s = sc.next();
                        controllor.addEmp(new Employee(id, s));
                        break;
                    case 2:
                        controllor.display();
                        break;
                    case 3:
//				Scanner scan=new Scanner(System.in);
                            if(controllor.getList().size()>0){
                                controllor.serial(controllor.getList());
                            }else {
                                System.out.print("list is empty\n");
                            }
//                        System.out.print("Enter Student id\n");
//                        int id1 = sc.nextInt();
//                        System.out.print("Enter Student name\n");
//                        String s1 = sc.next();

                        break;
                    case 4:
                        controllor.deserial();
                        break;
                    case 5:
                        controllor.sort(1);
                        break;
                    case 6:
                        controllor.sort(2);
                        break;
                    default:
                        j = 1;
                        break;

                }

            }
            System.out.println("Exited");
            System.exit(0);
        }
    }


