/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import db.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Users;

/**
 *
 * @author Admin
 */
public class SignUpDAO {
    public void signup(String user, String pass) {
        String query = "insert into Users\n"
                + "values(?,?,0)";
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = new DBConnect().getInstance().openConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            ps.executeUpdate();
        } catch (Exception e) {
        }

    } 
 
  public Users checkAccountExit(String user) {
        Connection con = null;
        DBConnect db = new DBConnect();
        try {
            con = db.getInstance().openConnection();
            String sql = "Select * from Users where username=?\n";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, user);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()){
                Users users = new Users();
                users.setId(rs.getInt(1));
                users.setUsername(rs.getString(2));
                users.setPassword(rs.getString(3));
                users.setIsAdmin(rs.getInt(4));
                return users;
            }
            rs.close();
            pstmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}


