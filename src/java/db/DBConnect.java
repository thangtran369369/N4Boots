/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

/**
 *
 * @author Admin
 */
import java.sql.Connection;
import java.sql.DriverManager;
public class DBConnect implements DatabaseInfor{
    private static DBConnect instance;

    public DBConnect() {
    }

    public Connection openConnection() throws Exception {
        Class.forName(driverName);
        Connection con = DriverManager.getConnection(url, user, pass);
        return con;

    }

    //Get instance of dbms only one time
    public static DBConnect getInstance() {
        if (instance == null) {
            instance = new DBConnect();
        }
        return instance;
    }
}
