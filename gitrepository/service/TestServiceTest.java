package com.demo.service;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestServiceTest {
    @InjectMocks
    TestService testService;
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("before class");
    }


    @Test
    public void testFirstMethod() {
        assertEquals(1, testService.test());
    }
}