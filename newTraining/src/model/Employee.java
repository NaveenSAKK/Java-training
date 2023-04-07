package model;

import java.io.Serializable;
import java.util.Comparator;

public class Employee implements Serializable,Comparable<Employee> {
    int id;
    String ename;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Employee(int id, String ename) {
        this.id = id;
        this.ename = ename;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", ename='" + ename + '\'' +
                '}';
    }
    public  static Comparator<Employee> name=new Comparator<Employee>() {

        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getEname().compareTo(o2.getEname());
        }
    };

    @Override
    public int compareTo(Employee o) {
        return this.id-o.id;
    }
}
