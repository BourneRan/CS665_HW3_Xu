package edu.bu.met.cs665.Email;

/**
 * @Author: Zhuoran Xu
 * Created with IntelliJ IDEA.
 * Course: CS-665 Software Designs & Patterns
 * File name: ReturningEmail.java
 * @Date: 2023/03/12/16:01
 * @Description:Define a subclass name "ReturningEmail" to generate specified types of email.
 */
public class ReturningEmail implements Email{
    @Override
    public String generateEmail() {

        String returningEmail = "Dear Returning Customer, Thank you for choosing us again...";
        System.out.println(returningEmail);
        return returningEmail;
    }
}
