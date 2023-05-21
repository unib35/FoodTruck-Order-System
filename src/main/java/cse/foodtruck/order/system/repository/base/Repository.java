package cse.foodtruck.order.system.repository.base;

import cse.foodtruck.order.system.database.Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Repository {
    protected final Database db;
    protected Connection conn;
    protected PreparedStatement pstmt;
    protected ResultSet rs;

    //생성자 db 인스턴스 생성
    public Repository() {
        db = Database.getInstance();
    }
    //반환 값 없는 쿼리 실행 메소드 -> insert, update, delete
    protected boolean excuteUpdate(String sql){
        try{
            conn = db.connect();
            pstmt = conn.prepareStatement(sql);
            pstmt.executeUpdate();

            return true; //메소드 실행 성공
        } catch (SQLException e) {
            System.out.println("DB Update Error : " + e);
            return false; //메소드 실행 실패
        } finally {
            db.close();
        }
    }
    //반환 값 있는 쿼리 실행 메소드 -> select
    protected ResultSet excuteQuery(String sql){
        try{
            conn = db.connect();
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            return rs; //메소드 실행 성공
        } catch (SQLException e) {
            System.out.println("DB Update Error : " + e); //메소드 실행 실패
            return null;
        }
    }


}
