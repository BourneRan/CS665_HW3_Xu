package edu.bu.met.cs665.Email;

/**
 * @Author: Zhuoran Xu
 * Created with IntelliJ IDEA.
 * Course: CS-665 Software Designs & Patterns
 * File name: VIPEmail.java
 * @Date: 2023/03/12/16:03
 * @Description:Define a subclass name "VIPEmail" to generate specified types of email.
 */
public class VIPEmail implements Email{
    @Override
    public String generateEmail() {
        String vipEmail = "Dear VIP Customer, We value your continued loyalty and would like to offer you an exclusive discount on your next purchase. Please contact our VIP customer service representative for more information...";
        System.out.println(vipEmail);
        return vipEmail;
    }
}
