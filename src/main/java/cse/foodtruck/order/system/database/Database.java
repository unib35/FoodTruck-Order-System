package cse.foodtruck.order.system.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
    private static Database dbInstance = new Database();
    private static final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
    private static final String DB_URL = "jdbc:mariadb://113.198.235.241:9090/foodtruckdb";
    private static final String dbID = "lee";
    private static final String dbPW = "admin";

    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    private Database(){}

    //데이터 베이스 생성
    public static Database getInstance(){
        return dbInstance;
    }

    public Connection connect(){
        try{
            Class.forName(JDBC_DRIVER);
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, dbID, dbPW);
            System.out.println("Connected to database...");
            return conn;
        } catch (SQLException e) {
            System.out.println("DB Connection Error!! : " + e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public void close(){
        try{
            if(rs != null) rs.close();
            if(stmt != null) stmt.close();
            if(conn != null) conn.close();
        } catch (SQLException e) {
            System.out.println("DB Close Error!! : " + e);
        }
    }

    public Connection getConnection(){
        return conn;
    }
    public PreparedStatement getPreparedStatement(){
        return null;
    }
    public ResultSet getResultSet(){
        return null;
    }

    public static void main(String[] args) {

        Database db = new Database();
        db.connect();
    }
}

