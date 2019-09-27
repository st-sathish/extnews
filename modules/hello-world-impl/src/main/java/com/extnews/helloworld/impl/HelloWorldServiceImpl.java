package com.extnews.helloworld.impl;

import com.extnews.helloworld.api.HelloWorldService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorldServiceImpl implements HelloWorldService {

    /** The module specific logger */
    private static final Logger logger = LoggerFactory.getLogger(HelloWorldServiceImpl.class);

    @Override
    public String helloWorld() {
        System.out.println("Hello World");
        return "Hello World";
    }

    @Override
    public String helloName(String name) {
        logger.info("Name is {}.", name);
        if ("".equals(name)) {
            return "Hello!";
        }
        return "Hello " + name + "!";
    }
}
