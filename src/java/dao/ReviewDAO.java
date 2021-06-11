/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author Admin
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import db.DBConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Review;

/**
 *
 * @author tranv
 */
public class ReviewDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public void insert(Review review) {
        String sql = "INSERT INTO review(product_id, username,content,created) VALUES (?,?,?,?)";

        try {
            conn = new DBConnect().getInstance().openConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, review.getProduct_id());
            ps.setString(2, review.getUsername());
            ps.setString(3, review.getContent());
            ps.setString(4, review.getCreated());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(int id) {
        String sql = "DELETE FROM review WHERE id=?";
        try {
            conn = new DBConnect().getInstance().openConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Review> getAll() {
        List<Review> reviews = new ArrayList<Review>();
        String sql = "SELECT * FROM review";
        try {
            conn = new DBConnect().getInstance().openConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Review review = new Review();
                review.setId(rs.getInt("id"));
                review.setUsername(rs.getString("name"));
                review.setProduct_id(rs.getInt("product_id"));
                review.setContent(rs.getString("content"));
                review.setCreated(rs.getString("created"));
                reviews.add(review);
            }
        } catch (Exception e) {
        }
        return reviews;

    }

    public Review getReviewByReview_id(int id) {
        String sql = "SELECT * FROM review where id = ? ";
        try {
            conn = new DBConnect().getInstance().openConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                Review r = new Review(rs.getInt(1),
                         rs.getInt(2),
                         rs.getString(3),
                         rs.getString(4),
                         rs.getString(5));
                return r;
            }
        } catch (Exception e) {
        }
        return null;
    }

    public List<Review> getReviewById(int id) {
        List<Review> reviews = new ArrayList<Review>();
        String sql = "SELECT * FROM review WHERE product_id=?";
        try {
            conn = new DBConnect().getInstance().openConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                Review review = new Review();
                review.setId(rs.getInt("id"));
                review.setUsername(rs.getString("username"));
                review.setProduct_id(rs.getInt("product_id"));
                review.setContent(rs.getString("content"));
                review.setCreated(rs.getString("created"));
                reviews.add(review);
            }
        } catch (Exception e) {
        }

        return reviews;

    }

    public static void main(String[] args) {
        Review r = new Review(0, 1, "chien", "hay", "2021-02-11");
        ReviewDAO rdao = new ReviewDAO();
         rdao.insert(r);
//        System.out.println(r);
//        System.out.println(r.getProduct_id());
    }
    
}

