package edu.bu.met.cs665.Email;

/**
 * @Author: Zhuoran Xu
 * Created with IntelliJ IDEA.
 * Course: CS-665 Software Designs & Patterns
 * File name: NewEmail.java
 * @Date: 2023/03/12/16:03
 * @Description: Define a subclass name "NewEmail" to generate specified types of email.
 */
public class NewEmail implements Email{
    @Override
    public String generateEmail() {

        String newEmail = "Dear New Customer, We would like to welcome you to our company and thank you for choosing us...";
        System.out.println(newEmail);
        return newEmail;
    }
}
