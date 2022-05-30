import java.sql.*;
import java.util.*;

public class Demo8 {

    public static void main(String[] args) throws Exception {

        Class.forName("org.postgresql.Driver");
        System.out.println("Driver loaded");

        Connection conn;
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the User Name : ");
        String user_name = sc.next();
        System.out.println("Enter the Password : ");
        String pass_word = sc.next();
        conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/new", user_name, pass_word );

        System.out.println("Coonection done");

        System.out.println("Coonection done");

        Statement stmt;
        stmt = conn.createStatement();
        System.out.println("Enter the Product Id : ");
        int Pid  = sc.nextInt(); 
        System.out.println("Enter the Product Name : ");
        String Pname = sc.next();
        System.out.println("Enter the Product Decription  : ");
        String Pdes = sc.next();
        System.out.println("Enter the Product Rating : ");
        int Prate = sc.nextInt();   


        String sql;
        sql = "insert into student values("+Pid+",'"+Pname+"','"+Pdes+"',"+Prate+")";
        stmt.executeUpdate(sql);
        System.out.println("record inserted");

        conn.close();

    }

}
