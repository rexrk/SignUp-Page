package main.usersignup;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
    public static Connection con;
    public static Connection createConn(){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/newsletter";
            con = DriverManager.getConnection(url, "root", "rexrk");


        } catch (Exception e){
            e.printStackTrace();
        }
        return con;
    }
}





