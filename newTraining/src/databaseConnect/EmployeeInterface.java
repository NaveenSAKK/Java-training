package databaseConnect;

import model.Employee;

public interface EmployeeInterface {
    public void insertEmp(Employee emp);
    public void selectEmp();
    public void updateEmp(Employee emp);
    public void deleteEmp(int id);
}
