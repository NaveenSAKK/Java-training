package controller;

import databaseConnect.EmployeeImp;
import databaseConnect.EmployeeInterface;
import model.Employee;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmpCon  implements EmpController{
    ArrayList<Employee> e=new ArrayList<Employee>();
    EmployeeInterface db=new EmployeeImp();
    @Override
    public void addEmp(Employee emp) {
    //    e.add(emp);
        db.insertEmp(emp);
        System.out.print(" Student Saved Succfully\n");
    }

    @Override
    public void display() {
//        for( Employee  i:  e) {
//            System.out.println("emp id "+ i.getId());
//            System.out.println("emp name "+ i.getEname());
//        }
    //    e.forEach(System.out::print);
        db.selectEmp();
    }

    @Override
    public void serial(List<Employee> emp) {
        try{
            ObjectOutputStream obj=new ObjectOutputStream(new FileOutputStream("nav.txt"));
            obj.writeObject(emp);
            System.out.println("File Write Successfully");
            obj.close();
        }catch (Exception e){
            System.out.println(e);
        }

    }

    @Override
    public List<Employee> getList() {
        return e;
    }

    @Override
    public void deserial() {
        try{
            ObjectInputStream obj=new ObjectInputStream(new FileInputStream("nav.txt"));
           List<Employee> emp= (List<Employee>) obj.readObject();
            for( Employee  i:  emp) {
                System.out.println("emp id "+ i.getId());
                System.out.println("emp name "+ i.getEname());
            }
            obj.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }

    @Override
    public void sort(int id) {
        if(id==1) {
            Collections.sort(e, Employee.name);
        }else {
            Collections.sort(e);
        }
        display();

    }

    @Override
    public void update(Employee em) {
        db.updateEmp(em);
        System.out.print(" Student Update Succfully\n");
    }

    @Override
    public void del(int id) {
        db.deleteEmp(id);
        System.out.print(" Student deleted Succfully\n");
    }
}
