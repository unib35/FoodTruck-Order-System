package cse.foodtruck.order.system.repository.base;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CrudRepository<T, PK> extends Repository{
    private T entity;
    protected String pkFieldName;
    protected String tableName;
    protected String className;
    protected Field[] fieldList;

    public void setEntity(T entity) {
        this.entity = entity;

        Class<?> ec = this.entity.getClass();

        //테이블명 생성 : 클래스명 -> 대문자, _TB 붙이기
        this.className = ec.getName();
        this.tableName = ec.getSimpleName();
        this.tableName = this.tableName.toUpperCase();
        this.pkFieldName = ec.getDeclaredFields()[0].getName();
        this.fieldList = ec.getDeclaredFields();
        System.out.println("tableName : " + tableName);
        System.out.println("pkFieldName : " + pkFieldName);
        System.out.println("fieldList : " + fieldList);
        System.out.println(ec.getDeclaredFields().getClass().getName());


        // AccessibleObject.setAccessible() 메소드
        // -> 이 객체의 accessible 플래그를 지정된 값으로 설정
        for(Field field : this.fieldList) {
            field.setAccessible(true);
        }

    }

    public T save(T entity){
        try{
            conn = db.connect();

            String sql = insertQuery();
            pstmt = conn.prepareStatement(sql);

            for(int i=0;i<fieldList.length;i++){
                pstmt.setObject(i+1, fieldList[i].get(entity));
            }
            pstmt.executeUpdate();

            sql = "SELECT * FROM " + tableName + " ORDER BY " + pkFieldName + " DESC LIMIT 1;";

            pstmt = conn.prepareStatement(sql);
            System.out.println(pstmt);
            return resultSetToEntity(pstmt.executeQuery());

        } catch (SQLException | IllegalAccessException e) {
            e.printStackTrace();
            return null;
        }
        finally {
            db.close();
        }
    }

    public boolean deleteById(PK pk){ //true 이면 삭제 성공, false 이면 삭제 실패
        try{
            conn = db.connect();

            String sql = "DELETE FROM " + tableName + " WHERE " + pkFieldName + " = ?;";
            pstmt = conn.prepareStatement(sql);
            pstmt.setObject(1, pk);

            pstmt.executeUpdate();

            return true;
        }
        catch(SQLException e){
            e.printStackTrace();
            return false;
        }
        finally{ db.close(); }
    }

    public boolean deleteAll(){
        try{
            conn = db.connect();

            String sql = "DELETE FROM " + tableName;

            pstmt = conn.prepareStatement(sql);
            pstmt.executeUpdate();

            return true;
        }
        catch(SQLException e){
            e.printStackTrace();
            return false;
        }
        finally{ db.close(); }
    }

    public ArrayList<T> findAll(){
        try{
            conn = db.connect();

            String sql = "SELECT * FROM " + tableName;
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();

            return resultSetToEntityList(rs);
        }catch(SQLException e){
            e.printStackTrace();
            return null;
        }
        finally { db.close(); }
    }

    public String insertQuery() {
        StringBuilder sb = new StringBuilder();
        sb.append("INSERT INTO ");
        sb.append(tableName);
        sb.append(" (");
        for(int i=0;i<fieldList.length;i++){
            System.out.println(fieldList[i].getName());
            sb.append(fieldList[i].getName());
            if(i<fieldList.length-1){
                sb.append(",");
            }
        }
        sb.append(") VALUES (");
        for(int i=0;i<fieldList.length;i++){
            sb.append("?");
            if(i<fieldList.length-1){
                sb.append(",");
            }
        }
        sb.append(");");
        return sb.toString();
    }
    protected T resultSetToEntity(ResultSet rs) {
        Object obj = null;                                   // c의 객체를 동적으로 생성
        try {
            Class c = Class.forName(className);                                 // Entity(T)의 객체를 얻어온다.
            while (rs.next()) {
                obj = c.newInstance();                                   // c의 객체를 동적으로 생성

                for (Field field : fieldList){             // Entity 객체의 필드를 하나씩 가져온다.
                    field.set(obj, rs.getObject(field.getName()));              // rs의 값을 Object로 받아서 동적으로 생성한 obj에 할당
                }
            }
        }
        catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | SQLException e) {  e.printStackTrace(); }

        return (T) obj;
    }

    protected ArrayList<T> resultSetToEntityList(ResultSet rs) {
        ArrayList<T> list = new ArrayList<>();

        try {
            Class c = Class.forName(className);                                 // Entity(T)의 객체를 얻어온다.
            while (rs.next()) {
                Object obj = c.newInstance();                                   // c의 객체를 동적으로 생성

                for (Field field : fieldList)                                   // Entity 객체의 필드를 하나씩 가져온다.
                    field.set(obj, rs.getObject(field.getName()));              // rs의 값을 Object로 받아서 동적으로 생성한 obj에 할당

                list.add((T) obj);
            }
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | SQLException e) { e.printStackTrace(); }

        return list;
    }

    public T findById(PK pk){
        try{
            conn = db.connect();
            String sql = "SELECT * FROM " + tableName + " WHERE " + pkFieldName + " = ?;";
            pstmt = conn.prepareStatement(sql);
            pstmt.setObject(1, pk);

            rs = pstmt.executeQuery();

            // rs를 Entity 변환 후 반환
            return resultSetToEntity(rs);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            db.close();
        }
    }






}













