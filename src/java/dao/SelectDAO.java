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
import java.util.List;
import model.Product;

/**
 *
 * @author Admin
 */
public class SelectDAO {
    List<Product> list = new ArrayList<>();
    public List<Product> getAllProductByGender(int gender_id, String name) {
        String query = "select * from Products where gender_id = ? ORDER BY price="+name +" ";
        Connection conn = null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        try {
            conn = new DBConnect().getInstance().openConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, gender_id);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1)
                        , rs.getString(2)
                        , rs.getFloat(3)
                        , rs.getInt(4)
                        , rs.getInt(5)
                        , rs.getString(6)
                        , rs.getString(7)
                        , rs.getInt(8)
                        , rs.getString(9)
                        , rs.getString(10)
                        , rs.getString(11),
                         rs.getDate(12)));

            }
        } catch (Exception e) {
        }
        return list;

    }

}
