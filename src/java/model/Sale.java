/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class Sale extends Product{
   private int product_id;
   private int discount;
   private float priced;

    public Sale() {
    }

    public Sale(int product_id, int discount, float priced) {
        this.product_id = product_id;
        this.discount = discount;
        this.priced=priced;
    }

    public Sale(int product_id, int discount, int priced, int id, String name, float price, int gender_id, int category_id, String title, String des, int amount, String image, String image1, String image2, Date date) {
        super(id, name, price, gender_id, category_id, title, des, amount, image, image1, image2, date);
        this.product_id = product_id;
        this.discount = discount;
        this.priced=priced;

    }

    public Sale(int product_id, int discount,int priced, String name, float price, int gender_id, int category_id, String title, String des, int amount, String image, String image1, String image2, Date date) {
        super(name, price, gender_id, category_id, title, des, amount, image, image1, image2, date);
        this.product_id = product_id;
        this.discount = discount;
        this.priced=priced;

    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public float getPriced() {
        return priced;
    }

    public void setPriced(float priced) {
        this.priced = priced;
    }
    
 public String toString() {
        return super.toString()+"  priced= "+this.priced; 
    }
    
}
