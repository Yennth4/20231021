package com.poly.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcHelper {
    static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
   static String dburl = "jdbc:sqlserver://localhost:1433;databaseName=EduSys;encrypt=false;trustServerCertificate=true;user=sa;password=0866625229";

    static {
        try {
            Class.forName(driver);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static PreparedStatement getStmt(String sql, Object... ags) throws SQLException {
        Connection conn = DriverManager.getConnection(dburl);
        PreparedStatement stmt;
        if(sql.trim().startsWith("{")) {
            stmt = conn.prepareCall(sql);
        } else {
            stmt = conn.prepareStatement(sql);
        }
        
        for(int i = 0; i < ags.length; i++) {
            stmt.setObject(i+1, ags[i]);
        }
        
        return stmt;
    }
    
    public static ResultSet query(String sql, Object... ags) throws SQLException {
        PreparedStatement stmt = JdbcHelper.getStmt(sql, ags);
        return stmt.executeQuery();
    }
    
    public static Object value(String sql, Object... ags) {
        try {
            ResultSet rs = JdbcHelper.query(sql, ags);
            if(rs.next()) {
                return rs.getObject(0);
            }
            rs.getStatement().getConnection().close();
            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public static int update(String sql, Object... ags) {
        try {
            PreparedStatement stmt = JdbcHelper.getStmt(sql, ags);
            try {
                return  stmt.executeUpdate();
            } 
            finally {
                stmt.getConnection().close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
