package com.ivoyant.controller_application.services_test;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ActiveProfiles("prod")
public class ProdTestClass {

    @Test
    public void testAddition() {
        int result = 5*6;
        assertEquals(5, result);
    }

    @Test
    public void testMultiplication() {
        int result = 8*8;
        assertEquals(9, result);
    }
}
