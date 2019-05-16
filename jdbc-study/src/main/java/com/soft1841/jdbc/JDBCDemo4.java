package com.soft1841.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * JDBC删除数据
 * author刘恋
 * 2019.5.17
 */
public class JDBCDemo4 {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/db_jdbc?useUnicode=true&characterEncoding=utf8";
    static final String USER = "root";
    static final String PASS = "root";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName(JDBC_DRIVER);
        System.out.println("连接数据库....");
        Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
        String sql = "DELETE FROM t_student WHERE id=?";
        System.out.println("实例化PreparedStatement对象...");
        PreparedStatement pstm = conn.prepareStatement(sql);
        //设置需要删除的那条记录的id，
        pstm.setInt(1,8);
        int n = pstm.executeUpdate();
        System.out.println(n + "行记录受影响");
        pstm.close();
       conn.close();
    }
}
