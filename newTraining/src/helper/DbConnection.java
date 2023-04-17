package helper;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
    static Connection con;
    public static Connection con(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","password");
        }catch (Exception e){
            System.out.println(e);
        }
        return con;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!"+con());
    }

}
