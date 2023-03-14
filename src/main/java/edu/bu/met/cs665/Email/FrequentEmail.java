package edu.bu.met.cs665.Email;

/**
 * @Author: Zhuoran Xu
 * Created with IntelliJ IDEA.
 * Course: CS-665 Software Designs & Patterns
 * File name: FrequentEmail.java
 * @Date: 2023/03/12/16:02
 * @Description:Define a subclass name "FrequentEmail" to generate specified types of email.
 */
public class FrequentEmail implements Email{
    @Override
    public String generateEmail() {
        String frequentEmail = "Dear Frequent Customer, We appreciate your loyalty and would like to thank you for choosing us as your preferred provider...";
        System.out.println(frequentEmail);
        return frequentEmail;
    }
}
