/*

Assignment Solution 


*/

import java.sql.*;   // import sql package for connect to posgres database 
import java.util.*; // import scanner package 
  

public class Exercise {
public static void main(String[] args) throws Exception
{


        Class.forName("org.postgresql.Driver");
        System.out.println("Driver loaded");

        Connection conn;
        conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test", "postgres", "root");

        System.out.println("Coonection done");

        System.out.println("Coonection done");

        Statement stmt;
        stmt = conn.createStatement();
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        String name = sc.next();
        String sql;
        sql = "insert into student values("+id+","+name+");";
        stmt.executeUpdate(sql);
        System.out.println("record inserted");

        conn.close();




}
}


