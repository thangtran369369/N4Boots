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
import model.Review;
import model.WishList;

/**
 *
 * @author tranv
 */
public class WishListDAO {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    
    public void insert(WishList wishList) {
        String sql = "INSERT INTO wishList(user_id, product_id) VALUES (?,?)";

        try {
            conn = new DBConnect().getInstance().openConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, wishList.getUser_id());
            ps.setInt(2, wishList.getProduct_id());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
     public void delete(int id) {
        String sql = "DELETE FROM wishList WHERE id=?";
        try {
            conn = new DBConnect().getInstance().openConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     
     
     public List<WishList> getAllWishListByUser_Id(int user_id) {
        List<WishList> wishLists = new ArrayList<WishList>();
        String sql = "SELECT * FROM wishList WHERE user_id=?";
        try {
            conn = new DBConnect().getInstance().openConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1,user_id);
            rs = ps.executeQuery();
            while (rs.next()) {
                WishList wishList = new WishList();
                wishList.setId(rs.getInt("id"));
                wishList.setUser_id(rs.getInt("user_id"));
                wishList.setProduct_id(rs.getInt("product_id"));
                wishLists.add(wishList);
            }
        } catch (Exception e) {
        }

        return  wishLists;

    }
     
     public WishList isExit(int user_id,int product_id){
         String query = "select * from wishList where user_id = ? and product_id = ?";
         
         try {
            conn = new DBConnect().getInstance().openConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, user_id);
            ps.setInt(2, product_id);
            rs = ps.executeQuery();
            while (rs.next()) {
                WishList wishList = new WishList(rs.getInt(1)
                        , rs.getInt(2)
                        , rs.getInt(3));                
                return wishList;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }   
         return null;
     }
     
     
     
     public int returnId(int user_id,int product_id){
         String query = "select * from wishList where user_id = ? and product_id = ?";
         
         try {
            conn = new DBConnect().getInstance().openConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, user_id);
            ps.setInt(2, product_id);
            rs = ps.executeQuery();
            while (rs.next()) {
                WishList wishList = new WishList(rs.getInt(1)
                        , rs.getInt(2)
                        , rs.getInt(3));                
                return wishList.getId();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }   
         return -1;
     }
     
     
     public Product getProductById(int product_id) {
        Product product = new Product();
        String query = "select * from Products "
                + "where id = ? ";
        try {
            conn = new DBConnect().getInstance().openConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, product_id);
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
     
     
      public int getWishList(int user_id,int product_id){
         String query = "select * from wishList where user_id = ? and product_id = ?";
         
         try {
            conn = new DBConnect().getInstance().openConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, user_id);
            ps.setInt(2, product_id);
            rs = ps.executeQuery();
            while (rs.next()) {
                WishList wishList = new WishList(rs.getInt(1)
                        , rs.getInt(2)
                        , rs.getInt(3));                
                return wishList.getId();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }   
         return -1;
     }
     
     
    public static void main(String[] args) {
        WishList w = new WishList(2, 3);
        WishListDAO wldao = new WishListDAO();
        List<WishList> l = new ArrayList<>();
                l =  wldao.getAllWishListByUser_Id(4);
        for (WishList wishList : l) {
            System.out.println(wishList);
        }
    }
}
