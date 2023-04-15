package com.LoginPage;

import java.sql.*;
interface Login {
    void signup(UserDetails ud);
    void login(String emailId, String pass);
}

class LoginPageClass implements Login {

    public void signup(UserDetails ud) {
        try {
            Connection con = DBConnection.createConnection();
            String query = "insert into login(name,email,password) values(?,?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1,ud.getName());
            pst.setString(2, ud.getEmail());
            pst.setString(3, ud.getPassword());
            pst.execute();
            con.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
    public void login(String emailId, String pass) {
        try {
            Connection con = DBConnection.createConnection();
            String query = "select * from login where email = ? and password = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, emailId);
            ps.setString(2, pass);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                System.out.println("Login Successful.");
                System.out.println("Hello "+rs.getString(1)+"!!\n");
            }
            else{
                System.out.println("Login Failed, Please Try Again!");
            }
            con.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}