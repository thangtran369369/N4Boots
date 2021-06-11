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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Product;

/**
 *
 * @author Admin
 */
public class ProductDAO {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    public ArrayList<Product> getAllProduct() {

        //Connect database
        ArrayList<Product> list = new ArrayList<>();
        Connection con = null;
        DBConnect db = new DBConnect();

        try {
            con = db.openConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from Products");
            while (rs.next()) {
                Product product = new Product();

                product.setId(rs.getInt(1));
                product.setName(rs.getString(2));
                product.setPrice(rs.getFloat(3));
                product.setGender_id(rs.getInt(4));
                product.setCategory_id(rs.getInt(5));
                product.setTitle(rs.getString(6));
                product.setDes(rs.getString(7));
                product.setAmount(rs.getInt(8));
                product.setImage(rs.getString(9));
                product.setImage1(rs.getString(10));
                product.setImage2(rs.getString(11));
                product.setDate(rs.getDate(12));

                list.add(product);
            }
            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }   
public List<Product> getAllProductByDesc() {
        List<Product> list = new ArrayList<>();
        String query = "SELECT * FROM Products\n" +
                        "ORDER BY id DESC;";
        Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
        try {
            conn = new DBConnect().getInstance().openConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                         rs.getString(2),
                         rs.getFloat(3),
                         rs.getInt(4),
                         rs.getInt(5),
                         rs.getString(6),
                         rs.getString(7),
                         rs.getInt(8),
                         rs.getString(9),
                         rs.getString(10),
                         rs.getString(11),
                        rs.getDate(12)));

            }
        } catch (Exception e) {
        }
        return list;
        
     }
public Product getProductById(int id) {
        Product product = new Product();
        String query = "select * from Products "
                + "where id = ? ";
        try {
            conn = new DBConnect().getInstance().openConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                Product p = new Product(rs.getInt(1),
                         rs.getString(2),
                         rs.getFloat(3),
                         rs.getInt(4),
                         rs.getInt(5),
                         rs.getString(6),
                         rs.getString(7),
                         rs.getInt(8),
                         rs.getString(9),
                         rs.getString(10),
                         rs.getString(11),
                        rs.getDate(12));
                return p;
            }
        } catch (Exception e) {
        }
        return null;

    }
}
