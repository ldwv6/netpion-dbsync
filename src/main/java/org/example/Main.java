package org.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Connection conn = null;

        try{

            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://172.19.58.179:3306/cu";

            conn = DriverManager.getConnection(url, "root", "****");
            System.out.println("succes");

        }
        catch(ClassNotFoundException e){
            System.out.println("driver loading fail");
        }
        catch(SQLException e){
            System.out.println("error: " + e);
        }
        finally{
            try{
                if( conn != null && !conn.isClosed()){
                    conn.close();
                }
            }
            catch( SQLException e){
                e.printStackTrace();
            }
        }
    }
}