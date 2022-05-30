import java.sql.*;

public class Demo {

    public static void main(String[] args) throws Exception {

        Class.forName("org.postgresql.Driver");
        System.out.println("Driver loaded");

        Connection conn;
        conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test", "postgres", "root");

        System.out.println("Coonection done");

        System.out.println("Coonection done");

        Statement stmt;
        stmt = conn.createStatement();
        String sql;
        sql = "insert into student values(700,'Vis')";
        stmt.executeUpdate(sql);
        System.out.println("record inserted");

        conn.close();

    }

}
