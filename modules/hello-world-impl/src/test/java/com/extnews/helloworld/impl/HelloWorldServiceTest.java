package com.extnews.helloworld.impl;

//import com.extnews.helloworld.api.HelloWorldService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HelloWorldServiceTest {

    //private HelloWorldService service;

    /**
     * Setup for the Hello World Service
     */
    @Before
    public void setUp() {
        //service = new HelloWorldServiceImpl();
    }

    @Test
    public void testHelloWorld() throws Exception {
        //Assert.assertEquals("Hello World", service.helloWorld());
    }

    @Test
    public void testHelloNameEmpty() throws Exception {
        //Assert.assertEquals("Hello!", service.helloName(""));
    }

    @Test
    public void testHelloName() throws Exception {
        //Assert.assertEquals("Hello Johannes!", service.helloName("Johannes"));
    }
}
