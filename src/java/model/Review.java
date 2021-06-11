/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Admin
 */
public class Review {
    private int id;
    private String username;
    private int product_id;
    private String content;
    private String created;

    public Review() {
    }
    public Review(int id, int product_id, String username, String content, String created) {
        this.id = id;
        this.username = username;
        this.product_id = product_id;
        this.content = content;
        this.created = created;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    @Override
    public String toString() {
        return "Review{" + "id=" + id + ", username=" + username + ", product_id=" + product_id + ", content=" + content + ", created=" + created + '}';
    }

    
    
   
    
    
    
    
}

