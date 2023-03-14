package edu.bu.met.cs665;
import edu.bu.met.cs665.Email.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * @Author: Zhuoran Xu
 * Created with IntelliJ IDEA.
 * Course: CS-665 Software Designs & Patterns
 * File name: TestEmail.java
 * @Date: 2023/03/12/16:47
 * @Description: Junit Test for each email.
 */
public class TestEmail {
    @Test
    public void testEmail(){

        Email businessEmail = EmailFactory.createEmail("Business");
        String businessEmail_real = businessEmail.generateEmail();
        String businessEmail_original = "Dear Business Customer, Thank you for your continued business...";
        assertEquals(businessEmail_real, businessEmail_original);

        Email returningEmail = EmailFactory.createEmail("Returning");
        String returningEmail_real = returningEmail.generateEmail();
        String returningEmail_original = "Dear Returning Customer, Thank you for choosing us again...";
        assertEquals(returningEmail_original, returningEmail_real);

        Email frequentEmail = EmailFactory.createEmail("Frequent");
        String frequentEmail_real = frequentEmail.generateEmail();
        String frequentEmail_original = "Dear Frequent Customer, We appreciate your loyalty and would like to thank you for choosing us as your preferred provider...";
        assertEquals(frequentEmail_original, frequentEmail_real);

        Email newEmail = EmailFactory.createEmail("New");
        String newEmail_real = newEmail.generateEmail();
        String newEmail_original = "Dear New Customer, We would like to welcome you to our company and thank you for choosing us...";
        assertEquals(newEmail_original, newEmail_real);

        Email vipEmail = EmailFactory.createEmail("VIP");
        String vipEmail_real = vipEmail.generateEmail();
        String vipEmail_original = "Dear VIP Customer, We value your continued loyalty and would like to offer you an exclusive discount on your next purchase. Please contact our VIP customer service representative for more information...";
        assertEquals(vipEmail_original, vipEmail_real);

    }


}
