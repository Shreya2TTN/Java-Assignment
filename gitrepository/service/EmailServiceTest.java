
package com.demo.service;
import com.demo.domain.Order;
import org.junit.*;
import static org.junit.Assert.*;
public class EmailServiceTest
{
    @BeforeClass
    public static void setUpBeforeClass() throws Exception
    {
        System.out.println("Before class");
    }
    @Before
    public void testBefore() throws Exception
    {
        System.out.println("Before");
    }
    Order order = new Order(1, "Item1", 100);

    @Test(expected = RuntimeException.class)
    public void sendEmailTest(){
       EmailService.getInstance().sendEmail(order);

    }

    @Test
    public  void testEmailWithTwoParam_ReturnTrue()
    {
        assertTrue(EmailService.getInstance().sendEmail(new Order(), "a@.com"));
    }
    @Test
    public void getInstanceTest(){
        EmailService em=EmailService.getInstance();
        assertTrue(em instanceof EmailService);
    }
    @After
    public void testAfter() throws Exception
    {
        System.out.println("After");
    }

    @AfterClass
    public static void testAfterClass() throws Exception {
        System.out.println("After class");

    }

}