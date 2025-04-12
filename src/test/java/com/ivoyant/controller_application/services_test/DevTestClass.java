package com.ivoyant.controller_application.services_test;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ActiveProfiles("dev")
public class DevTestClass {

    @Test
    public void testAddition() {
        int result = 2 + 2;
        assertEquals(4, result);
    }

    @Test
    public void testMultiplication() {
        int result = 3 * 3;
        assertEquals(9, result);
    }
}
