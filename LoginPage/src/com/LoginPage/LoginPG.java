package com.LoginPage;

import java.util.Scanner;

public class LoginPG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Login lg = new LoginPageClass();
        int ch;
        do {
            System.out.println("------------------ LOGIN/SIGN UP PAGE -----------------");
            System.out.println("\n1.SIGN UP\n2.LOGIN\n3.EXIT");
            System.out.print("Enter Your Choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("\n------------------ SIGN UP ---------------");
                    System.out.print("Enter Your Name: ");
                    String name = sc.next();
                    System.out.print("Enter Your Email Id: ");
                    String email = sc.next();
                    System.out.print("Enter Password: ");
                    String password = sc.next();
                    UserDetails ud = new UserDetails(name, email, password);
                    lg.signup(ud);
                    System.out.println("You Can Login Now!!");
                    break;
                case 2:
                    System.out.println("\n------------------ LOGIN ---------------");
                    System.out.print("Enter Your Email Id: ");
                    String emailId = sc.next();
                    System.out.print("Enter Password: ");
                    String pass = sc.next();
                    lg.login(emailId, pass);
                    break;
                case 3:
                    System.out.println("Thanks for using me!!!");
                    return;
                default:
                    System.out.println("Oops! Wrong Choice!!");
            }
        } while (ch != 0);
    }
}