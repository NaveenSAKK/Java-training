package databaseConnect;

import helper.DbConnection;
import model.Employee;

import java.sql.*;

public class EmployeeImp implements EmployeeInterface{
    Connection con;
    PreparedStatement ps;
    Statement stm;
    ResultSet rs;
    @Override
    public void insertEmp(Employee emp) {
        try {
            con = DbConnection.con();
            ps=con.prepareStatement("insert into student values(?,?)");

            ps.setInt(1, emp.getId());
            ps.setString(2, emp.getEname());
            int noofrows = ps.executeUpdate();
            System.out.println(noofrows+" inserted");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    @Override
    public void selectEmp() {
        try {
            con  = DbConnection.con();
            stm= con.createStatement();
            rs = stm.executeQuery("select * from student");
            while(rs.next()) {
                System.out.println(rs.getInt(1) + " -- " + rs.getString(2));

            }


        } catch (SQLException e) {

            e.printStackTrace();
        }

    }

    @Override
    public void updateEmp(Employee emp) {
        try {
            con = DbConnection.con();
            ps=con.prepareStatement("update student set name = ? where id = ?");
            ps.setString(1, emp.getEname());
            ps.setInt(2, emp.getId());

             int ch=ps.executeUpdate();
            System.out.println(ch+" updated");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public void deleteEmp(int id) {


        try {
            con = DbConnection.con();

            stm = con.createStatement();

            int result = stm.executeUpdate("delete from student where id = " + id);

            System.out.println("Number of records affected :: " + result);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
        // Step 3: Execute the query or update query


}
