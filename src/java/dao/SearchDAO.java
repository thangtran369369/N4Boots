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
import java.util.ArrayList;
import model.Product;

/**
 *
 * @author Admin
 */
public class SearchDAO {
    public ArrayList<Product> getProductByName(String name) {
        ArrayList<Product> ls = new ArrayList<>();
        Connection con = null;
        DBConnect db = new DBConnect();
        try {
            con = db.getInstance().openConnection();
            String sql = "Select * from Products\n" + "where [name] like ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, "%" + name + "%");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setId(rs.getInt(1));
                p.setName(rs.getString(2));
                p.setPrice(rs.getFloat(3));
                p.setGender_id(rs.getInt(4));
                p.setCategory_id(rs.getInt(5));
                p.setTitle(rs.getString(6));
                p.setDes(rs.getString(7));
                p.setAmount(rs.getInt(8));
                p.setImage(rs.getString(9));
                p.setImage1(rs.getString(10));
                p.setImage2(rs.getString(11));
                p.setDate(rs.getDate(12));
                ls.add(p);
            }
            rs.close();
            pstmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ls;
    }

}
