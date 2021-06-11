/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import db.DBConnect;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Product;
import model.Sale;

/**
 *
 * @author Admin
 */
public class SaleDAO {
    public ArrayList<Sale> getAllSale() {

        //Connect database
        ArrayList<Sale> list = new ArrayList<>();
        Connection con = null;
        DBConnect db = new DBConnect();

        try {
            con = db.openConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from sale");
            while (rs.next()) {
                Sale sale = new Sale();
                sale.setProduct_id(rs.getInt(1));
                sale.setDiscount(rs.getInt(2));
                list.add(sale);
            }
            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public List<Sale> getProductFromDis() {
        float priced=0;
        ProductDAO pdao = new ProductDAO();
        List<Sale> bl = new ArrayList<>();
        List<Product> listP = pdao.getAllProduct();
        List<Sale> listSale = getAllSale();
        for (Sale sale : listSale) {
            for (Product product : listP) {
                if (sale.getProduct_id() == product.getId()) {
                    priced = product.getPrice() - (float) (product.getPrice() * sale.getDiscount()) / 100;
                      sale.setPrice(product.getPrice());
                      sale.setName(product.getName());
                      sale.setDes(product.getDes());
                      sale.setTitle(product.getTitle());
                      sale.setAmount(product.getAmount());
                      sale.setImage(product.getImage());
                      sale.setImage1(product.getImage1());
                      sale.setImage2(product.getImage2());
                      sale.setDate(product.getDate());
                      sale.setCategory_id(product.getCategory_id());
                      sale.setGender_id(product.getGender_id());
                      sale.setPriced(priced);
                      sale.setId(product.getId());
//                    di.setPriced(price);
//                    di.setName(bo.getName());
//                    di.setAmount(bo.getAmount());
//                    di.setPrice(bo.getPrice());
//                    di.setDate(bo.getDate());
//                    di.setImage(bo.getImage());
//                    di.setDetail(bo.getDetail());
//                    di.setGender(bo.getGender());
//                    di.setStyle(bo.getStyle());
//                    di.setFeature(bo.getFeature());
                    bl.add(sale);
                }
            }
        }
        return bl;
    }
}
