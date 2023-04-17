package controller;

import model.Employee;

import java.util.List;

public interface EmpController {
    void addEmp(Employee emp);
    void display();
    void serial(List<Employee> emp);
    List<Employee> getList();
     void deserial();

     void sort(int id);

     void update(Employee em);

     void del(int id);

}
