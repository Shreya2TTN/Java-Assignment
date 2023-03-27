package com.demo.service;
import junit.framework.TestCase;
import org.junit.*;
import com.demo.domain.Order;


public class OrderServiceTest extends TestCase
{
    @BeforeClass
    public void testBeforeClass() throws Exception
    {
        System.out.println("before class");
    }

    @Before
    public void testBefore() throws Exception
    {
        System.out.println("before");
    }
    @Test
    public void testgetInstance()
    {
        OrderService o1 = new OrderService();
        assertTrue(o1 instanceof OrderService);
    }
    @Test
    public void testPlaceOrderWithTwoParam_ReturnTrue()
    {
        Order order = new Order(5,"Shoes",6789.9);
        assertTrue(OrderService.getInstance().placeOrder(order , "Sparx"));

    }
    @After
    public void testAfter() throws Exception
    {
        System.out.println("After");
    }
    @AfterClass
    public void testAfterClass() throws Exception
    {
        System.out.println("After Class");
    }
}