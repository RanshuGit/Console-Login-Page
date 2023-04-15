package com.LoginPage;

import java.sql.*;
public class DBConnection {
    static Connection con;
    public static Connection createConnection() {
        //Database Name: mydb
        //Table Name: login(name, email, password)
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String user="root";
            String pass="";
            String url = "jdbc:mysql://localhost:3306/mydb?autoReconnect=true&useSSL=false";

            con= DriverManager.getConnection(url,user,pass);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }
}