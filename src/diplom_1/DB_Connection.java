/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diplom_1;

import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

/**
 *
 * @author glebmillenium
 */
public class DB_Connection {

    public static List<String> getNames() throws SQLException {
        Connection conn;
        Statement st;
        ResultSet reSet;
        List<String> nameRoad = new ArrayList<String>();
        try {
            Class.forName("org.sqlite.JDBC");

            conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Admin\\Documents\\NetBeansProjects\\Diplom_1\\db\\DB1.db");
            System.out.println("Connected!");

            st = conn.createStatement();
            reSet = st.executeQuery("SELECT * FROM Area_of_responsibility;");
            while (reSet.next()) {
                int Id = reSet.getInt("ID");
                String Code = reSet.getString("Code");
                String Name = reSet.getString("Name");
                System.out.println("Id = " + Id);
                System.out.println("Code = " + Code);
                System.out.println("Name = " + Name);
                nameRoad.add(Name);
                System.out.println();
            }

            System.out.println("Таблица выведена");

            conn.close();
            st.close();
            reSet.close();
            System.out.println("Соединения закрыто");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);

        }
        return nameRoad;

    }

    public static List<String> getLevel() throws SQLException {
        Connection conn;
        Statement st;
        ResultSet reSet;
        List<String> nameLevel = new ArrayList<String>();
        try {
            Class.forName("org.sqlite.JDBC");

            conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Admin\\Documents\\NetBeansProjects\\Diplom_1\\db\\DB1.db");
            System.out.println("Connected!");

            st = conn.createStatement();
            reSet = st.executeQuery("SELECT * FROM Level");
            while (reSet.next()) {
                int Id = reSet.getInt("ID");
                String NameLevel = reSet.getString("NameLevel");
                System.out.println("Id = " + Id);
                System.out.println("NameLevel = " + NameLevel);

                nameLevel.add(NameLevel);
                System.out.println();
            }

            System.out.println("Таблица выведена");

            conn.close();
            st.close();
            reSet.close();
            System.out.println("Соединения закрыто");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);

        }
        return nameLevel;

    }

    public static List<String> getCategory() throws SQLException {
        Connection conn;
        Statement st;
        ResultSet reSet;
        List<String> result = new ArrayList<String>();
        try {
            Class.forName("org.sqlite.JDBC");

            conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Admin\\Documents\\NetBeansProjects\\Diplom_1\\db\\DB1.db");
            System.out.println("Connected!");

            st = conn.createStatement();
            reSet = st.executeQuery("SELECT * FROM Category");
            while (reSet.next()) {
                int Id = reSet.getInt("ID");
                String NameCategory = reSet.getString("NameCategory");
                System.out.println("Id = " + Id);
                System.out.println("NameCategoryl = " + NameCategory);

                result.add(NameCategory);
                System.out.println();
            }

            System.out.println("Таблица выведена");

            conn.close();
            st.close();
            reSet.close();
            System.out.println("Соединения закрыто");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);

        }
        return result;

    }
    
    public static List<String> getEmployee() throws SQLException {
        Connection conn;
        Statement st;
        ResultSet reSet;
        List<String> result = new ArrayList<String>();
        try {
            Class.forName("org.sqlite.JDBC");

            conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Admin\\Documents\\NetBeansProjects\\Diplom_1\\db\\DB1.db");
            System.out.println("Connected!");

            st = conn.createStatement();
            reSet = st.executeQuery("SELECT * FROM Employee");
            while (reSet.next()) {
                int Id = reSet.getInt("ID");
                String NameEmployee = reSet.getString("NameEmployee");
                System.out.println("Id = " + Id);
                System.out.println("NameEmployee = " + NameEmployee);

                result.add(NameEmployee);
                System.out.println();
            }

            System.out.println("Таблица выведена");

            conn.close();
            st.close();
            reSet.close();
            System.out.println("Соединения закрыто");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);

        }
        return result;

    }
    
    public static List<String> getManagerProject() throws SQLException {
        Connection conn;
        Statement st;
        ResultSet reSet;
        List<String> result = new ArrayList<String>();
        try {
            Class.forName("org.sqlite.JDBC");

            conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Admin\\Documents\\NetBeansProjects\\Diplom_1\\db\\DB1.db");
            System.out.println("Connected!");

            st = conn.createStatement();
            reSet = st.executeQuery("SELECT * FROM Project_manager");
            while (reSet.next()) {
                int Id = reSet.getInt("ID");
                String Name = reSet.getString("Name_Project_manager");
                System.out.println("Id = " + Id);
                System.out.println("Name = " + Name);

                result.add(Name);
                System.out.println();
            }

            System.out.println("Таблица выведена");

            conn.close();
            st.close();
            reSet.close();
            System.out.println("Соединения закрыто");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);

        }
        return result;

    }
  
    public static List<String> getWorkingGroup() throws SQLException {
        Connection conn;
        Statement st;
        ResultSet reSet;
        List<String> result = new ArrayList<String>();
        try {
            Class.forName("org.sqlite.JDBC");

            conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Admin\\Documents\\NetBeansProjects\\Diplom_1\\db\\DB1.db");
            System.out.println("Connected!");

            st = conn.createStatement();
            reSet = st.executeQuery("SELECT * FROM Working_Group");
            while (reSet.next()) {
                String Name = reSet.getString("Code_Working_Group");
                result.add(Name);
                System.out.println();
            }

            System.out.println("Таблица выведена");

            conn.close();
            st.close();
            reSet.close();
            System.out.println("Соединения закрыто");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);

        }
        return result;

    }

    public static List<String> getExecutor() throws SQLException {
        Connection conn;
        Statement st;
        ResultSet reSet;
        List<String> result = new ArrayList<String>();
        try {
            Class.forName("org.sqlite.JDBC");

            conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Admin\\Documents\\NetBeansProjects\\Diplom_1\\db\\DB1.db");
            System.out.println("Connected!");

            st = conn.createStatement();
            reSet = st.executeQuery("SELECT * FROM Executor");
            while (reSet.next()) {
                String Name = reSet.getString("Name_executor");
                result.add(Name);
                System.out.println();
            }

            System.out.println("Таблица выведена");

            conn.close();
            st.close();
            reSet.close();
            System.out.println("Соединения закрыто");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DB_Connection.class.getName()).log(Level.SEVERE, null, ex);

        }
        return result;

    }

}
