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
public class Product {
    private int id;
    private String name;
    private float price;
    private int gender_id;
    private int category_id;
    private String title;
    private String des;
    private int amount;
    private String image;
    private String image1; 
    private String image2;
    private Date date;

    public Product() {
    }

    public Product(int id, String name, float price, int gender_id, int category_id, String title, String des, int amount, String image, String image1, String image2, Date date) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.gender_id = gender_id;
        this.category_id = category_id;
        this.title = title;
        this.des = des;
        this.amount = amount;
        this.image = image;
        this.image1 = image1;
        this.image2 = image2;
        this.date = date;
    }

    public Product(String name, float price, int gender_id, int category_id, String title, String des, int amount, String image, String image1, String image2, Date date) {
        this.name = name;
        this.price = price;
        this.gender_id = gender_id;
        this.category_id = category_id;
        this.title = title;
        this.des = des;
        this.amount = amount;
        this.image = image;
        this.image1 = image1;
        this.image2 = image2;
        this.date = date;
    }
    

  
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGender_id() {
        return gender_id;
    }

    public void setGender_id(int gender_id) {
        this.gender_id = gender_id;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImage1() {
        return image1;
    }

    public void setImage1(String image1) {
        this.image1 = image1;
    }

    public String getImage2() {
        return image2;
    }

    public void setImage2(String image2) {
        this.image2 = image2;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", price=" + price + ", gender_id=" + gender_id + ", category_id=" + category_id + ", title=" + title + ", des=" + des + ", amount=" + amount + ", image=" + image + ", image1=" + image1 + ", image2=" + image2 + ", date=" + date + '}';
    }
    
    
}
