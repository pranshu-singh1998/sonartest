package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {

    @Test
    void testGreetWithName() {
        HelloWorld hw = new HelloWorld();
        assertEquals("Hello, John!", hw.greet("John"));
    }

    @Test
    void testGreetWithNull() {
        HelloWorld hw = new HelloWorld();
        assertEquals("Hello, World!", hw.greet(null));
    }
}
