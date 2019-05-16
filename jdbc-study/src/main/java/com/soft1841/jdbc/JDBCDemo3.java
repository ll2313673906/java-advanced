package com.soft1841.jdbc;
      /**
        * JDBC更新数据
        * author刘恋
        * 2019.5.17
        */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCDemo3 {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/db_jdbc?useUnicode = true&characterEncoding=utf8";
    static final String USER = "root";
    static final String PASS = "root";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName(JDBC_DRIVER);
        System.out.println("连接数据库.....");
        Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
        String sql = "UPDATE t_student SET name=?,age=? WHERE id=?";
        System.out.println("实例化PreparedStatement对象");
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1,"修改后的姓名");
        pstmt.setInt(2,12);
        // 此处设置需要修改的那条记录的id，
        pstmt.setInt(3,9);
        int n = pstmt.executeUpdate();
        System.out.println(n + "行记录受影响");
        pstmt.close();
        conn.close();
    }
}
