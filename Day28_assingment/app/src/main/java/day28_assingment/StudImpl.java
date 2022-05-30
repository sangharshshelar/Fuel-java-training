package day28_assingment;

import java.sql.*;
import java.util.Scanner;

public class StudImpl implements StudInterface {

    @Override
    public void update(Student st) {
        // TODO Auto-generated method stub

        String sql = "";
        String name = st.getName();
        int id = st.getId();
        sql = "update student set name='" + name + "' where id=" + id;

        try {

            Class.forName("org.postgresql.Driver");
            System.out.println("Driver loaded");
            Connection conn;
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test", "postgres", "root");
            System.out.println("Coonection done");
            Statement stmt;
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("record Updated");

            conn.close();

        } catch (Exception e) {
            // TODO: handle exception
        }

    }

    @Override
    public void delete(Student st) {
        String sql = "";
        int id = st.getId();
        sql = "delete from  student  where id=" + id;
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver loaded");
            Connection conn;
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test", "postgres", "root");
            System.out.println("Coonection done");
            Statement stmt;
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("record Deleted Successully!");

            conn.close();

        } catch (Exception e) {
            // TODO: handle exception
        }

    }

    @Override
    public Student getStud(int id) {
        // TODO Auto-generated method stub

        String sql;
        sql = "SELECT * FROM student where id=" + id;
        Student st = null;
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver loaded");
            Connection conn;
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test", "postgres", "root");
            System.out.println("Coonection done");
            Statement stmt;
            stmt = conn.createStatement();
            ResultSet rs;
            rs = stmt.executeQuery(sql);
            // rs.next();
            // System.out.println(rs.getInt(1));
            // System.out.println(rs.getString(2));
            // System.out.println("Select sucessfully");
            int count = 1;

            while (rs.next()) {
                System.out.print(count + "]" + " " + rs.getInt(1));
                System.out.print(":  ");
                System.out.println(rs.getString(2));
                st = new Student();
                st.setId(rs.getInt(1));

                count++;
            }
            System.out.println("\t\t  Successfully Select Query Execuated !");

        } catch (Exception e) {
            // TODO: handle exception
        }

        return st;
    }

    @Override
    public void insert(Student st) {

        String sql = "";
        String name = st.getName();
        int id = st.getId();
        sql = "insert into student values(" + id + ",'" + name + "')";

        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver loaded");
            Connection conn;
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test", "postgres", "root");
            System.out.println("Coonection done");
            Statement stmt;
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("record Inserted Successully!");

            conn.close();

        } catch (Exception e) {
            // TODO: handle exception
        }

    }

    @Override
    public void select(Student st) {
        // TODO Auto-generated method stub
        String sql;
        sql = "SELECT * FROM student";

        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver loaded");
            Connection conn;
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test", "postgres", "root");
            System.out.println("Coonection done");
            Statement stmt;
            stmt = conn.createStatement();
            ResultSet rs;
            rs = stmt.executeQuery(sql);
            // rs.next();
            // System.out.println(rs.getInt(1));
            // System.out.println(rs.getString(2));
            // System.out.println("Select sucessfully");
            int count = 1;
            while (rs.next()) {
                System.out.print(count + "]" + " " + rs.getInt(1));
                System.out.print(":  ");
                System.out.println(rs.getString(2));
                count++;
            }
            System.out.println("\t\t  Successfully Select Query Execuated !");

        } catch (Exception e) {
            // TODO: handle exception
        }

    }

    @Override
    public void create(Student st) {

        System.out.println("Enter table name :  ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String sql = "";
        sql = "Create Table \"" + name + "\" (id int primary key, name varchar, address text) ";

        try {

            Class.forName("org.postgresql.Driver");
            System.out.println("Driver loaded");
            Connection conn;
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test", "postgres", "root");
            System.out.println("Coonection done");
            Statement stmt;
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("Created table in given database...");

            conn.close();

        } catch (Exception e) {
            // TODO: handle exception
        }

    }

}
