package com.hello.api.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloServiceTest {

    @Test
    void getHello2() {
        HelloService helloService = new HelloService();

        Assertions.assertNotNull(helloService.getHello2());
    }
}