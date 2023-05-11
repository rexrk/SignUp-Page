package main.usersignup;

import java.sql.Connection;
import java.sql.Statement;

public class Main {
    private String un;
    private String pwd;

    public Main(String un, String pwd) {
        this.un = un;
        this.pwd = pwd;
        storeToDb();
    }

    public void storeToDb() {
        Connection con = CP.createConn();

        try {
            Statement st = con.createStatement();

            String query = "insert into newsletter(Email, password) values(" + un + "," + pwd + ")";

            st.executeUpdate(query);

            System.out.println("1 rows affected ...");

        } catch (Exception e) {
            System.out.println("Something Seems Not Right");
            e.printStackTrace();
        }
    }
}
