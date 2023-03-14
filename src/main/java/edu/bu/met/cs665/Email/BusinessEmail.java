package edu.bu.met.cs665.Email;

/**
 * @Author: Zhuoran Xu
 * Created with IntelliJ IDEA.
 * Course: CS-665 Software Designs & Patterns
 * File name: null.java
 * @Date: 2023/03/12/15:59
 * @Description:
 */
public class BusinessEmail implements Email{

    @Override
    public String generateEmail() {

        String businessEmail = "Dear Business Customer, Thank you for your continued business...";
        System.out.println(businessEmail);
        return businessEmail;
    }
}
