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
public class Orders {
    private int id;
    private int user_id;
    private String customer;

    private double totalMoney;
    private Date created_at;
    
//    private int productId;
//    private String productName;
//    private String productImg;
//    private float productPrice;
//    private int productQuantity;
//    private int quantity;


    public Orders() {
    }

    public Orders(int id, int user_id, String customer, double totalMoney, Date created_at) {
        this.id = id;
        this.user_id = user_id;
        this.customer = customer;
        this.totalMoney = totalMoney;
        this.created_at = created_at;
    }



    

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

   

   

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(float totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    
    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    
    

   
//    @Override
//    public String toString() {
//        return "Orders{" + "id=" + id + ", user_id=" + user_id + ", customer_id=" + customer_id + ", totalMoney=" + totalMoney + ", created_at=" + created_at + '}';
//    }
//    
    
}
