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
import model.Category;
import model.Gender;
import model.Product;

/**
 *
 * @author Admin
 */
public class CategoryDAO {
    
    public ArrayList<Category> getAllCategory() {

        //Connect database
        ArrayList<Category> list = new ArrayList<>();
        Connection con = null;
        DBConnect db = new DBConnect();

        try {
            con = db.openConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from category");
            while (rs.next()) {
                Category category = new Category();

                category.setId(rs.getInt(1));
                category.setName(rs.getString(2));

                list.add(category);
            }
            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    } 
     public List<Product> getAllProductByCategory(int category_id,int pageIndex, int pageSize) {
        List<Product> list = new ArrayList<>();
        String query = "SELECT * FROM Products where category_id = ? ORDER BY id "
                    + "OFFSET (?*?-?) ROWS FETCH NEXT ? ROWS ONLY";
        Connection conn = null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        try {
            conn = new DBConnect().getInstance().openConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, category_id);
            ps.setInt(2, pageIndex);
            ps.setInt(3, pageSize);
            ps.setInt(4, pageSize);
            ps.setInt(5, pageSize);
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
     
     
    public int countPageWhenFilterCategory(int categoryId,int pageSize) {
        Connection conn = null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        try {
            String query = "Select Count(*) from Products where category_id = ? ";

            conn = new DBConnect().getInstance().openConnection();

            ps = conn.prepareStatement(query);
            ps.setInt(1, categoryId);
            rs = ps.executeQuery();

            int count = 0;
            if (rs.next()) {
                count = rs.getInt(1);
            }
            int numOfPage = count / pageSize;
            if (count % pageSize != 0) {
                numOfPage++;
            }
            return numOfPage;
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
        return 0;
    }
}
