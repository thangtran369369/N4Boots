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
public class DAO {
//     public Account login(String user, String pass) {
//        Connection con = null;
//        DBConnect db = new DBConnect();
//        try {
//            con = db.getInstance().openConnection();
//            String sql = "Select * from Account where username=?\n" + "and pass=?";
//            PreparedStatement pstmt = con.prepareStatement(sql);
//            pstmt.setString(1, user);
//            pstmt.setString(2, pass);
//            ResultSet rs = pstmt.executeQuery();
//            while (rs.next()) {
//                Account m = new Account();
//                m.setId(rs.getInt(1));
//                m.setUsername(rs.getString(2));
//                m.setPass(rs.getString(3));
//                m.setEmail(rs.getString(4));
//                m.setIsUser(rs.getInt(5));
//                m.setIsAdmin(rs.getInt(6));
//                return m;
//            }
//            rs.close();
//            pstmt.close();
//            con.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//public void signup(String user, String pass, String email) {
//        String query = "insert into Account\n"
//                + "values(?,?,?,1,0)";
//        Connection conn = null;
//    PreparedStatement ps = null;
//        try {
//            conn = new DBConnect().getInstance().openConnection();
//            ps = conn.prepareStatement(query);
//            ps.setString(1, user);
//            ps.setString(2, pass);
//            ps.setString(3, email);
//
//            ps.executeUpdate();
//        } catch (Exception e) {
//        }
//
//    } 
// 
//  public Account checkAccountExit(String user) {
//        Connection con = null;
//        DBConnect db = new DBConnect();
//        try {
//            con = db.getInstance().openConnection();
//            String sql = "Select * from Account where username=?\n";
//            PreparedStatement pstmt = con.prepareStatement(sql);
//            pstmt.setString(1, user);
//            ResultSet rs = pstmt.executeQuery();
//            while (rs.next()) {
//                Account m = new Account();
//                m.setId(rs.getInt(1));
//                m.setUsername(rs.getString(2));
//                m.setPass(rs.getString(3));
//                m.setEmail(rs.getString(4));
//                m.setIsUser(rs.getInt(5));
//                m.setIsAdmin(rs.getInt(6));
//                return m;
//                
//            }
//            rs.close();
//            pstmt.close();
//            con.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
}
