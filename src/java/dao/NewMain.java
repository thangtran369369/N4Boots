/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Category;
import model.Gender;
import model.Product;
import model.Sale;
import model.Users;

/**
 *
 * @author Admin
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        DAO dao=new DAO();
//        Account account=new Account();
////        account=dao.login("Admin", "123");
////        System.out.println(account.toString());
//        dao.signup("sb", "123", "thanh@gmail.com");
//        GenderDAO dao=new GenderDAO();
//        List<Product> list=dao.getAllProductByGender(1);
//        System.out.println(list.toString());
//         SaleDAO saleDAO=new SaleDAO();
//         List<Sale> list=saleDAO.getProductFromDis();
//         System.out.println(list.toString());
//      CategoryDAO categoryDAO=new CategoryDAO();
//      List<Product> c=categoryDAO.getAllProductByCategory(1, 2, 6);
//        for (Product product : c) {
//            System.out.println(product.toString());
//        }
//               SelectDAO sdao=new SelectDAO();
//               List<Product> listP=sdao.getAllProductByGender(1, "desc");
//               for (Product product : listP) {
//                       System.out.println(product.toString());   
//               }
       SignUpDAO s=new SignUpDAO();
       s.signup("thang", "123");
//      ProductDAO pdao=new ProductDAO();
//      List<Product> l=pdao.getAllProductByDesc();
//        System.out.println(l.toString());
    }
    
}
