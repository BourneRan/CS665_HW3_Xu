package edu.bu.met.cs665.Email;

/**
 * @Author: Zhuoran Xu
 * Created with IntelliJ IDEA.
 * Course: CS-665 Software Designs & Patterns
 * File name: EmailFactory.java
 * @Date: 2023/03/12/16:45
 * @Description: Define a factory named "EmailFactory" to create personalized emails for each email type.
 */
public class EmailFactory {
    public static Email createEmail(String customerType) {
        switch(customerType) {
            case "Business":
                return new BusinessEmail();
            case "Returning":
                return new ReturningEmail();
            case "Frequent":
                return new FrequentEmail();
            case "New":
                return new NewEmail();
            case "VIP":
                return new VIPEmail();
            default:
                throw new IllegalArgumentException("Invalid customer type: " + customerType);
        }
    }
}
